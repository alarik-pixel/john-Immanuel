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
fun RadicalsView(
    onSpeak: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                .padding(14.dp)
        ) {
            Column {
                Text(
                    text = "Apa itu Radikal Hanzi (部首 bùshǒu)?",
                    fontSize = 14.5.sp,
                    fontWeight = FontWeight.Bold,
                    color = ChineseInk
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Radikal adalah komponen dasar pembentuk karakter Hanzi yang memberi petunjuk makna atau rumpun semantik. Contoh: radikal air (氵) membentuk karakter 河 (sungai), 海 (laut), 洗 (mencuci).",
                    fontSize = 12.5.sp,
                    color = CharcoalMuted,
                    lineHeight = 18.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "20 Radikal Dasar Paling Sering Muncul",
            fontSize = 14.5.sp,
            fontWeight = FontWeight.Bold,
            color = ChineseInk
        )
        Text(
            text = "Klik kartu untuk mendengarkan pelafalannya.",
            fontSize = 12.sp,
            color = CharcoalMuted
        )

        Spacer(modifier = Modifier.height(10.dp))

        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            BookFundamentals.RADICALS.forEach { rad ->
                val primaryChar = rad.hanzi.split("/").first()
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(CardBackgroundAlt)
                        .border(1.dp, BorderParchment, RoundedCornerShape(10.dp))
                        .clickable { onSpeak(primaryChar) }
                        .padding(horizontal = 12.dp, vertical = 9.dp)
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = rad.hanzi,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = ImperialRed
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "${rad.pinyin} • ${rad.indonesian}",
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = ChineseInk
                        )
                        Spacer(modifier = Modifier.height(3.dp))
                        Text(
                            text = "Contoh: ${rad.examples}",
                            fontSize = 10.5.sp,
                            color = CharcoalMuted
                        )
                    }
                }
            }
        }
    }
}
