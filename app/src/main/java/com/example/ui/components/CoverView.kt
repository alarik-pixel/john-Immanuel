package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookFundamentals
import com.example.data.BookPage
import com.example.ui.theme.AmberLight
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialGold
import com.example.ui.theme.ImperialRed
import com.example.ui.theme.JadeGreen

@Composable
fun CoverView(
    page: BookPage,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Big Chapter Icon Emoji
        Text(
            text = page.chapterIcon,
            fontSize = 72.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Large Chinese Character Title
        Text(
            text = page.chapterZh,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            color = ImperialRed,
            letterSpacing = 4.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(6.dp))

        // Indonesian Title
        Text(
            text = "Bab ${page.chapterNum}: ${page.chapterTitle}",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = ChineseInk,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = page.subtitle.ifEmpty { "10 Halaman Pembelajaran Komprehensif" },
            fontSize = 13.5.sp,
            color = CharcoalMuted,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(18.dp))

        // Learning Objectives (Tujuan Pembelajaran) Card
        if (page.goals.isNotEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(CardBackgroundAlt)
                    .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = "📌 Target Capaian Pembelajaran",
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = ImperialRed
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    page.goals.forEach { goal ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 3.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Text(
                                text = "✓",
                                color = JadeGreen,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 14.sp
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = goal,
                                fontSize = 13.sp,
                                color = ChineseInk.copy(alpha = 0.9f),
                                lineHeight = 19.sp
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        HorizontalDivider(thickness = 1.dp, color = BorderParchment)
        Spacer(modifier = Modifier.height(14.dp))

        // Author Attribution box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .background(AmberLight)
                .border(1.dp, ImperialGold.copy(alpha = 0.4f), RoundedCornerShape(8.dp))
                .padding(vertical = 10.dp, horizontal = 14.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Buku Karya:",
                    fontSize = 11.sp,
                    color = CharcoalMuted
                )
                Text(
                    text = BookFundamentals.AUTHOR,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = ImperialRed
                )
                Text(
                    text = BookFundamentals.APP_TAGLINE,
                    fontSize = 11.sp,
                    color = CharcoalMuted
                )
            }
        }
    }
}
