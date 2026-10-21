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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.VocabWord
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialRed

@Composable
fun VocabCard(
    word: VocabWord,
    onSpeakWord: (String) -> Unit,
    onSpeakSentence: ((String) -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(CardBackgroundAlt)
            .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
            .padding(14.dp)
            .testTag("vocab_card_${word.hanzi}")
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .clickable { onSpeakWord(word.hanzi) }
                ) {
                    Text(
                        text = word.hanzi,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = ChineseInk,
                        lineHeight = 28.sp
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = word.pinyin,
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = ImperialRed
                    )
                    Spacer(modifier = Modifier.height(3.dp))
                    Text(
                        text = word.indonesian,
                        fontSize = 14.sp,
                        color = ChineseInk.copy(alpha = 0.85f),
                        fontWeight = FontWeight.Normal
                    )
                }

                // Audio speak button
                IconButton(
                    onClick = { onSpeakWord(word.hanzi) },
                    modifier = Modifier
                        .size(38.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(1.dp, BorderParchment, CircleShape)
                        .testTag("speak_word_${word.hanzi}")
                ) {
                    Icon(
                        imageVector = Icons.Default.VolumeUp,
                        contentDescription = "Dengarkan pelafalan ${word.hanzi}",
                        tint = ImperialRed,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            // Example sentence if present
            if (!word.example.isNullOrEmpty()) {
                Spacer(modifier = Modifier.height(10.dp))
                HorizontalDivider(
                    thickness = 0.8.dp,
                    color = BorderParchment.copy(alpha = 0.7f)
                )
                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .clickable { onSpeakSentence?.invoke(word.example) ?: onSpeakWord(word.example) }
                    ) {
                        Text(
                            text = word.example,
                            fontSize = 14.5.sp,
                            fontWeight = FontWeight.Medium,
                            color = ChineseInk
                        )
                        if (!word.exampleIndo.isNullOrEmpty()) {
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = word.exampleIndo,
                                fontSize = 12.5.sp,
                                color = CharcoalMuted
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    IconButton(
                        onClick = { onSpeakSentence?.invoke(word.example) ?: onSpeakWord(word.example) },
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                            .border(1.dp, BorderParchment, CircleShape)
                    ) {
                        Icon(
                            imageVector = Icons.Default.VolumeUp,
                            contentDescription = "Dengarkan contoh kalimat",
                            tint = CharcoalMuted,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
    }
}
