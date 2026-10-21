package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookPage
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialGold
import com.example.ui.theme.ImperialRed
import com.example.ui.theme.PorcelainBlue
import com.example.ui.theme.PorcelainBlueBg

@Composable
fun ReadingView(
    page: BookPage,
    onSpeak: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        // Hero banner
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(
                    Brush.linearGradient(
                        colors = listOf(ImperialRed, ImperialGold)
                    )
                )
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = page.sceneIcon.ifEmpty { "📖" }, fontSize = 48.sp)
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = page.readingZh.ifEmpty { page.title },
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 2.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Main Chinese Reading Passage Card
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(CardBackgroundAlt)
                .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                .padding(16.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "📖 Teks Bacaan (Klik teks untuk mendengar)",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = CharcoalMuted,
                        modifier = Modifier.weight(1f)
                    )
                    IconButton(
                        onClick = { onSpeak(page.readingText) },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.VolumeUp,
                            contentDescription = "Dengarkan seluruh bacaan",
                            tint = ImperialRed,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = page.readingText,
                    fontSize = 16.sp,
                    lineHeight = 28.sp,
                    fontWeight = FontWeight.Normal,
                    color = ChineseInk,
                    modifier = Modifier.clickable { onSpeak(page.readingText) }
                )

                if (page.readingPinyin.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = page.readingPinyin,
                        fontSize = 12.5.sp,
                        fontStyle = FontStyle.Italic,
                        color = ImperialRed,
                        lineHeight = 20.sp
                    )
                }
            }
        }

        // Indonesian translation
        if (page.readingIndo.isNotEmpty()) {
            Spacer(modifier = Modifier.height(12.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .width(4.dp)
                                .height(16.dp)
                                .background(PorcelainBlue, RoundedCornerShape(2.dp))
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Terjemahan Bahasa Indonesia",
                            fontSize = 13.5.sp,
                            fontWeight = FontWeight.Bold,
                            color = ChineseInk
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = page.readingIndo,
                        fontSize = 13.sp,
                        color = ChineseInk.copy(alpha = 0.85f),
                        lineHeight = 20.sp
                    )
                }
            }
        }

        // Cultural note
        if (page.readingNote.isNotEmpty()) {
            Spacer(modifier = Modifier.height(12.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(PorcelainBlueBg)
                    .border(1.dp, PorcelainBlue.copy(alpha = 0.3f), RoundedCornerShape(12.dp))
                    .padding(14.dp)
            ) {
                Column {
                    Text(
                        text = "💡 Catatan Wawasan Budaya",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = PorcelainBlue
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = page.readingNote,
                        fontSize = 12.5.sp,
                        color = PorcelainBlue.copy(alpha = 0.9f),
                        lineHeight = 18.sp
                    )
                }
            }
        }
    }
}
