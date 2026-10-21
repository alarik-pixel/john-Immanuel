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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.BookPage
import com.example.ui.theme.BorderParchment
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialRed

@Composable
fun ExerciseView(
    page: BookPage,
    modifier: Modifier = Modifier
) {
    var showAnswers by remember { mutableStateOf(false) }

    Column(modifier = modifier.fillMaxWidth()) {
        // Toggle answer visibility button
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Latihan Mandiri Bab ${page.chapterNum}",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = ChineseInk,
                modifier = Modifier.weight(1f)
            )

            Button(
                onClick = { showAnswers = !showAnswers },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (showAnswers) ImperialRed else Color.White,
                    contentColor = if (showAnswers) Color.White else ImperialRed
                ),
                shape = RoundedCornerShape(8.dp),
                border = if (!showAnswers) ButtonDefaults.outlinedButtonBorder else null
            ) {
                Icon(
                    imageVector = if (showAnswers) Icons.Default.VisibilityOff else Icons.Default.Visibility,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 4.dp)
                )
                Text(
                    text = if (showAnswers) "Sembunyikan Kunci" else "Lihat Kunci Jawaban",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        page.exerciseGroups.forEach { group ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(CardBackgroundAlt)
                    .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = group.title,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = ImperialRed
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    group.questions.forEachIndexed { index, q ->
                        val displayText = if (!showAnswers) {
                            // Hide the answer bracket [jawaban] with blank lines _____
                            q.replace(Regex("\\[([^\\]]+)\\]"), "____ ( ? ) ____")
                        } else {
                            q
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Text(
                                text = "${index + 1}.",
                                fontSize = 13.5.sp,
                                fontWeight = FontWeight.Bold,
                                color = CharcoalMuted,
                                modifier = Modifier.width(22.dp)
                            )
                            Text(
                                text = displayText,
                                fontSize = 13.5.sp,
                                color = ChineseInk,
                                lineHeight = 20.sp
                            )
                        }
                    }
                }
            }
        }

        // Practical study tip card
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
                    text = "💡 Petunjuk Belajar",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = ImperialRed
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Tuliskan jawaban Anda terlebih dahulu di buku catatan, lalu klik tombol 'Lihat Kunci Jawaban' untuk memeriksa ketepatan jawaban Anda.",
                    fontSize = 12.5.sp,
                    color = CharcoalMuted,
                    lineHeight = 18.sp
                )
            }
        }
    }
}
