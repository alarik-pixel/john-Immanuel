package com.example.data

enum class PageType {
    COVER,
    PINYIN,
    TONES,
    RADICALS,
    STROKES,
    VOCAB,
    GRAMMAR,
    DIALOG,
    READING,
    EXERCISE,
    QUIZ
}

data class VocabWord(
    val hanzi: String,
    val pinyin: String,
    val indonesian: String,
    val example: String? = null,
    val exampleIndo: String? = null
)

data class GrammarExample(
    val hanzi: String,
    val pinyin: String,
    val indonesian: String
)

data class GrammarItem(
    val title: String,
    val formula: String,
    val description: String,
    val examples: List<GrammarExample> = emptyList()
)

data class DialogLine(
    val speaker: String, // "A" or "B"
    val hanzi: String,
    val pinyin: String,
    val indonesian: String
)

data class ExerciseGroup(
    val title: String,
    val questions: List<String>
)

data class QuizQuestion(
    val question: String,
    val hanzi: String? = null,
    val options: List<String>,
    val correctIndex: Int
)

data class RadicalItem(
    val hanzi: String,
    val pinyin: String,
    val indonesian: String,
    val examples: String
)

data class StrokeRule(
    val number: Int,
    val title: String,
    val description: String,
    val demo: String
)

data class StrokeChar(
    val hanzi: String,
    val pinyin: String,
    val indonesian: String
)

data class PinyinItem(
    val pinyin: String,
    val example: String
)

data class ToneItem(
    val mark: String,
    val title: String,
    val description: String,
    val example: String,
    val examplePinyin: String,
    val exampleIndo: String
)

data class BookPage(
    val globalPageNum: Int,
    val chapterNum: Int,
    val chapterTitle: String,
    val chapterZh: String,
    val chapterIcon: String,
    val pageInChapter: Int,
    val totalInChapter: Int = 10,
    val type: PageType,
    val title: String,
    val subtitle: String = "",
    val goals: List<String> = emptyList(),
    val words: List<VocabWord> = emptyList(),
    val grammarItems: List<GrammarItem> = emptyList(),
    val sceneIcon: String = "💬",
    val sceneTitle: String = "",
    val sceneDesc: String = "",
    val dialogLines: List<DialogLine> = emptyList(),
    val readingZh: String = "",
    val readingText: String = "",
    val readingPinyin: String = "",
    val readingIndo: String = "",
    val readingNote: String = "",
    val exerciseGroups: List<ExerciseGroup> = emptyList(),
    val quizQuestions: List<QuizQuestion> = emptyList()
)

data class ChapterInfo(
    val number: Int,
    val title: String,
    val zh: String,
    val icon: String,
    val startPage: Int,
    val endPage: Int
)
