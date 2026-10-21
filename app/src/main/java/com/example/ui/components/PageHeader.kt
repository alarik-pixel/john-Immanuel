package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookPage
import com.example.data.BookRepository
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ImperialGold
import com.example.ui.theme.ImperialRed

@Composable
fun PageHeader(page: BookPage, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        // Red-Gold decorative header stripe
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(ImperialRed, ImperialGold)
                    )
                )
        )

        Spacer(modifier = Modifier.height(14.dp))

        // Top info row: Chapter indicator & page badge
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "BAB ${page.chapterNum} · HALAMAN ${page.pageInChapter}/${page.totalInChapter}",
                    color = ImperialRed,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp
                )
                Text(
                    text = "${page.chapterIcon} ${page.chapterTitle} (${page.chapterZh})",
                    color = CharcoalMuted,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            Box(
                modifier = Modifier
                    .background(Color(0xFFFAF6F0), RoundedCornerShape(16.dp))
                    .padding(horizontal = 10.dp, vertical = 4.dp)
            ) {
                Text(
                    text = "Hal. ${page.globalPageNum} / ${BookRepository.totalPages}",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = CharcoalMuted
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Page title
        Text(
            text = page.title,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 22.sp,
                lineHeight = 28.sp
            ),
            color = MaterialTheme.colorScheme.onSurface
        )

        if (page.subtitle.isNotEmpty()) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = page.subtitle,
                style = MaterialTheme.typography.bodyMedium,
                color = CharcoalMuted,
                fontSize = 13.5.sp
            )
        }

        Spacer(modifier = Modifier.height(14.dp))
    }
}
