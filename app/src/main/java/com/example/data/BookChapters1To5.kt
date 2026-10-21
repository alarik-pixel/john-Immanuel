package com.example.data

object BookChapters1To5 {

    fun getPages(): List<BookPage> {
        val pages = mutableListOf<BookPage>()

        // ==================== BAB 1: Fondasi & Salam (Pages 1-10) ====================
        pages.add(
            BookPage(
                globalPageNum = 1, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 1, type = PageType.COVER,
                title = "Fondasi & Salam Pertama", subtitle = "Mulai dari nol: pinyin, nada, goresan, dan sapaan.",
                goals = listOf(
                    "Mengenal 3 pilar bahasa Mandarin: Hanzi, Pinyin, dan Nada",
                    "Menghafal inisial (21) dan final (32)",
                    "Menguasai 4 nada utama + nada netral",
                    "Mengenal 20 radikal dasar pembentuk huruf",
                    "Memahami 7 aturan urutan goresan Hanzi",
                    "Mengucapkan sapaan dasar sehari-hari dengan percaya diri"
                )
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 2, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 2, type = PageType.PINYIN,
                title = "Pinyin: Inisial & Final", subtitle = "Klik kartu untuk mendengarkan pelafalan audio penutur asli."
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 3, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 3, type = PageType.TONES,
                title = "4 Nada + Nada Netral", subtitle = "Nada mengubah arti kata. Dengarkan perbedaan tajamnya."
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 4, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 4, type = PageType.RADICALS,
                title = "20 Radikal Dasar", subtitle = "Komponen utama pembentuk Hanzi yang memandu pemaknaan."
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 5, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 5, type = PageType.STROKES,
                title = "Urutan Goresan (笔顺)", subtitle = "7 kaidah menulis karakter China dengan rapi dan seimbang."
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 6, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 6, type = PageType.VOCAB,
                title = "Sapaan Sehari-hari (Bagian 1)", subtitle = "Kosakata pembuka percakapan penting.",
                words = listOf(
                    VocabWord("你好", "nǐ hǎo", "halo / hai", "你好！我叫Budi。", "Halo! Nama saya Budi."),
                    VocabWord("您好", "nín hǎo", "halo (sopan / formal)", "您好，老师！", "Halo, Bapak/Ibu Guru!"),
                    VocabWord("早上好", "zǎoshang hǎo", "selamat pagi", "早上好，大家！", "Selamat pagi, semuanya!"),
                    VocabWord("下午好", "xiàwǔ hǎo", "selamat siang / sore", "下午好，请进。", "Selamat siang, silakan masuk."),
                    VocabWord("晚上好", "wǎnshang hǎo", "selamat malam", "晚上好，吃了没有？", "Selamat malam, sudah makan belum?"),
                    VocabWord("再见", "zàijiàn", "sampai jumpa", "明天见，再见！", "Sampai besok, selamat tinggal!"),
                    VocabWord("晚安", "wǎn ān", "selamat tidur / istirahat", "祝你做个好梦，晚安。", "Semoga mimpi indah, selamat malam.")
                )
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 7, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 7, type = PageType.VOCAB,
                title = "Ungkapan Sopan & Santun (Bagian 2)", subtitle = "Ekspresi etiket komunikasi sehari-hari.",
                words = listOf(
                    VocabWord("谢谢", "xièxie", "terima kasih", "谢谢你的帮助！", "Terima kasih atas bantuanmu!"),
                    VocabWord("不客气", "bú kèqi", "sama-sama / tidak perlu sungkan", "不用谢，不客气！", "Tidak perlu berterima kasih, sama-sama!"),
                    VocabWord("对不起", "duìbuqǐ", "maaf", "对不起，我迟到了。", "Maaf, saya terlambat."),
                    VocabWord("没关系", "méi guānxi", "tidak apa-apa", "没关系，别放在心上。", "Tidak apa-apa, jangan dimasukkan ke hati."),
                    VocabWord("请问", "qǐngwèn", "permisi / numpang tanya", "请问，洗手间在哪儿？", "Permisi, toilet ada di sebelah mana?"),
                    VocabWord("好久不见", "hǎojiǔ bú jiàn", "lama tak jumpa", "好久不见，最近怎么样？", "Lama tak jumpa, bagaimana kabarmu belakangan ini?"),
                    VocabWord("请慢用", "qǐng màn yòng", "silakan menikmati hidangan", "菜齐了，请慢用！", "Hidangan sudah lengkap, silakan dinikmati!")
                )
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 8, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 8, type = PageType.GRAMMAR,
                title = "Tata Bahasa: 是 & 吗", subtitle = "Pola kalimat deklaratif dan interogatif dasar.",
                grammarItems = listOf(
                    GrammarItem(
                        title = "1. Kata Kerja Penghubung 是 (adalah)",
                        formula = "Subjek + 是 (shì) + Predikat / Nomina",
                        description = "Kata 是 digunakan untuk menghubungkan subjek dengan identitas, profesi, atau kebangsaan. Bentuk negatifnya adalah 不是 (bú shì).",
                        examples = listOf(
                            GrammarExample("我是学生。", "Wǒ shì xuésheng.", "Saya adalah seorang siswa."),
                            GrammarExample("他是汉语老师。", "Tā shì Hànyǔ lǎoshī.", "Dia adalah guru bahasa Mandarin."),
                            GrammarExample("她是印度尼西亚人。", "Tā shì Yìndùníxīyà rén.", "Dia adalah orang Indonesia.")
                        )
                    ),
                    GrammarItem(
                        title = "2. Partikel Tanya 吗 (ma)",
                        formula = "Pernyataan Positif + 吗？",
                        description = "Menempel di akhir kalimat pernyataan untuk mengubahnya menjadi pertanyaan ya/tidak (Yes-No Question) tanpa mengubah susunan kata.",
                        examples = listOf(
                            GrammarExample("你好吗？", "Nǐ hǎo ma?", "Apa kabarmu?"),
                            GrammarExample("你是中国人吗？", "Nǐ shì Zhōngguó rén ma?", "Apakah kamu orang China?"),
                            GrammarExample("他是你的老师吗？", "Tā shì nǐ de lǎoshī ma?", "Apakah dia gurumu?")
                        )
                    )
                )
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 9, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 9, type = PageType.DIALOG,
                title = "Dialog: Bertemu Teman Lama", subtitle = "Percakapan santai di taman kampus.",
                sceneIcon = "🤝", sceneTitle = "Di Taman Kampus",
                sceneDesc = "Budi bertemu dengan kawan lamanya, Li Ming, setelah liburan semester.",
                dialogLines = listOf(
                    DialogLine("A", "你好！好久不见！", "Nǐ hǎo! Hǎojiǔ bú jiàn!", "Halo! Lama sekali tidak bertemu!"),
                    DialogLine("B", "你好！你好吗？", "Nǐ hǎo! Nǐ hǎo ma?", "Halo! Bagaimana kabarmu?"),
                    DialogLine("A", "我很好，谢谢你。你呢？", "Wǒ hěn hǎo, xièxie nǐ. Nǐ ne?", "Saya sangat baik, terima kasih. Kamu bagaimana?"),
                    DialogLine("B", "我也很好。太高兴见到你了！", "Wǒ yě hěn hǎo. Tài gāoxìng jiàndào nǐ le!", "Saya juga sangat baik. Senang sekali bertemu denganmu!"),
                    DialogLine("A", "再见！祝你今天愉快！", "Zàijiàn! Zhù nǐ jīntiān yúkuài!", "Sampai jumpa! Semoga harimu menyenangkan!"),
                    DialogLine("B", "明天见，再见！", "Míngtiān jiàn, zàijiàn!", "Sampai jumpa besok, selamat tinggal!")
                )
            )
        )
        pages.add(
            BookPage(
                globalPageNum = 10, chapterNum = 1, chapterTitle = "Fondasi & Salam", chapterZh = "基础与问候",
                chapterIcon = "👋", pageInChapter = 10, type = PageType.QUIZ,
                title = "Kuis Bab 1: Fondasi & Salam", subtitle = "Raih skor ≥ 80% untuk menguji pemahaman bab ini.",
                quizQuestions = listOf(
                    QuizQuestion("Apa arti dari salam '你好' (nǐ hǎo)?", "你好", listOf("Halo / Hai", "Terima kasih", "Sampai jumpa", "Selamat pagi"), 0),
                    QuizQuestion("Bagaimana pinyin yang tepat untuk '谢谢'?", "谢谢", listOf("xièxie", "xiāoxi", "shīshi", "xìexìe"), 0),
                    QuizQuestion("Partikel 吗 (ma) di akhir kalimat berfungsi sebagai...", "吗", listOf("Penanda pertanyaan ya/tidak", "Penanda waktu lampau", "Penanda bentuk jamak", "Kata sifat"), 0),
                    QuizQuestion("Jika dua karakter bernada ke-3 bertemu berturut-turut (contoh: nǐ hǎo), cara membacanya menjadi...", "nǐ hǎo", listOf("Nada 2 + Nada 3 (ní hǎo)", "Tetap Nada 3 + Nada 3", "Nada 4 + Nada 3", "Nada 1 + Nada 3"), 0),
                    QuizQuestion("Bagaimana cara mengucapkan 'Selamat Pagi' dalam bahasa Mandarin?", "早上好", listOf("早上好 (zǎoshang hǎo)", "晚上好 (wǎnshang hǎo)", "下午好 (xiàwǔ hǎo)", "晚安 (wǎn ān)"), 0)
                )
            )
        )

        // Helper to generate chapters 2 to 5 standard pages
        fun addStandardChapter(
            startGlobal: Int, num: Int, title: String, zh: String, icon: String,
            goals: List<String>,
            v1Title: String, v1Words: List<VocabWord>,
            v2Title: String, v2Words: List<VocabWord>,
            g1Title: String, g1Items: List<GrammarItem>,
            g2Title: String, g2Items: List<GrammarItem>,
            d1Title: String, d1Icon: String, d1SceneTitle: String, d1SceneDesc: String, d1Lines: List<DialogLine>,
            d2Title: String, d2Icon: String, d2SceneTitle: String, d2SceneDesc: String, d2Lines: List<DialogLine>,
            rdTitle: String, rdZh: String, rdIcon: String, rdText: String, rdPy: String, rdId: String, rdNote: String,
            exGroups: List<ExerciseGroup>,
            quizList: List<QuizQuestion>
        ) {
            pages.add(BookPage(startGlobal, num, title, zh, icon, 1, 10, PageType.COVER, title, "Bab $num: $title", goals = goals))
            pages.add(BookPage(startGlobal + 1, num, title, zh, icon, 2, 10, PageType.VOCAB, v1Title, "Kosakata bagian 1.", words = v1Words))
            pages.add(BookPage(startGlobal + 2, num, title, zh, icon, 3, 10, PageType.VOCAB, v2Title, "Kosakata bagian 2.", words = v2Words))
            pages.add(BookPage(startGlobal + 3, num, title, zh, icon, 4, 10, PageType.GRAMMAR, g1Title, "Pola tata bahasa penting.", grammarItems = g1Items))
            pages.add(BookPage(startGlobal + 4, num, title, zh, icon, 5, 10, PageType.GRAMMAR, g2Title, "Pola tata bahasa lanjutan.", grammarItems = g2Items))
            pages.add(BookPage(startGlobal + 5, num, title, zh, icon, 6, 10, PageType.DIALOG, "Dialog: $d1Title", sceneIcon = d1Icon, sceneTitle = d1SceneTitle, sceneDesc = d1SceneDesc, dialogLines = d1Lines))
            pages.add(BookPage(startGlobal + 6, num, title, zh, icon, 7, 10, PageType.DIALOG, "Dialog: $d2Title", sceneIcon = d2Icon, sceneTitle = d2SceneTitle, sceneDesc = d2SceneDesc, dialogLines = d2Lines))
            pages.add(BookPage(startGlobal + 7, num, title, zh, icon, 8, 10, PageType.READING, "Budaya: $rdTitle", readingZh = rdZh, sceneIcon = rdIcon, readingText = rdText, readingPinyin = rdPy, readingIndo = rdId, readingNote = rdNote))
            pages.add(BookPage(startGlobal + 8, num, title, zh, icon, 9, 10, PageType.EXERCISE, "Latihan Bab $num", "Uji keterampilan menulis dan pemahaman Anda.", exerciseGroups = exGroups))
            pages.add(BookPage(startGlobal + 9, num, title, zh, icon, 10, 10, PageType.QUIZ, "Kuis Bab $num", "Uji pemahaman materi Bab $num.", quizQuestions = quizList))
        }

        // ==================== BAB 2: Perkenalan Diri (Pages 11-20) ====================
        addStandardChapter(
            startGlobal = 11, num = 2, title = "Perkenalan Diri", zh = "自我介绍", icon = "🙋",
            goals = listOf("Menyebutkan nama dan marga", "Menyatakan asal negara & kota", "Menyebutkan pekerjaan", "Bertanya identitas orang lain"),
            v1Title = "Kata Ganti & Nama",
            v1Words = listOf(
                VocabWord("我", "wǒ", "saya / aku", "我是Budi。", "Saya Budi."),
                VocabWord("你", "nǐ", "kamu", "你好吗？", "Apa kabarmu?"),
                VocabWord("您", "nín", "Anda (sopan)", "您好，李老师！", "Halo, Guru Li!"),
                VocabWord("他", "tā", "dia (laki-laki)", "他是我的同学。", "Dia teman sekelasku."),
                VocabWord("她", "tā", "dia (perempuan)", "她是我姐姐。", "Dia kakak perempuanku."),
                VocabWord("我们", "wǒmen", "kami / kita", "我们是好朋友。", "Kami adalah sahabat baik."),
                VocabWord("叫", "jiào", "bernama / dipanggil", "我叫Budi。", "Nama saya Budi."),
                VocabWord("姓", "xìng", "bermarga", "我姓张。", "Marga saya Zhang."),
                VocabWord("名字", "míngzi", "nama", "你叫什么名字？", "Siapa namamu?")
            ),
            v2Title = "Asal & Pekerjaan",
            v2Words = listOf(
                VocabWord("是", "shì", "adalah", "我是大学生。", "Saya mahasiswa."),
                VocabWord("人", "rén", "orang", "他是中国人。", "Dia orang China."),
                VocabWord("印度尼西亚", "Yìndùníxīyà", "Indonesia", "我来自印度尼西亚。", "Saya berasal dari Indonesia."),
                VocabWord("中国", "Zhōngguó", "China", "中国历史很悠久。", "Sejarah China sangat panjang."),
                VocabWord("学生", "xuésheng", "siswa / murid", "我们都是学生。", "Kami semua adalah murid."),
                VocabWord("老师", "lǎoshī", "guru / pengajar", "王老师很亲切。", "Guru Wang sangat ramah."),
                VocabWord("医生", "yīshēng", "dokter", "我爸爸是医生。", "Ayah saya seorang dokter."),
                VocabWord("来自", "láizì", "berasal dari", "我来自雅加达。", "Saya berasal dari Jakarta."),
                VocabWord("高兴", "gāoxìng", "senang / gembira", "很高兴认识你。", "Senang berkenalan denganmu.")
            ),
            g1Title = "Penggunaan 叫 & 姓",
            g1Items = listOf(
                GrammarItem("叫 (jiào) — Menyebut Nama", "Subjek + 叫 + Nama", "Digunakan untuk memberitahukan nama lengkap atau panggilan.", listOf(GrammarExample("我叫Budi。", "Wǒ jiào Budi.", "Nama saya Budi."), GrammarExample("你叫什么名字？", "Nǐ jiào shénme míngzi?", "Siapa namamu?"))),
                GrammarItem("姓 (xìng) — Menyebut Marga", "Subjek + 姓 + Marga", "Dalam budaya Tionghoa marga diletakkan di depan nama diri.", listOf(GrammarExample("我姓王。", "Wǒ xìng Wáng.", "Marga saya Wang."), GrammarExample("您贵姓？", "Nín guì xìng?", "Siapa marga terhormat Anda?")))
            ),
            g2Title = "Menyatakan Asal dengan 来自",
            g2Items = listOf(
                GrammarItem("来自 (láizì) — Berasal dari", "Subjek + 来自 + Tempat", "Menyatakan tempat lahir atau daerah asal seseorang.", listOf(GrammarExample("我来自印度尼西亚。", "Wǒ láizì Yìndùníxīyà.", "Saya berasal dari Indonesia."), GrammarExample("他来自北京。", "Tā láizì Běijīng.", "Dia berasal dari Beijing.")))
            ),
            d1Title = "Berkenalan di Kampus", d1Icon = "🎓", d1SceneTitle = "Hari Pertama Kuliah", d1SceneDesc = "Dua mahasiswa baru berkenalan sebelum kelas dimulai.",
            d1Lines = listOf(
                DialogLine("A", "你好！请问你叫什么名字？", "Nǐ hǎo! Qǐngwèn nǐ jiào shénme míngzi?", "Halo! Permisi, siapa namamu?"),
                DialogLine("B", "你好！我叫李明。你呢？", "Nǐ hǎo! Wǒ jiào Lǐ Míng. Nǐ ne?", "Halo! Nama saya Li Ming. Kamu?"),
                DialogLine("A", "我叫Budi。我是印度尼西亚人。", "Wǒ jiào Budi. Wǒ shì Yìndùníxīyà rén.", "Nama saya Budi. Saya orang Indonesia."),
                DialogLine("B", "认识你很高兴！", "Rènshi nǐ hěn gāoxìng!", "Senang sekali berkenalan denganmu!")
            ),
            d2Title = "Bertemu Rekan Kerja", d2Icon = "💼", d2SceneTitle = "Di Ruang Kantor", d2SceneDesc = "Percakapan profesional perkenalan diri.",
            d2Lines = listOf(
                DialogLine("A", "您好！请问您贵姓？", "Nín hǎo! Qǐngwèn nín guì xìng?", "Halo! Permisi, siapa marga Anda?"),
                DialogLine("B", "我姓张，叫张强。", "Wǒ xìng Zhāng, jiào Zhāng Qiáng.", "Marga saya Zhang, nama saya Zhang Qiang."),
                DialogLine("A", "张先生，您来自哪儿？", "Zhāng xiānsheng, nín láizì nǎr?", "Tuan Zhang, Anda berasal dari mana?"),
                DialogLine("B", "我来自上海。你也是这里的员工吗？", "Wǒ láizì Shànghǎi. Nǐ yě shì zhèlǐ de yuángōng ma?", "Saya dari Shanghai. Apakah kamu juga karyawan di sini?")
            ),
            rdTitle = "Tradisi Marga China", rdZh = "中国人的姓氏", rdIcon = "🏯",
            rdText = "中国人的名字是姓在前，名在后。比如\"李明\"，李是姓，明是名。中国最常见的三个姓氏是李、王、张。在正式社交场合，称呼他人通常用姓氏加上职务，例如\"张老师\"或\"王经理\"。",
            rdPy = "Zhōngguó rén de míngzi shì xìng zài qián, míng zài hòu.",
            rdId = "Nama orang China susunannya marga di depan, nama diri di belakang. Contoh 'Li Ming': Li adalah marga, Ming adalah nama diri. Tiga marga paling umum adalah Li, Wang, dan Zhang.",
            rdNote = "Meskipun ada ribuan marga dalam sejarah, 100 marga teratas dimiliki oleh lebih dari 85% populasi Tiongkok.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kalimat", listOf("你叫什么 [名字]？", "我 [来自] 印度尼西亚。", "他 [是] 汉语老师。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya orang Indonesia → 我是印度尼西亚人。", "Siapa namamu? → 你叫什么名字？", "Senang berkenalan denganmu → 很高兴认识你。"))
            ),
            quizList = listOf(
                QuizQuestion("Bagaimana menanyakan nama dengan sopan?", "你叫什么名字？", listOf("你叫什么名字？", "你好吗？", "你去哪儿？", "你是谁？"), 0),
                QuizQuestion("Karakter 姓 (xìng) memiliki arti...", "姓", listOf("Marga keluarga", "Nama panggilan", "Asal negara", "Gelar kehormatan"), 0),
                QuizQuestion("Apa terjemahan 'Saya dari Indonesia'?", "我来自印度尼西亚。", listOf("我来自印度尼西亚。", "我是印度尼西亚。", "我在印度尼西亚。", "我去印度尼西亚。"), 0),
                QuizQuestion("Apa arti '很高兴认识你' (hěn gāoxìng rènshi nǐ)?", "很高兴认识你", listOf("Senang berkenalan denganmu", "Apa kabarmu hari ini", "Selamat datang di rumah", "Sampai jumpa lagi nanti"), 0),
                QuizQuestion("Kata ganti orang ketiga perempuan 'Dia (pr)' ditulis...", "她", listOf("她 (tā)", "他 (tā)", "它 (tā)", "你 (nǐ)"), 0)
            )
        )

        // ==================== BAB 3: Angka & Waktu (Pages 21-30) ====================
        addStandardChapter(
            startGlobal = 21, num = 3, title = "Angka & Waktu", zh = "数字和时间", icon = "🕐",
            goals = listOf("Menghitung 1 sampai 10.000", "Menyatakan jam dan menit", "Menyebutkan hari dalam seminggu", "Menyatakan tanggal dan tahun"),
            v1Title = "Angka Dasar",
            v1Words = listOf(
                VocabWord("一", "yī", "satu", "我有一个苹果。", "Saya punya satu apel."),
                VocabWord("二 / 两", "èr / liǎng", "dua", "两个朋友。", "Dua orang teman."),
                VocabWord("三", "sān", "tiga", "现在三点。", "Sekarang jam 3."),
                VocabWord("十", "shí", "sepuluh", "十个人。", "Sepuluh orang."),
                VocabWord("百", "bǎi", "ratus", "一百块钱。", "Seratus yuan."),
                VocabWord("千", "qiān", "ribu", "三千米。", "Tiga ribu meter."),
                VocabWord("万", "wàn", "puluh ribu (10.000)", "一万块。", "Sepuluh ribu yuan."),
                VocabWord("点", "diǎn", "jam (titik waktu)", "现在几点？", "Jam berapa sekarang?"),
                VocabWord("分", "fēn", "menit", "三点十五分。", "Pukul 3 lewat 15 menit."),
                VocabWord("半", "bàn", "setengah / 30 menit", "四点半。", "Pukul 4 setengah (4.30).")
            ),
            v2Title = "Hari, Tanggal & Periode Waktu",
            v2Words = listOf(
                VocabWord("今天", "jīntiān", "hari ini", "今天天气很好。", "Hari ini cuaca sangat bagus."),
                VocabWord("明天", "míngtiān", "besok", "明天见！", "Sampai jumpa besok!"),
                VocabWord("昨天", "zuótiān", "kemarin", "昨天我很忙。", "Kemarin saya sangat sibuk."),
                VocabWord("年", "nián", "tahun", "今年是二零二六年。", "Tahun ini tahun 2026."),
                VocabWord("月", "yuè", "bulan", "我五月去中国。", "Saya bulan Mei pergi ke China."),
                VocabWord("号 / 日", "hào / rì", "tanggal", "今天几号？", "Hari ini tanggal berapa?"),
                VocabWord("星期", "xīngqī", "minggu (pekan)", "今天星期几？", "Hari ini hari apa?"),
                VocabWord("现在", "xiànzài", "sekarang", "现在几点了？", "Sekarang sudah jam berapa?"),
                VocabWord("上午", "shàngwǔ", "pagi hari (AM)", "上午九点上课。", "Pukul 9 pagi masuk kelas."),
                VocabWord("下午", "xiàwǔ", "siang / sore (PM)", "下午三点开会。", "Pukul 3 sore rapat.")
            ),
            g1Title = "Sistem Jam & Menit",
            g1Items = listOf(
                GrammarItem("Menyebutkan Jam", "Angka + 点 (diǎn) + [Angka + 分 (fēn) / 半 (bàn)]", "Format jam dalam Mandarin mendahulukan jam kemudian menit.", listOf(GrammarExample("现在三点半。", "Xiànzài sān diǎn bàn.", "Sekarang pukul setengah empat."), GrammarExample("七点十五分。", "Qī diǎn shíwǔ fēn.", "Pukul 7 lewat 15 menit.")))
            ),
            g2Title = "Urutan Waktu: Dari Besar ke Kecil",
            g2Items = listOf(
                GrammarItem("Format Tanggal Mandarin", "Tahun (年) + Bulan (月) + Tanggal (号) + Hari (星期)", "Dalam bahasa Mandarin, komponen waktu disusun dari unit terbesar ke terkecil.", listOf(GrammarExample("二零二六年五月二十号，星期一。", "Èr líng èr liù nián wǔ yuè èrshí hào, xīngqī yī.", "Senin, 20 Mei 2026.")))
            ),
            d1Title = "Membuat Janji Temu", d1Icon = "⏰", d1SceneTitle = "Di Kantin", d1SceneDesc = "Menentukan waktu belajar bersama.",
            d1Lines = listOf(
                DialogLine("A", "现在几点？", "Xiànzài jǐ diǎn?", "Sekarang jam berapa?"),
                DialogLine("B", "现在下午三点十分。", "Xiànzài xiàwǔ sān diǎn shí fēn.", "Sekarang jam 3 lewat 10 sore."),
                DialogLine("A", "我们四点半在图书馆见，好吗？", "Wǒmen sì diǎn bàn zài túshūguǎn jiàn, hǎo ma?", "Kita ketemu di perpustakaan jam 4.30, bagaimana?"),
                DialogLine("B", "没问题，四点半见！", "Méi wèntí, sì diǎn bàn jiàn!", "Tidak masalah, sampai jumpa jam 4.30!")
            ),
            d2Title = "Menanyakan Jadwal Ujian", d2Icon = "📅", d2SceneTitle = "Di Kelas", d2SceneDesc = "Membicarakan tanggal penting.",
            d2Lines = listOf(
                DialogLine("A", "今天几号？星期几？", "Jīntiān jǐ hào? Xīngqī jǐ?", "Hari ini tanggal berapa? Hari apa?"),
                DialogLine("B", "今天五月二十号，星期一。", "Jīntiān wǔ yuè èrshí hào, xīngqī yī.", "Hari ini tanggal 20 Mei, hari Senin."),
                DialogLine("A", "考试是什么时候？", "Kǎoshì shì shénme shíhou?", "Ujiannya kapan?"),
                DialogLine("B", "明天上午九点整。", "Míngtiān shàngwǔ jiǔ diǎn zhěng.", "Besok pagi tepat jam sembilan.")
            ),
            rdTitle = "Angka Keberuntungan di China", rdZh = "中国的幸运数字", rdIcon = "🍀",
            rdText = "在中国文化中，数字具有独特的象征意义。数字八（bā）因发音类似\"发\"（发财 fācái）而被视为最吉利的数字。六（liù）代表顺利。而四（sì）因发音与\"死\"（sǐ）相近，常被人们避讳。",
            rdPy = "Zài Zhōngguó wénhuà zhōng, shùzì jùyǒu dútè de xiàngzhēng yìyì.",
            rdId = "Dalam kebudayaan Tiongkok, angka 8 dianggap paling membawa keberuntungan karena pengucapannya mirip kata 'makmur/kaya'. Angka 6 melambangkan kelancaran. Angka 4 sering dihindari karena mirip kata 'mati'.",
            rdNote = "Banyak gedung apartemen dan hotel di China tidak memiliki nomor lantai 4 atau 14.",
            exGroups = listOf(
                ExerciseGroup("A. Ubah Angka ke Pinyin", listOf("35 → sānshíwǔ", "88 → bāshíbā", "104 → yībǎi líng sì")),
                ExerciseGroup("B. Terjemahkan Waktu", listOf("Pukul 09.30 pagi → 上午九点半", "Hari ini hari Rabu → 今天星期三", "Besok jam 3 sore → 明天下午三点"))
            ),
            quizList = listOf(
                QuizQuestion("Bagaimana membaca angka 35 dalam bahasa Mandarin?", "三十五", listOf("sānshíwǔ", "sānwǔshí", "wǔshísān", "sānbǎiwǔ"), 0),
                QuizQuestion("Apa arti '三点半' (sān diǎn bàn)?", "三点半", listOf("Pukul 03.30 (setengah empat)", "Pukul 04.30 (setengah lima)", "Pukul 03.00", "Pukul 03.15"), 0),
                QuizQuestion("Hari Senin dalam bahasa Mandarin adalah...", "星期一", listOf("星期一 (xīngqī yī)", "星期日 (xīngqī rì)", "星期六 (xīngqī liù)", "星期二 (xīngqī èr)"), 0),
                QuizQuestion("Apa arti '今天几号？' (jīntiān jǐ hào)?", "今天几号", listOf("Hari ini tanggal berapa?", "Hari ini hari apa?", "Sekarang jam berapa?", "Tahun ini tahun berapa?"), 0),
                QuizQuestion("Angka berapa yang dianggap paling membawa rezeki dalam budaya China?", "八", listOf("8 (bā)", "4 (sì)", "7 (qī)", "3 (sān)"), 0)
            )
        )

        // ==================== BAB 4: Keluarga (Pages 31-40) ====================
        addStandardChapter(
            startGlobal = 31, num = 4, title = "Keluarga", zh = "家人", icon = "👨‍👩‍👧",
            goals = listOf("Menyebutkan anggota keluarga", "Menggunakan kata kerja kepemilikan 有", "Menanyakan jumlah anggota keluarga", "Menyatakan usia dengan 岁"),
            v1Title = "Keluarga Inti",
            v1Words = listOf(
                VocabWord("家", "jiā", "rumah / keluarga", "我家有四口人。", "Keluarga saya ada 4 orang."),
                VocabWord("爸爸", "bàba", "ayah / papa", "我爸爸是医生。", "Ayah saya seorang dokter."),
                VocabWord("妈妈", "māma", "ibu / mama", "妈妈做饭很好吃。", "Masakan ibu sangat lezat."),
                VocabWord("哥哥", "gēge", "kakak laki-laki", "我有一个哥哥。", "Saya punya seorang kakak laki-laki."),
                VocabWord("姐姐", "jiějie", "kakak perempuan", "姐姐在上海工作。", "Kakak perempuan bekerja di Shanghai."),
                VocabWord("弟弟", "dìdi", "adik laki-laki", "弟弟今年十岁。", "Adik laki-laki berusia 10 tahun."),
                VocabWord("妹妹", "mèimei", "adik perempuan", "妹妹喜欢画画。", "Adik perempuan suka menggambar."),
                VocabWord("儿子", "érzi", "anak laki-laki", "他有两个儿子。", "Dia memiliki dua anak laki-laki."),
                VocabWord("女儿", "nǚ'ér", "anak perempuan", "我女儿很聪明。", "Anak perempuanku sangat pintar.")
            ),
            v2Title = "Keluarga Besar & Kata Bantu",
            v2Words = listOf(
                VocabWord("爷爷", "yéye", "kakek (pihak ayah)", "爷爷八十岁了。", "Kakek berusia 80 tahun."),
                VocabWord("奶奶", "nǎinai", "nenek (pihak ayah)", "奶奶喜欢种花。", "Nenek suka menanam bunga."),
                VocabWord("外公", "wàigōng", "kakek (pihak ibu)", "外公住在农村。", "Kakek tinggal di desa."),
                VocabWord("外婆", "wàipó", "nenek (pihak ibu)", "外婆做点心。", "Nenek membuat kue."),
                VocabWord("孩子", "háizi", "anak / anak-anak", "你有几个孩子？", "Kamu punya berapa anak?"),
                VocabWord("岁", "suì", "tahun (usia)", "我今年二十岁。", "Saya tahun ini berusia 20 tahun."),
                VocabWord("有", "yǒu", "memiliki / ada", "我有两个姐姐。", "Saya punya dua kakak perempuan."),
                VocabWord("没有", "méiyǒu", "tidak punya / tidak ada", "我没有弟弟。", "Saya tidak punya adik laki-laki."),
                VocabWord("口", "kǒu", "kata bantu bilangan anggota keluarga", "五口人。", "Lima orang anggota keluarga.")
            ),
            g1Title = "Kepemilikan dengan 有 & 没有",
            g1Items = listOf(
                GrammarItem("Kata Kerja 有 (yǒu)", "Subjek + 有 + Objek", "Menyatakan kepemilikan. Bentuk negatifnya selalu 没有 (méiyǒu), TIDAK PERNAH 不有.", listOf(GrammarExample("我有一个哥哥。", "Wǒ yǒu yí ge gēge.", "Saya punya satu kakak laki-laki."), GrammarExample("他没有妹妹。", "Tā méiyǒu mèimei.", "Dia tidak punya adik perempuan.")))
            ),
            g2Title = "Menanyakan Jumlah & Usia",
            g2Items = listOf(
                GrammarItem("Menanyakan Anggota Keluarga", "你家有几口人？", "Kata bantu bilangan khusus untuk anggota keluarga yang tinggal serumah adalah 口 (kǒu).", listOf(GrammarExample("我家有四口人。", "Wǒ jiā yǒu sì kǒu rén.", "Keluarga saya ada 4 orang."))),
                GrammarItem("Menyatakan Usia dengan 岁 (suì)", "Subjek + Angka + 岁", "Untuk menyatakan umur, langsung pasangkan angka dengan 岁 tanpa kata kerja 是.", listOf(GrammarExample("我弟弟今年十岁。", "Wǒ dìdi jīnnián shí suì.", "Adik laki-lakiku tahun ini berumur 10 tahun.")))
            ),
            d1Title = "Bercerita Tentang Keluarga", d1Icon = "👨‍👩‍👦", d1SceneTitle = "Di Ruang Tamu", d1SceneDesc = "Melihat foto keluarga di album.",
            d1Lines = listOf(
                DialogLine("A", "你家有几口人？", "Nǐ jiā yǒu jǐ kǒu rén?", "Keluargamu ada berapa orang?"),
                DialogLine("B", "我家有五口人：爸爸、妈妈、哥哥、妹妹和我。", "Wǒ jiā yǒu wǔ kǒu rén: bàba, māma, gēge, mèimei hé wǒ.", "Keluargaku ada 5 orang: ayah, ibu, kakak laki-laki, adik perempuan, dan saya."),
                DialogLine("A", "你哥哥做什么工作？", "Nǐ gēge zuò shénme gōngzuò?", "Kakak laki-lakimu bekerja apa?"),
                DialogLine("B", "他是工程师，在雅加达工作。", "Tā shì gōngchéngshī, zài Yǎjiādá gōngzuò.", "Dia seorang insinyur, bekerja di Jakarta.")
            ),
            d2Title = "Kakek dan Nenek", d2Icon = "👵", d2SceneTitle = "Rumah Kakek", d2SceneDesc = "Menanyakan kabar kakek dan nenek.",
            d2Lines = listOf(
                DialogLine("A", "你爷爷多大年纪了？", "Nǐ yéye duō dà niánjì le?", "Kakekmu usianya berapa tahun?"),
                DialogLine("B", "他今年八十岁了，身体非常健康。", "Tā jīnnián bāshí suì le, shēntǐ fēicháng jiànkāng.", "Tahun ini beliau 80 tahun, badannya sangat sehat."),
                DialogLine("A", "他平时喜欢做什么？", "Tā píngshí xǐhuan zuò shénme?", "Biasanya beliau suka mengerjakan apa?"),
                DialogLine("B", "他每天早上都去公园散步。", "Tā měitiān zǎoshang dōu qù gōngyuán sànbù.", "Beliau setiap pagi pergi jalan santai di taman.")
            ),
            rdTitle = "Nilai Kekeluargaan Tionghoa", rdZh = "中国传统的家庭观念", rdIcon = "🏠",
            rdText = "在中国传统文化中，家庭是最核心的基石。孝顺父母、尊敬长辈是至关重要的道德准则。此外，亲属称谓极为精准严谨，根据父系母系、长幼辈分有严格区分。",
            rdPy = "Zài Zhōngguó chuántǒng wénhuà zhōng, jiātíng shì zuì héxīn de jīshí.",
            rdId = "Dalam budaya Tionghoa, keluarga adalah pilar paling utama. Berbakti kepada orang tua (xiào) adalah kebajikan tertinggi. Panggilan kekerabatan sangat spesifik.",
            rdNote = "Panggilan kakek dari ayah adalah 爷爷 (yéye), sedangkan kakek dari ibu adalah 外公 (wàigōng).",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我家有 [四] 口人。", "我 [没有] 姐姐。", "妹妹今年八 [岁]。")),
                ExerciseGroup("B. Terjemahkan", listOf("Keluarga saya ada 5 orang → 我家有五口人。", "Ayah saya adalah dokter → 我爸爸是医生。", "Dia berusia 20 tahun → 他二十岁。"))
            ),
            quizList = listOf(
                QuizQuestion("Apa arti dari '姐姐' (jiějie)?", "姐姐", listOf("Kakak perempuan", "Adik perempuan", "Kakak laki-laki", "Ibu"), 0),
                QuizQuestion("Bentuk negatif dari '有' (yǒu - punya) adalah...", "没有", listOf("没有 (méiyǒu)", "不有 (bù yǒu)", "无有 (wú yǒu)", "别有 (bié yǒu)"), 0),
                QuizQuestion("Kata bantu bilangan khusus untuk menghitung anggota keluarga dalam rumah adalah...", "口", listOf("口 (kǒu)", "个 (gè)", "本 (běn)", "张 (zhāng)"), 0),
                QuizQuestion("Kakek dari pihak ayah dipanggil...", "爷爷", listOf("爷爷 (yéye)", "外公 (wàigōng)", "叔叔 (shūshu)", "伯伯 (bóbo)"), 0),
                QuizQuestion("Apa terjemahan 'Saya tidak punya adik laki-laki'?", "我没有弟弟。", listOf("我没有弟弟。", "我不有弟弟。", "我无弟弟。", "我是没弟弟。"), 0)
            )
        )

        // ==================== BAB 5: Makanan & Minuman (Pages 41-50) ====================
        addStandardChapter(
            startGlobal = 41, num = 5, title = "Makanan & Minuman", zh = "饮食", icon = "🍜",
            goals = listOf("Menyebutkan makanan & minuman pokok", "Memesan makanan di restoran", "Menyatakan rasa suka dan tidak suka", "Menggunakan kata bantu 杯 (gelas) & 碗 (mangkuk)"),
            v1Title = "Makanan Pokok & Lauk",
            v1Words = listOf(
                VocabWord("吃", "chī", "makan", "我想吃炒饭。", "Saya ingin makan nasi goreng."),
                VocabWord("米饭", "mǐfàn", "nasi putih", "请来一碗米饭。", "Minta satu mangkuk nasi."),
                VocabWord("面条", "miàntiáo", "mie", "牛肉面条很好吃。", "Mie daging sapi sangat lezat."),
                VocabWord("饺子", "jiǎozi", "pangsit (dumpling)", "春节吃饺子。", "Saat Imlek makan pangsit."),
                VocabWord("菜", "cài", "hidangan / sayuran", "中国菜很好吃。", "Masakan China sangat enak."),
                VocabWord("肉", "ròu", "daging", "我不吃肥肉。", "Saya tidak makan daging berlemak."),
                VocabWord("鱼", "yú", "ikan", "清蒸鱼很鲜美。", "Ikan kukus sangat segar dan gurih."),
                VocabWord("鸡", "jī", "ayam", "宫保鸡丁。", "Ayam Gongbao (Kung Pao)."),
                VocabWord("蛋", "dàn", "telur", "番茄炒蛋。", "Tumis tomat telur."),
                VocabWord("汤", "tāng", "sup / kuah", "鸡汤很暖胃。", "Sup ayam menghangatkan perut.")
            ),
            v2Title = "Minuman & Peralatan Restoran",
            v2Words = listOf(
                VocabWord("喝", "hē", "minum", "你想喝什么？", "Kamu mau minum apa?"),
                VocabWord("水", "shuǐ", "air", "一杯温水，谢谢。", "Segelas air hangat, terima kasih."),
                VocabWord("茶", "chá", "teh", "中国人爱喝绿茶。", "Orang China suka minum teh hijau."),
                VocabWord("咖啡", "kāfēi", "kopi", "我要一杯冰咖啡。", "Saya mau segelas es kopi."),
                VocabWord("牛奶", "niúnǎi", "susu sapi", "早上一杯牛奶。", "Pagi hari segelas susu."),
                VocabWord("服务员", "fúwùyuán", "pelayan / pramusaji", "服务员，买单！", "Pelayan, minta bon pembayaran!"),
                VocabWord("菜单", "càidān", "buku menu", "请给我看一下菜单。", "Tolong berikan saya buku menu."),
                VocabWord("好吃", "hǎochī", "enak / lezat (makanan)", "这个菜真好吃！", "Hidangan ini sungguh lezat!"),
                VocabWord("好喝", "hǎohē", "enak / nikmat (minuman)", "中国茶很好喝。", "Teh China sangat nikmat."),
                VocabWord("碗 / 杯", "wǎn / bēi", "mangkuk / cangkir (gelas)", "两碗饭，一杯茶。", "Dua mangkuk nasi, satu cangkir teh.")
            ),
            g1Title = "Keinginan dengan 想 & Kata Penggolong",
            g1Items = listOf(
                GrammarItem("Kata Kerja Bantu 想 (xiǎng)", "Subjek + 想 + Kata Kerja + Objek", "Menyatakan keinginan atau niat untuk melakukan sesuatu.", listOf(GrammarExample("我想吃中国菜。", "Wǒ xiǎng chī Zhōngguó cài.", "Saya ingin makan masakan China."), GrammarExample("你想喝点什么？", "Nǐ xiǎng hē diǎn shénme?", "Kamu ingin minum apa?"))),
                GrammarItem("Kata Penggolong 碗 (wǎn) & 杯 (bēi)", "Angka + 碗 / 杯 + Nomina", "碗 untuk makanan bermangkuk (nasi, sup); 杯 untuk minuman (teh, kopi, air).", listOf(GrammarExample("我要一碗面条。", "Wǒ yào yì wǎn miàntiáo.", "Saya minta satu mangkuk mie."), GrammarExample("来两杯茶。", "Lái liǎng bēi chá.", "Minta dua cangkir teh.")))
            ),
            g2Title = "Menyatakan Kesukaan dengan 喜欢",
            g2Items = listOf(
                GrammarItem("喜欢 (xǐhuan) & 不喜欢 (bù xǐhuan)", "Subjek + 喜欢 / 不喜欢 + Nomina / Verba", "Menyatakan preferensi selera rasa.", listOf(GrammarExample("我很喜欢吃饺子。", "Wǒ hěn xǐhuan chī jiǎozi.", "Saya sangat suka makan pangsit."), GrammarExample("我不喜欢吃辣的。", "Wǒ bù xǐhuan chī là de.", "Saya tidak suka makan yang pedas.")))
            ),
            d1Title = "Memesan Makanan di Restoran", d1Icon = "🍽️", d1SceneTitle = "Di Restoran China", d1SceneDesc = "Memesan makan siang kepada pelayan.",
            d1Lines = listOf(
                DialogLine("A", "服务员，请给我们菜单。", "Fúwùyuán, qǐng gěi wǒmen càidān.", "Pelayan, tolong beri kami menu."),
                DialogLine("B", "好的，这是菜单。请问两位想吃什么？", "Hǎo de, zhè shì càidān. Qǐngwèn liǎng wèi xiǎng chī shénme?", "Baik, ini menunya. Permisi berdua ingin makan apa?"),
                DialogLine("A", "我们要一盘宫保鸡丁，一碗牛肉面。", "Wǒmen yào yì pán Gōngbǎo jīdīng, yì wǎn niúròu miàn.", "Kami minta satu piring ayam Kung Pao, satu mangkuk mie sapi."),
                DialogLine("B", "好的，请问喝什么饮料？", "Hǎo de, qǐngwèn hē shénme yǐnliào?", "Baik, permisi mau minum apa?"),
                DialogLine("A", "来一壶热绿茶，谢谢。", "Lái yì hú rè lǜchá, xièxie.", "Minta satu teko teh hijau panas, terima kasih.")
            ),
            d2Title = "Membicarakan Makanan Favorit", d2Icon = "🍜", d2SceneTitle = "Santai Sore", d2SceneDesc = "Membahas selera kuliner khas.",
            d2Lines = listOf(
                DialogLine("A", "你最喜欢吃什么中国菜？", "Nǐ zuì xǐhuan chī shénme Zhōngguó cài?", "Masakan China apa yang paling kamu sukai?"),
                DialogLine("B", "我最喜欢吃北京烤鸭和水饺。", "Wǒ zuì xǐhuan chī Běijīng kǎoyā hé shuǐjiǎo.", "Saya paling suka bebek panggang Beijing dan pangsit rebus."),
                DialogLine("A", "你习惯用筷子吗？", "Nǐ xíguàn yòng kuàizi ma?", "Apakah kamu sudah terbiasa menggunakan sumpit?"),
                DialogLine("B", "习惯了，用筷子很有意思！", "Xíguàn le, yòng kuàizi hěn yǒu yìsi!", "Sudah terbiasa, memakai sumpit sangat menyenangkan!")
            ),
            rdTitle = "Delapan Aliran Kuliner China", rdZh = "中国八大菜系", rdIcon = "🥢",
            rdText = "中国幅员辽阔，饮食文化源远流长。著名的\"八大菜系\"包括：川菜（麻辣鲜香）、粤菜（清淡鲜嫩）、鲁菜（咸鲜浓郁）、苏菜等。中国人吃饭使用筷子，讲究色、香、味俱全。",
            rdPy = "Zhōngguó fúyuán liáokuò, yǐnshí wénhuà yuányuǎn-liúcháng.",
            rdId = "Kuliner China memiliki '8 Aliran Besar' yang legendaris, seperti masakan Sichuan (pedas menyengat), Kanton (segar dan lembut), serta Shandong. Orang Tionghoa makan menggunakan sumpit.",
            rdNote = "Etiket penting: jangan pernah menancapkan sumpit tegak di atas mangkuk nasi, karena menyerupai dupa sesaji.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我想 [喝] 一杯茶。", "请给我一 [碗] 米饭。", "这个菜很 [好吃]。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya mau makan mie → 我想吃面条。", "Pelayan, minta bon! → 服务员，买单！", "Teh China sangat enak diminum → 中国茶很好喝。"))
            ),
            quizList = listOf(
                QuizQuestion("Apa arti dari '面条' (miàntiáo)?", "面条", listOf("Mie", "Nasi", "Sup", "Pangsit"), 0),
                QuizQuestion("Untuk memesan segelas teh, kata penggolong yang tepat adalah...", "杯", listOf("杯 (bēi)", "碗 (wǎn)", "张 (zhāng)", "本 (běn)"), 0),
                QuizQuestion("Bagaimana mengucapkan 'Pelayan, minta bon pembayaran!'?", "服务员，买单！", listOf("服务员，买单！", "服务员，再见！", "服务员，你好！", "服务员，菜单！"), 0),
                QuizQuestion("Kata '好喝' (hǎohē) digunakan untuk...", "好喝", listOf("Minuman yang enak / nikmat", "Makanan yang enak", "Orang yang ramah", "Tempat yang indah"), 0),
                QuizQuestion("Apa terjemahan 'Saya ingin makan pangsit'?", "我想吃饺子。", listOf("我想吃饺子。", "我喜欢喝饺子。", "我要买水。", "我不吃面条。"), 0)
            )
        )

        return pages
    }
}
