package com.example.ui.screens

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.speech.RecognizerIntent
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.service.SpeechHelper
import com.example.service.TranslationResult
import com.example.service.TranslatorService
import com.example.ui.theme.AmberLight
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialGold
import com.example.ui.theme.ImperialRed
import com.example.ui.theme.PorcelainBlue
import com.example.ui.theme.PorcelainBlueBg
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun TranslatorSheet(
    speechHelper: SpeechHelper,
    onDismiss: () -> Unit
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    var isIdToZh by remember { mutableStateOf(true) }
    var inputText by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
    var translationResult by remember { mutableStateOf<TranslationResult?>(null) }
    var autoSpeak by remember { mutableStateOf(true) }

    // Speech-to-Text launcher
    val speechRecognizerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val spokenText = result.data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)?.firstOrNull()
            if (!spokenText.isNullOrBlank()) {
                inputText = spokenText
            }
        }
    }

    fun startVoiceInput() {
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
            putExtra(RecognizerIntent.EXTRA_LANGUAGE, if (isIdToZh) "id-ID" else "zh-CN")
            putExtra(RecognizerIntent.EXTRA_PROMPT, if (isIdToZh) "Silakan bicara dalam Bahasa Indonesia..." else "请说中文...")
        }
        try {
            speechRecognizerLauncher.launch(intent)
        } catch (e: Exception) {
            Toast.makeText(context, "Input suara tidak didukung pada perangkat ini", Toast.LENGTH_SHORT).show()
        }
    }

    fun executeTranslation(textToTranslate: String = inputText) {
        if (textToTranslate.isBlank()) return
        isLoading = true
        scope.launch {
            val res = TranslatorService.translate(textToTranslate, isIdToZh)
            isLoading = false
            res.onSuccess { tr ->
                translationResult = tr
                if (autoSpeak) {
                    if (isIdToZh) {
                        speechHelper.speak(tr.chinese, isChinese = true)
                    } else {
                        speechHelper.speak(tr.indonesian, isChinese = false)
                    }
                }
            }.onFailure { err ->
                Toast.makeText(context, "Gagal menerjemahkan: ${err.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        containerColor = Color.White,
        dragHandle = null
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            // Header bar
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(AmberLight)
                        .border(1.dp, BorderParchment, RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "🌐", fontSize = 20.sp)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Penerjemah Mandarin ↔ Indonesia",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = ChineseInk
                    )
                    Text(
                        text = "Dilengkapi Hanzi, Pinyin & Suara Penutur Asli",
                        fontSize = 11.5.sp,
                        color = CharcoalMuted
                    )
                }

                IconButton(onClick = onDismiss) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Tutup",
                        tint = CharcoalMuted
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Direction Selector Pill Box
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(24.dp))
                    .background(CardBackgroundAlt)
                    .border(1.dp, BorderParchment, RoundedCornerShape(24.dp))
                    .padding(4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(20.dp))
                        .background(if (isIdToZh) ImperialRed else Color.Transparent)
                        .clickable { isIdToZh = true }
                        .padding(vertical = 8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "🇮🇩 Indonesia",
                        color = if (isIdToZh) Color.White else ChineseInk,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                IconButton(
                    onClick = {
                        isIdToZh = !isIdToZh
                        val oldResult = translationResult
                        if (oldResult != null) {
                            inputText = if (isIdToZh) oldResult.indonesian else oldResult.chinese
                        }
                    },
                    modifier = Modifier.size(36.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.SwapHoriz,
                        contentDescription = "Tukar Bahasa",
                        tint = ImperialRed
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(20.dp))
                        .background(if (!isIdToZh) ImperialRed else Color.Transparent)
                        .clickable { isIdToZh = false }
                        .padding(vertical = 8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "🇨🇳 Mandarin",
                        color = if (!isIdToZh) Color.White else ChineseInk,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Text Input Box
            OutlinedTextField(
                value = inputText,
                onValueChange = { inputText = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp),
                placeholder = {
                    Text(
                        text = if (isIdToZh) "Ketik kalimat Bahasa Indonesia... atau klik 🎤" else "在此输入中文句子...",
                        color = CharcoalMuted.copy(alpha = 0.7f),
                        fontSize = 14.sp
                    )
                },
                shape = RoundedCornerShape(12.dp)
            )

            Spacer(modifier = Modifier.height(6.dp))

            // Input utilities row
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "${inputText.length} karakter",
                    fontSize = 11.5.sp,
                    color = CharcoalMuted
                )

                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(
                        onClick = { startVoiceInput() },
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Mic,
                            contentDescription = "Input Suara",
                            tint = ImperialRed
                        )
                    }

                    if (inputText.isNotEmpty()) {
                        IconButton(
                            onClick = {
                                speechHelper.speak(inputText, isChinese = !isIdToZh)
                            },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.VolumeUp,
                                contentDescription = "Dengar Input",
                                tint = CharcoalMuted
                            )
                        }

                        IconButton(
                            onClick = {
                                inputText = ""
                                translationResult = null
                            },
                            modifier = Modifier.size(36.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Clear,
                                contentDescription = "Hapus Teks",
                                tint = CharcoalMuted
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Action Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = { executeTranslation() },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ImperialRed,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(10.dp),
                    enabled = !isLoading && inputText.isNotBlank()
                ) {
                    if (isLoading) {
                        CircularProgressIndicator(
                            color = Color.White,
                            modifier = Modifier.size(18.dp),
                            strokeWidth = 2.dp
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                    } else {
                        Icon(
                            imageVector = Icons.Default.Translate,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                    }
                    Text(
                        text = if (isLoading) "Menerjemahkan..." else "Terjemahkan",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "🔊 Auto-baca",
                        fontSize = 12.sp,
                        color = CharcoalMuted
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Switch(
                        checked = autoSpeak,
                        onCheckedChange = { autoSpeak = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = Color.White,
                            checkedTrackColor = ImperialRed
                        )
                    )
                }
            }

            // Quick Phrase Suggestions
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "⚡ Contoh Frasa Praktis:",
                fontSize = 11.5.sp,
                fontWeight = FontWeight.SemiBold,
                color = CharcoalMuted
            )
            Spacer(modifier = Modifier.height(6.dp))
            val samplePhrases = if (isIdToZh) {
                listOf("Halo, apa kabar?", "Berapa harganya?", "Toilet di mana?", "Terima kasih banyak", "Bisa diskon sedikit?")
            } else {
                listOf("你好吗？", "多少钱？", "洗手间在哪儿？", "太贵了！", "新年快乐！")
            }
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                samplePhrases.forEach { phrase ->
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(16.dp))
                            .background(CardBackgroundAlt)
                            .border(1.dp, BorderParchment, RoundedCornerShape(16.dp))
                            .clickable {
                                inputText = phrase
                                executeTranslation(phrase)
                            }
                            .padding(horizontal = 10.dp, vertical = 5.dp)
                    ) {
                        Text(text = phrase, fontSize = 11.5.sp, color = ChineseInk)
                    }
                }
            }

            // Translation Result Card
            if (translationResult != null) {
                val res = translationResult!!
                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.White)
                        .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                        .padding(16.dp)
                ) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "🈶 Hasil Terjemahan (${res.provider})",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = ImperialRed
                            )
                            IconButton(
                                onClick = {
                                    val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                    val clip = ClipData.newPlainText("Terjemahan", "${res.chinese}\n${res.pinyin}\n${res.indonesian}")
                                    clipboard.setPrimaryClip(clip)
                                    Toast.makeText(context, "✅ Berhasil disalin ke clipboard", Toast.LENGTH_SHORT).show()
                                },
                                modifier = Modifier.size(28.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.ContentCopy,
                                    contentDescription = "Salin Teks",
                                    tint = CharcoalMuted,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        // Large Chinese Output
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))
                                .background(CardBackgroundAlt)
                                .border(1.dp, BorderParchment, RoundedCornerShape(8.dp))
                                .clickable { speechHelper.speak(res.chinese, isChinese = true) }
                                .padding(12.dp)
                        ) {
                            Column {
                                Text(
                                    text = res.chinese,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = ChineseInk,
                                    lineHeight = 30.sp
                                )
                                if (res.pinyin.isNotEmpty()) {
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = res.pinyin,
                                        fontSize = 13.5.sp,
                                        color = ImperialRed,
                                        fontStyle = FontStyle.Italic
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        // Indonesian output
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))
                                .background(PorcelainBlueBg)
                                .border(1.dp, PorcelainBlue.copy(alpha = 0.3f), RoundedCornerShape(8.dp))
                                .clickable { speechHelper.speak(res.indonesian, isChinese = false) }
                                .padding(12.dp)
                        ) {
                            Text(
                                text = res.indonesian,
                                fontSize = 14.sp,
                                color = PorcelainBlue,
                                lineHeight = 20.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        // Audio Action Buttons
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Button(
                                onClick = { speechHelper.speak(res.chinese, isChinese = true) },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = ImperialRed,
                                    contentColor = Color.White
                                ),
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.VolumeUp,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(text = "Baca Mandarin", fontSize = 12.sp)
                            }

                            Button(
                                onClick = { speechHelper.speak(res.indonesian, isChinese = false) },
                                colors = ButtonDefaults.outlinedButtonColors(
                                    contentColor = ChineseInk
                                ),
                                border = ButtonDefaults.outlinedButtonBorder,
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.VolumeUp,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(text = "Baca Indonesia", fontSize = 12.sp)
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}
