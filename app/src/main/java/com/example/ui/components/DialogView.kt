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
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookPage
import com.example.ui.theme.AmberLight
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialGold
import com.example.ui.theme.ImperialRed

@Composable
fun DialogView(
    page: BookPage,
    onSpeak: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        // Scene description banner
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(AmberLight)
                .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                .padding(14.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(1.dp, BorderParchment, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = page.sceneIcon, fontSize = 24.sp)
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = page.sceneTitle.ifEmpty { page.title },
                        fontSize = 14.5.sp,
                        fontWeight = FontWeight.Bold,
                        color = ChineseInk
                    )
                    if (page.sceneDesc.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = page.sceneDesc,
                            fontSize = 12.sp,
                            color = CharcoalMuted
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Dialogue bubbles
        page.dialogLines.forEach { line ->
            val isSpeakerB = line.speaker == "B"

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp),
                horizontalArrangement = if (isSpeakerB) Arrangement.End else Arrangement.Start,
                verticalAlignment = Alignment.Top
            ) {
                if (!isSpeakerB) {
                    // Avatar A (Red)
                    Box(
                        modifier = Modifier
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(ImperialRed),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = line.speaker,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }

                // Speech Bubble
                Box(
                    modifier = Modifier
                        .weight(1f, fill = false)
                        .clip(RoundedCornerShape(12.dp))
                        .background(if (isSpeakerB) AmberLight else Color.White)
                        .border(
                            1.dp,
                            if (isSpeakerB) ImperialGold.copy(alpha = 0.4f) else BorderParchment,
                            RoundedCornerShape(12.dp)
                        )
                        .padding(12.dp)
                        .clickable { onSpeak(line.hanzi) }
                ) {
                    Column {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = line.hanzi,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = ChineseInk,
                                modifier = Modifier.weight(1f)
                            )
                            IconButton(
                                onClick = { onSpeak(line.hanzi) },
                                modifier = Modifier.size(28.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.VolumeUp,
                                    contentDescription = "Dengarkan baris ini",
                                    tint = ImperialRed,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }

                        Text(
                            text = line.pinyin,
                            fontSize = 12.sp,
                            color = ImperialRed,
                            fontWeight = FontWeight.Medium
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = line.indonesian,
                            fontSize = 12.sp,
                            color = CharcoalMuted
                        )
                    }
                }

                if (isSpeakerB) {
                    Spacer(modifier = Modifier.width(8.dp))
                    // Avatar B (Gold)
                    Box(
                        modifier = Modifier
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(ImperialGold),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = line.speaker,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp
                        )
                    }
                }
            }
        }
    }
}
