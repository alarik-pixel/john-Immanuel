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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
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
import com.example.ui.theme.CardBackgroundAlt
import com.example.ui.theme.CharcoalMuted
import com.example.ui.theme.ChineseInk
import com.example.ui.theme.ImperialRed
import com.example.ui.theme.JadeGreen
import com.example.ui.theme.JadeGreenBg
import com.example.ui.theme.SoftRed

@Composable
fun QuizView(
    page: BookPage,
    onSpeak: (String) -> Unit,
    onScoreSaved: ((Int) -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    // Stores selected option index for each question: mapOf(qIndex -> selectedOptionIndex)
    val selectedAnswers = remember { mutableStateMapOf<Int, Int>() }

    Column(modifier = modifier.fillMaxWidth()) {
        page.quizQuestions.forEachIndexed { qIndex, question ->
            val hasAnswered = selectedAnswers.containsKey(qIndex)
            val selectedOption = selectedAnswers[qIndex]

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(CardBackgroundAlt)
                    .border(1.dp, BorderParchment, RoundedCornerShape(12.dp))
                    .padding(14.dp)
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Soal ${qIndex + 1} dari ${page.quizQuestions.size}",
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Bold,
                            color = ImperialRed
                        )

                        if (!question.hanzi.isNullOrEmpty()) {
                            IconButton(
                                onClick = { onSpeak(question.hanzi) },
                                modifier = Modifier.size(28.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.VolumeUp,
                                    contentDescription = "Dengarkan pelafalan",
                                    tint = ImperialRed,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = question.question,
                        fontSize = 14.5.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = ChineseInk
                    )

                    if (!question.hanzi.isNullOrEmpty()) {
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = question.hanzi,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = ImperialRed,
                            modifier = Modifier.clickable { onSpeak(question.hanzi) }
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Options list
                    question.options.forEachIndexed { optIndex, optionText ->
                        val isSelected = selectedOption == optIndex
                        val isCorrect = optIndex == question.correctIndex

                        val (bgColor, borderColor, textColor) = when {
                            !hasAnswered -> Triple(Color.White, BorderParchment, ChineseInk)
                            isSelected && isCorrect -> Triple(JadeGreenBg, JadeGreen, JadeGreen)
                            isSelected && !isCorrect -> Triple(SoftRed, ImperialRed, ImperialRed)
                            isCorrect -> Triple(JadeGreenBg, JadeGreen, JadeGreen)
                            else -> Triple(Color.White, BorderParchment.copy(alpha = 0.5f), CharcoalMuted)
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 3.5.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(bgColor)
                                .border(1.dp, borderColor, RoundedCornerShape(8.dp))
                                .clickable(enabled = !hasAnswered) {
                                    selectedAnswers[qIndex] = optIndex
                                    // If all questions are answered, compute score and notify
                                    if (selectedAnswers.size == page.quizQuestions.size) {
                                        var correctCount = 0
                                        page.quizQuestions.forEachIndexed { idx, q ->
                                            if (selectedAnswers[idx] == q.correctIndex) correctCount++
                                        }
                                        onScoreSaved?.invoke(correctCount)
                                    }
                                }
                                .padding(horizontal = 12.dp, vertical = 10.dp)
                        ) {
                            val prefix = ('A' + optIndex).toString()
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "$prefix. ",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 13.5.sp,
                                    color = textColor
                                )
                                Text(
                                    text = optionText,
                                    fontSize = 13.5.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                    color = textColor
                                )
                            }
                        }
                    }
                }
            }
        }

        // Score summary card when all questions answered
        if (selectedAnswers.size == page.quizQuestions.size) {
            val total = page.quizQuestions.size
            var correctCount = 0
            page.quizQuestions.forEachIndexed { idx, q ->
                if (selectedAnswers[idx] == q.correctIndex) correctCount++
            }
            val percentage = (correctCount * 100) / total
            val isPassed = percentage >= 80

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (isPassed) JadeGreenBg else AmberLight)
                    .border(1.dp, if (isPassed) JadeGreen else ImperialRed, RoundedCornerShape(12.dp))
                    .padding(18.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = if (isPassed) "🎉 Selamat! Anda Lulus Kuis" else "💪 Masih Perlu Latihan Lagi",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isPassed) JadeGreen else ImperialRed
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Skor Anda: $correctCount / $total ($percentage%)",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = ChineseInk
                    )

                    Text(
                        text = if (isPassed) "Pemahaman Anda pada Bab ini sangat memuaskan." else "Ulangi latihan untuk mencapai pemahaman optimal (≥80%).",
                        fontSize = 12.5.sp,
                        color = CharcoalMuted
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Button(
                        onClick = { selectedAnswers.clear() },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = ImperialRed,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Refresh,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.size(6.dp))
                        Text(text = "Ulangi Kuis", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
