package com.example.ui.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.VolumeOff
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookFundamentals
import com.example.data.BookPage
import com.example.data.BookRepository
import com.example.data.PageType
import com.example.data.PreferencesManager
import com.example.service.SpeechHelper
import com.example.ui.components.CoverView
import com.example.ui.components.DialogView
import com.example.ui.components.ExerciseView
import com.example.ui.components.GrammarCard
import com.example.ui.components.PageHeader
import com.example.ui.components.PinyinView
import com.example.ui.components.QuizView
import com.example.ui.components.RadicalsView
import com.example.ui.components.ReadingView
import com.example.ui.components.StrokesView
import com.example.ui.components.TonesView
import com.example.ui.components.VocabCard
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialGold
import com.example.ui.theme.ImperialRed
import com.example.ui.theme.ParchmentCream
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    speechHelper: SpeechHelper,
    preferencesManager: PreferencesManager
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scrollState = rememberScrollState()

    var currentPageNum by remember { mutableIntStateOf(preferencesManager.lastPage) }
    var isAutoVoiceEnabled by remember { mutableStateOf(preferencesManager.isAutoVoiceEnabled) }
    var bookmarkedPages by remember { mutableStateOf(preferencesManager.getBookmarks()) }
    var showTranslatorSheet by remember { mutableStateOf(false) }
    var showJumpPageDialog by remember { mutableStateOf(false) }
    var jumpInputText by remember { mutableStateOf("") }

    val currentPage = remember(currentPageNum) {
        BookRepository.getPage(currentPageNum)
    }

    // Scroll to top and trigger auto-voice on page transition
    LaunchedEffect(currentPageNum) {
        preferencesManager.lastPage = currentPageNum
        scrollState.scrollTo(0)

        if (isAutoVoiceEnabled) {
            val textToSpeak = when (currentPage.type) {
                PageType.COVER -> currentPage.chapterZh
                PageType.VOCAB -> currentPage.words.firstOrNull()?.hanzi ?: currentPage.title
                PageType.DIALOG -> currentPage.dialogLines.firstOrNull()?.hanzi ?: currentPage.title
                PageType.READING -> currentPage.readingZh.ifEmpty { currentPage.title }
                else -> currentPage.title
            }
            speechHelper.speak(textToSpeak, isChinese = true)
        }
    }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            TocDrawer(
                currentPageNum = currentPageNum,
                bookmarkedPages = bookmarkedPages,
                onSelectPage = { selectedPage ->
                    currentPageNum = selectedPage
                    scope.launch { drawerState.close() }
                }
            )
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Column {
                            Text(
                                text = "Bab ${currentPage.chapterNum}: ${currentPage.chapterTitle}",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = ChineseInk,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Text(
                                text = "Hal. ${currentPage.pageInChapter}/${currentPage.totalInChapter} · ${currentPage.title}",
                                fontSize = 11.5.sp,
                                color = CharcoalMuted,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = { scope.launch { drawerState.open() } },
                            modifier = Modifier.testTag("menu_drawer_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Daftar Isi 200 Halaman",
                                tint = ChineseInk
                            )
                        }
                    },
                    actions = {
                        // Translator button
                        Button(
                            onClick = { showTranslatorSheet = true },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = ImperialRed,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier
                                .height(34.dp)
                                .testTag("open_translator_button")
                        ) {
                            Icon(
                                imageVector = Icons.Default.Translate,
                                contentDescription = null,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = "Terjemah", fontSize = 11.5.sp, fontWeight = FontWeight.Bold)
                        }

                        Spacer(modifier = Modifier.width(4.dp))

                        // Auto-voice toggle button
                        IconButton(
                            onClick = {
                                isAutoVoiceEnabled = !isAutoVoiceEnabled
                                preferencesManager.isAutoVoiceEnabled = isAutoVoiceEnabled
                                Toast.makeText(
                                    context,
                                    if (isAutoVoiceEnabled) "🔊 Suara Otomatis: AKTIF" else "🔇 Suara Otomatis: NONAKTIF",
                                    Toast.LENGTH_SHORT
                                ).show()
                            },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                imageVector = if (isAutoVoiceEnabled) Icons.Default.VolumeUp else Icons.Default.VolumeOff,
                                contentDescription = "Toggle Suara Otomatis",
                                tint = if (isAutoVoiceEnabled) ImperialRed else CharcoalMuted
                            )
                        }

                        // Stop speaking button
                        IconButton(
                            onClick = { speechHelper.stop() },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Stop,
                                contentDescription = "Hentikan Suara",
                                tint = CharcoalMuted
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.White
                    ),
                    modifier = Modifier.shadow(2.dp)
                )
            },
            bottomBar = {
                // Bottom Page Navigator
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .border(1.dp, BorderParchment)
                        .navigationBarsPadding()
                        .padding(horizontal = 16.dp, vertical = 10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Previous button
                        OutlinedButton(
                            onClick = {
                                if (currentPageNum > 1) currentPageNum--
                            },
                            enabled = currentPageNum > 1,
                            shape = RoundedCornerShape(8.dp),
                            border = ButtonDefaults.outlinedButtonBorder,
                            modifier = Modifier.testTag("prev_page_button")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = "Sebelumnya", fontSize = 12.sp)
                        }

                        // Page indicator chip (clickable to jump)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(16.dp))
                                    .background(CardBackgroundAlt)
                                    .border(1.dp, BorderParchment, RoundedCornerShape(16.dp))
                                    .clickable {
                                        jumpInputText = currentPageNum.toString()
                                        showJumpPageDialog = true
                                    }
                                    .padding(horizontal = 10.dp, vertical = 6.dp)
                            ) {
                                Text(
                                    text = "$currentPageNum / ${BookRepository.totalPages}",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = ChineseInk
                                )
                            }

                            Spacer(modifier = Modifier.width(6.dp))

                            // Bookmark toggle button
                            IconButton(
                                onClick = {
                                    val isBookmarked = preferencesManager.toggleBookmark(currentPageNum)
                                    bookmarkedPages = preferencesManager.getBookmarks()
                                    Toast.makeText(
                                        context,
                                        if (isBookmarked) "⭐ Halaman $currentPageNum disimpan" else "Halaman $currentPageNum dihapus dari simpanan",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                },
                                modifier = Modifier.size(32.dp)
                            ) {
                                Icon(
                                    imageVector = if (bookmarkedPages.contains(currentPageNum)) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                                    contentDescription = "Simpan Halaman",
                                    tint = if (bookmarkedPages.contains(currentPageNum)) ImperialGold else CharcoalMuted,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }

                        // Next button
                        Button(
                            onClick = {
                                if (currentPageNum < BookRepository.totalPages) currentPageNum++
                            },
                            enabled = currentPageNum < BookRepository.totalPages,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = ImperialRed,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier.testTag("next_page_button")
                        ) {
                            Text(text = "Berikutnya", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(ParchmentCream)
                    .padding(paddingValues),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .widthIn(max = 680.dp)
                        .verticalScroll(scrollState)
                        .padding(horizontal = 14.dp, vertical = 14.dp)
                ) {
                    // White Reading Card (Buku Halaman)
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .background(Color.White)
                            .border(1.dp, BorderParchment, RoundedCornerShape(14.dp))
                            .shadow(3.dp, RoundedCornerShape(14.dp))
                            .padding(18.dp)
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            // Page header (chapter, badge, titles)
                            if (currentPage.type != PageType.COVER) {
                                PageHeader(page = currentPage)
                            }

                            // Dynamic Page Content by Type
                            when (currentPage.type) {
                                PageType.COVER -> {
                                    CoverView(page = currentPage)
                                }

                                PageType.PINYIN -> {
                                    PinyinView(onSpeak = { speechHelper.speak(it, isChinese = true) })
                                }

                                PageType.TONES -> {
                                    TonesView(onSpeak = { speechHelper.speak(it, isChinese = true) })
                                }

                                PageType.RADICALS -> {
                                    RadicalsView(onSpeak = { speechHelper.speak(it, isChinese = true) })
                                }

                                PageType.STROKES -> {
                                    StrokesView(onSpeak = { speechHelper.speak(it, isChinese = true) })
                                }

                                PageType.VOCAB -> {
                                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                                        currentPage.words.forEach { word ->
                                            VocabCard(
                                                word = word,
                                                onSpeakWord = { speechHelper.speak(it, isChinese = true) },
                                                onSpeakSentence = { speechHelper.speak(it, isChinese = true) }
                                            )
                                        }
                                    }
                                }

                                PageType.GRAMMAR -> {
                                    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                                        currentPage.grammarItems.forEach { item ->
                                            GrammarCard(
                                                item = item,
                                                onSpeak = { speechHelper.speak(it, isChinese = true) }
                                            )
                                        }
                                    }
                                }

                                PageType.DIALOG -> {
                                    DialogView(
                                        page = currentPage,
                                        onSpeak = { speechHelper.speak(it, isChinese = true) }
                                    )
                                }

                                PageType.READING -> {
                                    ReadingView(
                                        page = currentPage,
                                        onSpeak = { speechHelper.speak(it, isChinese = true) }
                                    )
                                }

                                PageType.EXERCISE -> {
                                    ExerciseView(page = currentPage)
                                }

                                PageType.QUIZ -> {
                                    QuizView(
                                        page = currentPage,
                                        onSpeak = { speechHelper.speak(it, isChinese = true) },
                                        onScoreSaved = { score ->
                                            preferencesManager.saveQuizScore(currentPage.chapterNum, score)
                                        }
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Book Footer
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Mandarin Pasti Bisa • 200 Halaman",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = ImperialRed
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Karya: ${BookFundamentals.AUTHOR}",
                            fontSize = 11.sp,
                            color = CharcoalMuted,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = BookFundamentals.APP_TAGLINE,
                            fontSize = 10.5.sp,
                            color = CharcoalMuted.copy(alpha = 0.8f),
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
        }
    }

    // Jump to Page Dialog
    if (showJumpPageDialog) {
        AlertDialog(
            onDismissRequest = { showJumpPageDialog = false },
            title = {
                Text(
                    text = "Lompat ke Halaman",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = ChineseInk
                )
            },
            text = {
                Column {
                    Text(
                        text = "Masukkan nomor halaman (1 sampai ${BookRepository.totalPages}):",
                        fontSize = 13.sp,
                        color = CharcoalMuted
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        value = jumpInputText,
                        onValueChange = { jumpInputText = it.filter { ch -> ch.isDigit() } },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = { Text("Contoh: 45") }
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        val num = jumpInputText.toIntOrNull()
                        if (num != null && num in 1..BookRepository.totalPages) {
                            currentPageNum = num
                            showJumpPageDialog = false
                        } else {
                            Toast.makeText(context, "Halaman harus antara 1 dan ${BookRepository.totalPages}", Toast.LENGTH_SHORT).show()
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = ImperialRed)
                ) {
                    Text("Buka Halaman")
                }
            },
            dismissButton = {
                TextButton(onClick = { showJumpPageDialog = false }) {
                    Text("Batal", color = CharcoalMuted)
                }
            }
        )
    }

    // Translator Sheet
    if (showTranslatorSheet) {
        TranslatorSheet(
            speechHelper = speechHelper,
            onDismiss = { showTranslatorSheet = false }
        )
    }
}
