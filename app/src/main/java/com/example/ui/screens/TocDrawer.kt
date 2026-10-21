package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookFundamentals
import com.example.data.BookRepository
import com.example.ui.theme.AmberLight
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.DarkRed
import com.example.ui.theme.ImperialGold
import com.example.ui.theme.ImperialRed

@Composable
fun TocDrawer(
    currentPageNum: Int,
    bookmarkedPages: Set<Int>,
    onSelectPage: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var searchQuery by remember { mutableStateOf("") }
    var filterBookmarksOnly by remember { mutableStateOf(false) }

    // Map to keep track of expanded chapters: mapOf(chapterNum -> isExpanded)
    val expandedChapters = remember {
        mutableStateMapOf<Int, Boolean>().apply {
            // Default expand the chapter of the current page
            val currentCh = BookRepository.getPage(currentPageNum).chapterNum
            put(currentCh, true)
        }
    }

    val totalPages = BookRepository.totalPages
    val progressPct = ((currentPageNum.toFloat() / totalPages) * 100).toInt()

    Column(
        modifier = modifier
            .fillMaxHeight()
            .width(320.dp)
            .background(Color.White)
    ) {
        // App / Author Banner Header
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(horizontal = 16.dp, vertical = 14.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .clip(RoundedCornerShape(9.dp))
                        .background(
                            Brush.linearGradient(
                                colors = listOf(ImperialRed, DarkRed)
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "中",
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 18.sp
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = "Mandarin Pasti Bisa",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = ChineseInk
                    )
                    Text(
                        text = "200 Halaman · Voice · Bergambar",
                        fontSize = 10.5.sp,
                        color = CharcoalMuted
                    )
                    Text(
                        text = "oleh ${BookFundamentals.AUTHOR}",
                        fontSize = 10.5.sp,
                        color = ImperialGold,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Reading Progress Indicator
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Halaman $currentPageNum / $totalPages",
                    fontSize = 11.5.sp,
                    color = CharcoalMuted,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "$progressPct%",
                    fontSize = 11.5.sp,
                    color = ImperialRed,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            // Progress bar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
                    .clip(RoundedCornerShape(99.dp))
                    .background(Color(0xFFF0E8DB))
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(fraction = (currentPageNum.toFloat() / totalPages).coerceIn(0f, 1f))
                        .height(5.dp)
                        .clip(RoundedCornerShape(99.dp))
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(ImperialRed, ImperialGold)
                            )
                        )
                )
            }
        }

        HorizontalDivider(thickness = 1.dp, color = BorderParchment)

        // Search & Filter controls
        Column(modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                placeholder = { Text("Cari bab, topik, atau kata...", fontSize = 12.sp) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp),
                        tint = CharcoalMuted
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(modifier = Modifier.height(6.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(if (!filterBookmarksOnly) ImperialRed else CardBackgroundAlt)
                        .clickable { filterBookmarksOnly = false }
                        .padding(horizontal = 10.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "Semua (200)",
                        fontSize = 11.sp,
                        color = if (!filterBookmarksOnly) Color.White else CharcoalMuted,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Spacer(modifier = Modifier.width(6.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(if (filterBookmarksOnly) ImperialRed else CardBackgroundAlt)
                        .clickable { filterBookmarksOnly = true }
                        .padding(horizontal = 10.dp, vertical = 4.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Bookmark,
                            contentDescription = null,
                            tint = if (filterBookmarksOnly) Color.White else ImperialGold,
                            modifier = Modifier.size(13.dp)
                        )
                        Spacer(modifier = Modifier.width(3.dp))
                        Text(
                            text = "Tersimpan (${bookmarkedPages.size})",
                            fontSize = 11.sp,
                            color = if (filterBookmarksOnly) Color.White else CharcoalMuted,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }

        HorizontalDivider(thickness = 0.8.dp, color = BorderParchment)

        // Chapter & Pages List
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            val chapters = BookRepository.chapters

            items(chapters) { ch ->
                val isExpanded = expandedChapters[ch.number] == true
                val allChPages = BookRepository.getAllPages().subList(ch.startPage - 1, ch.endPage)

                val filteredPages = allChPages.filter { p ->
                    val matchesBookmark = !filterBookmarksOnly || bookmarkedPages.contains(p.globalPageNum)
                    val matchesQuery = searchQuery.isBlank() ||
                            p.title.contains(searchQuery, ignoreCase = true) ||
                            ch.title.contains(searchQuery, ignoreCase = true) ||
                            p.subtitle.contains(searchQuery, ignoreCase = true) ||
                            p.words.any { it.hanzi.contains(searchQuery) || it.indonesian.contains(searchQuery, ignoreCase = true) }

                    matchesBookmark && matchesQuery
                }

                if (filteredPages.isNotEmpty()) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        // Chapter Accordion Header
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    expandedChapters[ch.number] = !isExpanded
                                }
                                .padding(horizontal = 14.dp, vertical = 9.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(ImperialRed),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "${ch.number}",
                                    color = Color.White,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Spacer(modifier = Modifier.width(10.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "${ch.icon} ${ch.title}",
                                    fontSize = 12.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = ChineseInk,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Text(
                                    text = "${ch.zh} • Hal ${ch.startPage}-${ch.endPage}",
                                    fontSize = 10.5.sp,
                                    color = CharcoalMuted
                                )
                            }

                            Icon(
                                imageVector = if (isExpanded) Icons.Default.ExpandMore else Icons.Default.ChevronRight,
                                contentDescription = null,
                                tint = CharcoalMuted,
                                modifier = Modifier.size(20.dp)
                            )
                        }

                        // Child Pages
                        AnimatedVisibility(visible = isExpanded || searchQuery.isNotBlank()) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color(0xFFFDFAF5))
                            ) {
                                filteredPages.forEach { pg ->
                                    val isCurrent = pg.globalPageNum == currentPageNum
                                    val isBookmarked = bookmarkedPages.contains(pg.globalPageNum)

                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onSelectPage(pg.globalPageNum) }
                                            .background(if (isCurrent) Color.White else Color.Transparent)
                                            .padding(start = 48.dp, end = 16.dp, top = 7.dp, bottom = 7.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Row(
                                            modifier = Modifier.weight(1f),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            if (isBookmarked) {
                                                Icon(
                                                    imageVector = Icons.Default.Bookmark,
                                                    contentDescription = null,
                                                    tint = ImperialGold,
                                                    modifier = Modifier
                                                        .size(13.dp)
                                                        .padding(end = 3.dp)
                                                )
                                            }
                                            Text(
                                                text = pg.title,
                                                fontSize = 12.sp,
                                                fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Normal,
                                                color = if (isCurrent) ImperialRed else ChineseInk,
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis
                                            )
                                        }

                                        Text(
                                            text = "${pg.globalPageNum}",
                                            fontSize = 10.5.sp,
                                            color = if (isCurrent) ImperialRed else CharcoalMuted.copy(alpha = 0.6f),
                                            fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Normal
                                        )
                                    }
                                }
                            }
                        }

                        HorizontalDivider(
                            thickness = 0.5.dp,
                            color = BorderParchment.copy(alpha = 0.5f)
                        )
                    }
                }
            }
        }
    }
}
