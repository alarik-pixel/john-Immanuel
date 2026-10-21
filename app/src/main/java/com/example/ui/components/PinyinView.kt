package com.example.ui.components

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialRed

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun PinyinView(
    onSpeak: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        // Section: 21 Inisial (声母 Shēngmǔ)
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
                        text = "21 Inisial / Konsonan Awal (声母)",
                        fontSize = 14.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = ChineseInk
                    )
                }
                Text(
                    text = "Klik kartu untuk mendengar suara pelafalan.",
                    fontSize = 12.sp,
                    color = CharcoalMuted
                )
                Spacer(modifier = Modifier.height(10.dp))

                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    BookFundamentals.INITIALS.forEach { item ->
                        val wordToSpeak = item.example.split(" ").firstOrNull() ?: item.pinyin
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(CardBackgroundAlt)
                                .border(1.dp, BorderParchment, RoundedCornerShape(8.dp))
                                .clickable { onSpeak(wordToSpeak) }
                                .padding(horizontal = 10.dp, vertical = 7.dp)
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = item.pinyin,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = ImperialRed
                                )
                                Text(
                                    text = item.example,
                                    fontSize = 10.5.sp,
                                    color = CharcoalMuted
                                )
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Section: 32 Final (韵母 Yùnmǔ)
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
                        text = "32 Final / Vokal & Diftong (韵母)",
                        fontSize = 14.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = ChineseInk
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    BookFundamentals.FINALS.forEach { item ->
                        val wordToSpeak = item.example.split(" ").firstOrNull() ?: item.pinyin
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(CardBackgroundAlt)
                                .border(1.dp, BorderParchment, RoundedCornerShape(8.dp))
                                .clickable { onSpeak(wordToSpeak) }
                                .padding(horizontal = 9.dp, vertical = 7.dp)
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = item.pinyin,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = ImperialRed
                                )
                                Text(
                                    text = item.example,
                                    fontSize = 10.5.sp,
                                    color = CharcoalMuted
                                )
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Syllable Formula explanation
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFFDF6EC))
                .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                .padding(14.dp)
        ) {
            Column {
                Text(
                    text = "Rumus Pembentukan Suku Kata (音节)",
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.Bold,
                    color = ChineseInk
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Suku Kata = Inisial (Konsonan Awal) + Final (Vokal) + Nada",
                    fontSize = 12.5.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = ImperialRed
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "• n + i + nada 3 = nǐ (你 - kamu)\n• h + ao + nada 3 = hǎo (好 - baik)\n• zh + ong + nada 1 = zhōng (中 - tengah)",
                    fontSize = 12.sp,
                    color = CharcoalMuted,
                    lineHeight = 18.sp
                )
            }
        }
    }
}
