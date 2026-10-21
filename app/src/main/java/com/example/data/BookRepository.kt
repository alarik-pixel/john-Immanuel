package com.example.data

object BookRepository {

    private val pagesList: List<BookPage> by lazy {
        val list = mutableListOf<BookPage>()
        list.addAll(BookChapters1To5.getPages())
        list.addAll(BookChapters6To10.getPages())
        list.addAll(BookChapters11To15.getPages())
        list.addAll(BookChapters16To20.getPages())
        list
    }

    val totalPages: Int
        get() = pagesList.size

    fun getAllPages(): List<BookPage> = pagesList

    fun getPage(pageNum: Int): BookPage {
        val safeIndex = (pageNum - 1).coerceIn(0, pagesList.lastIndex)
        return pagesList[safeIndex]
    }

    val chapters: List<ChapterInfo> = listOf(
        ChapterInfo(1, "Fondasi & Salam", "基础与问候", "👋", 1, 10),
        ChapterInfo(2, "Perkenalan Diri", "自我介绍", "🙋", 11, 20),
        ChapterInfo(3, "Angka & Waktu", "数字和时间", "🕐", 21, 30),
        ChapterInfo(4, "Keluarga", "家人", "👨‍👩‍👧", 31, 40),
        ChapterInfo(5, "Makanan & Minuman", "饮食", "🍜", 41, 50),
        ChapterInfo(6, "Belanja & Tawar", "购物与讨价还价", "🛍️", 51, 60),
        ChapterInfo(7, "Tempat & Arah", "地点与方向", "📍", 61, 70),
        ChapterInfo(8, "Transportasi", "交通与出行", "🚇", 71, 80),
        ChapterInfo(9, "Cuaca & Musim", "天气与季节", "☀️", 81, 90),
        ChapterInfo(10, "Hobi & Olahraga", "爱好与业余生活", "🎨", 91, 100),
        ChapterInfo(11, "Sekolah & Pekerjaan", "学校与职场", "🎓", 101, 110),
        ChapterInfo(12, "Tubuh & Kesehatan", "身体与健康", "🏥", 111, 120),
        ChapterInfo(13, "Rumah & Perabot", "我家与居所", "🏠", 121, 130),
        ChapterInfo(14, "Telepon & Internet", "通讯与移动互联", "📱", 131, 140),
        ChapterInfo(15, "Janji & Acara", "约会与社交聚会", "🎉", 141, 150),
        ChapterInfo(16, "Pengalaman Lampau", "往昔与人生经历", "📖", 151, 160),
        ChapterInfo(17, "Rencana Masa Depan", "未来蓝图与展望", "🌟", 161, 170),
        ChapterInfo(18, "Emosi & Opini", "情绪与观点表达", "💭", 171, 180),
        ChapterInfo(19, "Budaya & Festival", "传统民俗与节日", "🏮", 181, 190),
        ChapterInfo(20, "Review & HSK", "知识总复习与HSK通关", "🏆", 191, 200)
    )

    fun searchPages(query: String): List<BookPage> {
        val q = query.trim().lowercase()
        if (q.isEmpty()) return emptyList()
        return pagesList.filter { page ->
            page.title.lowercase().contains(q) ||
                    page.chapterTitle.lowercase().contains(q) ||
                    page.chapterZh.contains(q) ||
                    page.subtitle.lowercase().contains(q) ||
                    page.words.any { it.hanzi.contains(q) || it.pinyin.lowercase().contains(q) || it.indonesian.lowercase().contains(q) } ||
                    page.readingText.contains(q) ||
                    page.readingIndo.lowercase().contains(q)
        }
    }
}
