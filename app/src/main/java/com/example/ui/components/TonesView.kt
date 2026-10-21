package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookFundamentals
import com.example.ui.theme.AmberLight
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialRed

@Composable
fun TonesView(
    onSpeak: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = "4 Nada Utama + Nada Netral (声调)",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = ChineseInk
        )
        Text(
            text = "Nada mengubah arti kata. Klik kartu untuk mendengar bedanya.",
            fontSize = 12.sp,
            color = CharcoalMuted
        )

        Spacer(modifier = Modifier.height(10.dp))

        // 5 Tone cards
        BookFundamentals.TONES.forEach { tone ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                    .clickable { onSpeak(tone.example) }
                    .padding(14.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Big tone mark
                    Text(
                        text = tone.mark,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = ImperialRed,
                        modifier = Modifier.width(42.dp)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = tone.title,
                                fontSize = 14.5.sp,
                                fontWeight = FontWeight.Bold,
                                color = ChineseInk
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "• ${tone.description}",
                                fontSize = 12.sp,
                                color = CharcoalMuted
                            )
                        }

                        Spacer(modifier = Modifier.height(3.dp))

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "${tone.example} (${tone.examplePinyin})",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = ImperialRed
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "= ${tone.exampleIndo}",
                                fontSize = 13.sp,
                                color = ChineseInk.copy(alpha = 0.85f)
                            )
                        }
                    }

                    Text(
                        text = "🔊",
                        fontSize = 18.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Rules of Tone Change (变调 Kaidah Perubahan Nada)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(AmberLight)
                .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                .padding(14.dp)
        ) {
            Column {
                Text(
                    text = "4 Kaidah Penting Perubahan Nada (变调)",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = ImperialRed
                )
                Spacer(modifier = Modifier.height(8.dp))

                val rules = listOf(
                    "1. Nada 3 + Nada 3 → Nada 2 + Nada 3\nContoh: 你好 (nǐ hǎo) dilafalkan menjadi ní hǎo.",
                    "2. Perubahan Nada 不 (bù)\nSebelum nada ke-4, 不 berubah menjadi nada ke-2 (bú). Contoh: 不客气 (bú kèqi).",
                    "3. Perubahan Nada 一 (yī)\nSebelum nada ke-4, 一 dibaca nada ke-2 (yí); sebelum nada 1, 2, atau 3 dibaca nada ke-4 (yì). Contoh: 一天 (yì tiān).",
                    "4. Nada Netral (轻声 qīngshēng)\nDibaca ringan, pendek, dan tidak diberi tanda nada. Contoh: 妈妈 (māma), 谢谢 (xièxie)."
                )

                rules.forEach { rule ->
                    Text(
                        text = rule,
                        fontSize = 12.5.sp,
                        color = ChineseInk,
                        lineHeight = 18.sp,
                        modifier = Modifier.padding(vertical = 3.dp)
                    )
                }
            }
        }
    }
}
