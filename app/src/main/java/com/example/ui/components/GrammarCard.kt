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
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.GrammarItem
import com.example.ui.theme.AmberLight
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.DarkRed
import com.example.ui.theme.ImperialGold
import com.example.ui.theme.ImperialRed

@Composable
fun GrammarCard(
    item: GrammarItem,
    onSpeak: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            // Grammar Title with Red accent bar
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .width(4.dp)
                        .height(18.dp)
                        .background(ImperialRed, RoundedCornerShape(2.dp))
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = item.title,
                    fontSize = 15.5.sp,
                    fontWeight = FontWeight.Bold,
                    color = ChineseInk
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Formula Box
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(AmberLight)
                    .border(1.dp, ImperialGold.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                    .padding(horizontal = 12.dp, vertical = 9.dp)
            ) {
                Text(
                    text = item.formula,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkRed
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Description
            Text(
                text = item.description,
                fontSize = 13.5.sp,
                color = ChineseInk.copy(alpha = 0.85f),
                lineHeight = 20.sp
            )

            // Examples
            if (item.examples.isNotEmpty()) {
                Spacer(modifier = Modifier.height(12.dp))
                item.examples.forEach { ex ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(CardBackgroundAlt)
                            .border(1.dp, BorderParchment.copy(alpha = 0.7f), RoundedCornerShape(8.dp))
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .clickable { onSpeak(ex.hanzi) }
                        ) {
                            Text(
                                text = ex.hanzi,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = ChineseInk
                            )
                            Text(
                                text = ex.pinyin,
                                fontSize = 12.5.sp,
                                color = ImperialRed,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = ex.indonesian,
                                fontSize = 12.sp,
                                color = CharcoalMuted
                            )
                        }

                        IconButton(
                            onClick = { onSpeak(ex.hanzi) },
                            modifier = Modifier
                                .size(32.dp)
                                .clip(CircleShape)
                                .background(Color.White)
                                .border(1.dp, BorderParchment, CircleShape)
                        ) {
                            Icon(
                                imageVector = Icons.Default.VolumeUp,
                                contentDescription = "Dengarkan contoh kalimat",
                                tint = ImperialRed,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
