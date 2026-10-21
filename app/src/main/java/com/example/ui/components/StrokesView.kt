package com.example.ui.components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookFundamentals
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialRed

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun StrokesView(
    onSpeak: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedChar by remember { mutableStateOf(BookFundamentals.STROKE_CHARS.first()) }

    Column(modifier = modifier.fillMaxWidth()) {
        // Rules Section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                .padding(14.dp)
        ) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .width(4.dp)
                            .height(16.dp)
                            .background(ImperialRed, RoundedCornerShape(2.dp))
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "7 Kaidah Baku Urutan Goresan Hanzi (笔顺)",
                        fontSize = 14.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = ChineseInk
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                BookFundamentals.STROKE_RULES.forEach { rule ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .background(ImperialRed),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "${rule.number}",
                                color = Color.White,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = rule.title,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = ChineseInk
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "• ${rule.demo}",
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = ImperialRed
                                )
                            }
                            Text(
                                text = rule.description,
                                fontSize = 12.sp,
                                color = CharcoalMuted
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Interactive Tianzige Grid (田字格) Character Preview
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(CardBackgroundAlt)
                .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                .padding(16.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Latihan Visual Huruf di Buku Kotak (田字格)",
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.Bold,
                    color = ChineseInk
                )
                Text(
                    text = "Klik karakter di bawah untuk melihat di kotak panduan.",
                    fontSize = 12.sp,
                    color = CharcoalMuted
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Tianzige Canvas with character overlay
                Box(
                    modifier = Modifier
                        .size(140.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White)
                        .border(1.5.dp, BorderParchment, RoundedCornerShape(8.dp))
                        .clickable { onSpeak(selectedChar.hanzi) },
                    contentAlignment = Alignment.Center
                ) {
                    Canvas(modifier = Modifier.size(140.dp)) {
                        val strokeWidth = 1.dp.toPx()
                        val dashEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 6f), 0f)
                        val gridColor = Color(0xFFE8DCC9)

                        // Vertical dashed center line
                        drawLine(
                            color = gridColor,
                            start = Offset(size.width / 2, 0f),
                            end = Offset(size.width / 2, size.height),
                            strokeWidth = strokeWidth,
                            pathEffect = dashEffect
                        )
                        // Horizontal dashed center line
                        drawLine(
                            color = gridColor,
                            start = Offset(0f, size.height / 2),
                            end = Offset(size.width, size.height / 2),
                            strokeWidth = strokeWidth,
                            pathEffect = dashEffect
                        )
                    }

                    Text(
                        text = selectedChar.hanzi,
                        fontSize = 84.sp,
                        fontWeight = FontWeight.Bold,
                        color = ImperialRed
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "${selectedChar.hanzi} • ${selectedChar.pinyin} (${selectedChar.indonesian})",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = ImperialRed
                )
                Text(
                    text = "Ketuk kotak untuk mendengarkan suara 🔊",
                    fontSize = 11.5.sp,
                    color = CharcoalMuted
                )

                Spacer(modifier = Modifier.height(14.dp))

                // Selector grid of 12 basic characters
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    BookFundamentals.STROKE_CHARS.forEach { ch ->
                        val isSelected = selectedChar.hanzi == ch.hanzi
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(if (isSelected) ImperialRed else Color.White)
                                .border(
                                    1.dp,
                                    if (isSelected) ImperialRed else BorderParchment,
                                    RoundedCornerShape(8.dp)
                                )
                                .clickable {
                                    selectedChar = ch
                                    onSpeak(ch.hanzi)
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = ch.hanzi,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isSelected) Color.White else ChineseInk
                            )
                        }
                    }
                }
            }
        }
    }
}
