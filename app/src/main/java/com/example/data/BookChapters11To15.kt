package com.example.data

object BookChapters11To15 {

    fun getPages(): List<BookPage> {
        val pages = mutableListOf<BookPage>()

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

        // ==================== BAB 11: Sekolah & Pekerjaan (Pages 101-110) ====================
        addStandardChapter(
            startGlobal = 101, num = 11, title = "Sekolah & Dunia Kerja", zh = "学校与职场", icon = "🎓",
            goals = listOf("Menyebutkan jenjang pendidikan & jurusan studi", "Menyatakan profesi pekerjaan dengan 想当", "Menyatakan tempat bekerja dengan 在…工作", "Membicarakan rencana pascakelulusan (毕业以后)"),
            v1Title = "Kehidupan Kampus & Belajar",
            v1Words = listOf(
                VocabWord("大学", "dàxué", "universitas / perguruan tinggi", "我在北京大学学习。", "Saya belajar di Universitas Peking."),
                VocabWord("专业", "zhuānyè", "jurusan kuliah", "我的专业是国际中文教育。", "Jurusan saya pendidikan bahasa Mandarin internasional."),
                VocabWord("学习", "xuéxí", "belajar", "努力学习天天向上。", "Belajar giat maju setiap hari."),
                VocabWord("考试", "kǎoshì", "ujian / tes", "明天有汉语期末考试。", "Besok ada ujian akhir semester Mandarin."),
                VocabWord("毕业", "bìyè", "lulus kuliah / wisuda", "我明年夏天毕业。", "Saya lulus musim panas tahun depan."),
                VocabWord("同学", "tóngxué", "teman sekelas", "大家都是好同学。", "Semua adalah teman sekelas yang baik."),
                VocabWord("图书馆", "túshūguǎn", "perpustakaan", "在图书馆借两本书。", "Meminjam dua buku di perpustakaan."),
                VocabWord("教授", "jiàoshòu", "profesor", "张教授讲课生动幽默。", "Profesor Zhang mengajar dengan hidup."),
                VocabWord("学期", "xuéqī", "semester", "这个学期功课很多。", "Semester ini tugas sangat banyak."),
                VocabWord("奖学金", "jiǎngxuéjīn", "beasiswa", "申请中国政府奖学金。", "Mendaftar beasiswa pemerintah Tiongkok.")
            ),
            v2Title = "Profesi & Karier",
            v2Words = listOf(
                VocabWord("工作", "gōngzuò", "bekerja / pekerjaan", "你在哪家公司工作？", "Kamu bekerja di perusahaan mana?"),
                VocabWord("公司", "gōngsī", "perusahaan", "一家跨国科技公司。", "Sebuah perusahaan teknologi multinasional."),
                VocabWord("工程师", "gōngchéngshī", "insinyur", "软件工程师。", "Insinyur perangkat lunak."),
                VocabWord("律师", "lǜshī", "pengacara", "律师正在研究案件。", "Pengacara sedang meneliti kasus."),
                VocabWord("商人", "shāngrén", "pengusaha / pebisnis", "他是很有远见的商人。", "Dia pebisnis yang berpandangan jauh."),
                VocabWord("经理", "jīnglǐ", "manajer", "王经理正在办公室。", "Manajer Wang sedang di kantor."),
                VocabWord("同事", "tóngshì", "rekan kerja", "我和同事相处融洽。", "Saya akrab dengan rekan kerja."),
                VocabWord("面试", "miànshì", "wawancara kerja", "准备明天的求职面试。", "Mempersiapkan wawancara kerja besok."),
                VocabWord("梦想", "mèngxiǎng", "cita-cita / impian", "我的梦想是做外交官。", "Cita-cita saya menjadi diplomat."),
                VocabWord("当", "dāng", "menjadi (profesi)", "我想当一名汉语老师。", "Saya ingin menjadi seorang guru Mandarin.")
            ),
            g1Title = "Cita-cita & Tempat Kerja",
            g1Items = listOf(
                GrammarItem("想当 (xiǎng dāng) — Ingin Menjadi", "Subjek + 想当 + Profesi", "Digunakan untuk mengungkapkan impian karier.", listOf(GrammarExample("我想当医生。", "Wǒ xiǎng dāng yīshēng.", "Saya ingin menjadi dokter."), GrammarExample("你以后想当什么？", "Nǐ yǐhòu xiǎng dāng shénme?", "Di masa depan kamu ingin menjadi apa?"))),
                GrammarItem("在…工作 (Bekerja di)", "Subjek + 在 + Tempat + 工作", "Menyatakan tempat seseorang berkarier.", listOf(GrammarExample("我在一家外企工作。", "Wǒ zài yì jiā wàiqǐ gōngzuò.", "Saya bekerja di perusahaan asing.")))
            ),
            g2Title = "Pola Waktu 以后 (Setelah)",
            g2Items = listOf(
                GrammarItem("Kejadian + 以后 (yǐhòu)", "Kegiatan/Masa + 以后，...", "Menyatakan masa setelah suatu peristiwa terlaksana.", listOf(GrammarExample("毕业以后，我打算去中国留学。", "Bìyè yǐhòu, wǒ dǎsuàn qù Zhōngguó liúxué.", "Setelah lulus, saya berencana kuliah ke China."), GrammarExample("下课以后我们去吃午饭。", "Xiàkè yǐhòu wǒmen qù chī wǔfàn.", "Setelah selesai kelas kita pergi makan siang.")))
            ),
            d1Title = "Bincang Jurusan & Masa Depan", d1Icon = "💼", d1SceneTitle = "Di Perpustakaan Kampus", d1SceneDesc = "Membicarakan bidang studi dan prospek.",
            d1Lines = listOf(
                DialogLine("A", "请问你的专业是什么？", "Qǐngwèn nǐ de zhuānyè shì shénme?", "Permisi jurusan kuliahmu apa?"),
                DialogLine("B", "我的专业是国际贸易与汉语。你呢？", "Wǒ de zhuānyè shì guójì màoyì yǔ Hànyǔ. Nǐ ne?", "Jurusan saya perdagangan internasional dan bahasa Mandarin. Kamu?"),
                DialogLine("A", "我是计算机科学专业的，正在学人工智能。", "Wǒ shì jìsuànjī kēxué zhuānyè de, zhèngzài xué réngōng zhìnéng.", "Saya jurusan ilmu komputer, sedang mempelajari kecerdasan buatan."),
                DialogLine("B", "太棒了！现在科技行业非常需要这方面人才。", "Tài bàng le! Xiànzài kējì hángyè fēicháng xūyào zhè fāngmiàn réncái.", "Hebat sekali! Saat ini industri teknologi sangat butuh talenta bidang itu.")
            ),
            d2Title = "Rencana Pascakelulusan", d2Icon = "🎯", d2SceneTitle = "Bincang Santai", d2SceneDesc = "Membahas rencana setelah wisuda sarjana.",
            d2Lines = listOf(
                DialogLine("A", "明明白天毕业以后，你打算留在北京还是回国？", "Míngmíng báitiān bìyè yǐhòu, nǐ dǎsuàn liú zài Běijīng háishi huíguó?", "Setelah lulus, apakah kamu berencana menetap di Beijing atau pulang ke tanah air?"),
                DialogLine("B", "我想先在北京工作两年，积累宝贵的工作经验。", "Wǒ xiǎng xiān zài Běijīng gōngzuò liǎng nián, jīlěi bǎoguì de gōngzuò jīngyàn.", "Saya ingin bekerja 2 tahun dulu di Beijing untuk menimba pengalaman berharga."),
                DialogLine("A", "好志向！希望你顺利拿到理想公司的录取通知。", "Hǎo zhìxiàng! Xīwàng nǐ shùnlì nádào lǐxiǎng gōngsī de lùqǔ tōngzhī.", "Tekad yang bagus! Semoga kamu lancar diterima di perusahaan idaman."),
                DialogLine("B", "借你吉言，我们一起加油！", "Jiè nǐ jíyán, wǒmen yìqǐ jiāyóu!", "Terima kasih doamu, mari kita berjuang bersama!")
            ),
            rdTitle = "Ujian Masuk Universitas (Gaokao)", rdZh = "中国的高考文化", rdIcon = "🏫",
            rdText = "中国的高考（普通高等学校招生全国统一考试）于每年6月举行，是数千万青年人生的重要转折点。全社会都为考生护航。优异的高考成绩是进入清华、北大等顶尖学府的金钥匙。",
            rdPy = "Zhōngguó de gāokǎo yú měinián liù yuè jǔxíng.",
            rdId = "Gaokao adalah ujian masuk universitas nasional di China setiap bulan Juni yang diikuti lebih dari 10 juta siswa. Nilai Gaokao menentukan kesempatan masuk ke kampus elit seperti Tsinghua dan Peking University.",
            rdNote = "Selama hari Gaokao, masyarakat menjaga keheningan jalanan demi kenyamanan ujian para siswa.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我的 [专业] 是汉语。","毕业 [以后] 我要去中国。","我想 [当] 工程师。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya belajar di universitas → 我在大学学习。", "Cita-cita saya menjadi guru → 我的梦想是当老师。", "Di mana kamu bekerja? → 你在哪儿工作？"))
            ),
            quizList = listOf(
                QuizQuestion("Kosa kata '专业' (zhuānyè) memiliki arti...", "专业", listOf("Jurusan kuliah / spesialisasi", "Tugas pekerjaan", "Gedung sekolah", "Ujian semester"), 0),
                QuizQuestion("Bagaimana menyatakan 'Saya ingin menjadi dokter'?", "想当医生", listOf("我想当医生。", "我想买医生。", "我是找医生。", "我想去医生。"), 0),
                QuizQuestion("Kata '毕业' (bìyè) berarti...", "毕业", listOf("Lulus kuliah / wisuda", "Mendaftar kuliah", "Mengerjakan PR", "Gagal ujian"), 0),
                QuizQuestion("Preposisi yang tepat untuk 'bekerja di perusahaan' adalah...", "在公司工作", listOf("在公司工作", "去公司工作", "对公司工作", "为公司工作"), 0),
                QuizQuestion("Arti dari kata '同事' (tóngshì) adalah...", "同事", listOf("Rekan kerja sejawat", "Teman sekelas", "Atasan kantor", "Pelanggan"), 0)
            )
        )

        // ==================== BAB 12: Tubuh & Kesehatan (Pages 111-120) ====================
        addStandardChapter(
            startGlobal = 111, num = 12, title = "Tubuh & Kesehatan", zh = "身体与健康", icon = "🏥",
            goals = listOf("Menyebutkan bagian tubuh utama", "Mengungkapkan keluhan sakit dengan 疼 (téng)", "Menggunakan partikel perubahan 了 untuk gejala", "Memberikan saran kesehatan dengan 应该 (sebaiknya)"),
            v1Title = "Bagian Tubuh",
            v1Words = listOf(
                VocabWord("身体", "shēntǐ", "tubuh / badan / kesehatan", "祝你身体健康！", "Semoga badanmu selalu sehat!"),
                VocabWord("头", "tóu", "kepala", "我头疼得很厉害。", "Kepalaku sakit sekali."),
                VocabWord("眼睛", "yǎnjing", "mata", "少看手机，保护眼睛。", "Kurangi main HP, lindungi mata."),
                VocabWord("鼻子", "bízi", "hidung", "鼻子不通气。", "Hidung tersumbat."),
                VocabWord("耳朵", "ěrduo", "telinga", "戴耳机对耳朵不好。", "Pakai earphone berlebihan kurang baik untuk telinga."),
                VocabWord("嘴 / 口", "zuǐ / kǒu", "mulut", "张开嘴，说'啊'。", "Buka mulut, ucapkan 'aa'."),
                VocabWord("牙齿", "yáchǐ", "gigi", "牙疼不是病，疼起来真要命。", "Sakit gigi sungguh menyiksa."),
                VocabWord("手", "shǒu", "tangan", "饭前便后要洗手。", "Cuci tangan sebelum makan."),
                VocabWord("脚 / 腿", "jiǎo / tuǐ", "kaki / tungkai", "爬山走得腿酸。", "Mendaki gunung kaki terasa pegal."),
                VocabWord("肚子", "dùzi", "perut", "我肚子疼，可能吃坏了。", "Perutku sakit, mungkin salah makan.")
            ),
            v2Title = "Gejala Sakit & Pengobatan",
            v2Words = listOf(
                VocabWord("生病", "shēngbìng", "jatuh sakit", "生病了要看医生。", "Jika sakit harus periksa ke dokter."),
                VocabWord("感冒", "gǎnmào", "flu / masuk angin", "我不小心感冒了。", "Saya tidak sengaja kena flu."),
                VocabWord("发烧", "fāshāo", "demam tinggi", "体温三十八度，发烧了。", "Suhu badan 38 derajat, demam."),
                VocabWord("咳嗽", "késou", "batuk", "干咳没有痰。", "Batuk kering tanpa dahak."),
                VocabWord("疼", "téng", "sakit / nyeri", "浑身酸疼。", "Sekujur badan terasa nyeri."),
                VocabWord("药", "yào", "obat", "按时吃药。", "Minum obat tepat waktu."),
                VocabWord("检查", "jiǎnchá", "memeriksa", "医生做全身检查。", "Dokter melakukan pemeriksaan menyeluruh."),
                VocabWord("休息", "xiūxi", "beristirahat", "多喝热水多休息。", "Banyak minum air hangat dan istirahat."),
                VocabWord("舒服", "shūfu", "nyaman / enak badan", "我今天浑身不舒服。", "Badanku hari ini kurang enak badan."),
                VocabWord("厉害", "lìhai", "hebat / parah", "咳嗽得很厉害。", "Batuknya sangat parah.")
            ),
            g1Title = "Menyatakan Keluhan & Rasa Sakit",
            g1Items = listOf(
                GrammarItem("Rasa Sakit (疼 téng)", "Bagian Tubuh + 疼", "Menyatakan bagian tubuh yang terasa sakit atau nyeri.", listOf(GrammarExample("我头疼，肚子也疼。", "Wǒ tóuténg, dùzi yě téng.", "Kepala saya sakit, perut juga sakit."), GrammarExample("你哪儿不舒服？", "Nǐ nǎr bù shūfu?", "Di bagian mana yang tidak enak badan?"))),
                GrammarItem("Partikel Perubahan 了 (le)", "Gejala + 了", "Menunjukkan perubahan status dari sehat menjadi timbul gejala penyakit.", listOf(GrammarExample("他发烧了，三十九度。", "Tā fāshāo le, sānshíjiǔ dù.", "Dia sudah demam, 39 derajat."), GrammarExample("我感冒了。", "Wǒ gǎnmào le.", "Saya kena flu.")))
            ),
            g2Title = "Memberi Saran Medis dengan 应该",
            g2Items = listOf(
                GrammarItem("Saran 应该 (yīnggāi) — Sebaiknya / Harus", "Subjek + 应该 + Tindakan Solusi", "Digunakan untuk menasihati seseorang demi kebaikan kesehatannya.", listOf(GrammarExample("你应该立刻去医院看医生。", "Nǐ yīnggāi lìkè qù yīyuàn kàn yīshēng.", "Kamu sebaiknya segera pergi ke rumah sakit periksa dokter."), GrammarExample("应该多喝温开水，好好休息。", "Yīnggāi duō hē wēn kāishuǐ, hǎohǎo xiūxi.", "Sebaiknya banyak minum air putih hangat dan istirahat baik-baik.")))
            ),
            d1Title = "Konsultasi di Klinik Dokter", d1Icon = "🩺", d1SceneTitle = "Di Ruang Pemeriksaan", d1SceneDesc = "Budi berkonsultasi kepada dokter.",
            d1Lines = listOf(
                DialogLine("A", "大夫，我从昨天开始发烧，咽喉很痛。", "Dàifu, wǒ cóng zuótiān kāishǐ fāshāo, yānhóu hěn tòng.", "Dokter, saya sejak kemarin mulai demam, tenggorokan sangat sakit."),
                DialogLine("B", "请量一下体温，张开嘴我看一下嗓子。", "Qǐng liáng yíxià tǐwēn, zhāngkāi zuǐ wǒ kàn yíxià sǎngzi.", "Tolong ukur suhu badan dulu, buka mulut saya periksa tenggorokan."),
                DialogLine("A", "严重吗？需要打针吗？", "Yánzhòng ma? Xūyào dǎzhēn ma?", "Parah tidak? Apakah perlu disuntik?"),
                DialogLine("B", "是急性上呼吸道感染，不用打针。我给你开盒感冒药，一天三次，饭后服用。", "Shì jíxìng shànghūxīdào gǎnrǎn, bú yòng dǎzhēn. Wǒ gěi nǐ kāi hé gǎnmàoyào, yì tiān sān cì, fànhòu fúyòng.", "Infeksi saluran pernapasan akut, tidak perlu suntik. Saya resepkan obat flu, sehari 3 kali setelah makan.")
            ),
            d2Title = "Menjenguk Teman yang Sakit", d2Icon = "💊", d2SceneTitle = "Di Kamar Asrama", d2SceneDesc = "Mengunjungi kawan yang sedang flu.",
            d2Lines = listOf(
                DialogLine("A", "听说你生病请假了，现在觉得怎么样？", "Tīngshuō nǐ shēngbìng qǐngjià le, xiànzài juéde zěnmeyàng?", "Kudengar kamu sakit izin tidak masuk, sekarang rasanya bagaimana?"),
                DialogLine("B", "吃了退烧药，出了一身汗，好多了。", "Chī le tuìshāoyào, chū le yì shēn hàn, hǎo duō le.", "Sudah minum obat penurun demam, berkeringat sekujur badan, jauh lebih mendingan."),
                DialogLine("A", "我给你带了新鲜橙子和热鸡汤，补充维生素。", "Wǒ gěi nǐ dài le xīnxiān chéngzi hé rè jītāng, bǔchōng wéishēngsù.", "Saya bawakan jeruk segar dan sup ayam hangat untuk asupan vitamin."),
                DialogLine("B", "太贴心了，真谢谢你的关心！", "Tài tiēxīn le, zhēn xièxie nǐ de guānxīn!", "Sangat perhatian, sungguh terima kasih atas kepedulianmu!")
            ),
            rdTitle = "Pengobatan Tradisional Tiongkok (TCM)", rdZh = "博大精深的中医文化", rdIcon = "🌿",
            rdText = "中医（中医药学）已有数千年悠久历史。中医诊断讲究\"望、闻、问、切\"四诊合参，治病强调阴阳平衡与天人合一。草药、针灸、拔罐、推拿等特色疗法在当代仍深受大众推崇。",
            rdPy = "Zhōngyī yǐ yǒu shù qiān nián yōujiǔ lìshǐ.",
            rdId = "Pengobatan Tradisional Tiongkok (Zhongyi / TCM) telah berusia ribuan tahun. Diagnosanya menggunakan 4 metode: mengamati, mencium/mendengar, menanya, dan meraba denyut nadi. Terapi akupunktur dan ramuan herba sangat dihormati.",
            rdNote = "Masyarakat Tiongkok sangat gemar meminum air hangat (喝热水) sebagai kebiasaan menjaga metabolisme tubuh.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我 [头] 疼得厉害。","他发 [烧] 了，三十九度。","你应该多 [休息]。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya terkena flu → 我感冒了。", "Kepala saya sakit → 我头疼。", "Kamu sebaiknya pergi ke dokter → 你应该看医生。"))
            ),
            quizList = listOf(
                QuizQuestion("Kosa kata '头疼' (tóuténg) berarti...", "头疼", listOf("Sakit kepala", "Sakit perut", "Sakit gigi", "Sakit punggung"), 0),
                QuizQuestion("Apa arti dari '发烧' (fāshāo)?", "发烧", listOf("Demam / meriang", "Batuk berdahak", "Tergelincir", "Mengantuk"), 0),
                QuizQuestion("Kata kerja bantu '应该' (yīnggāi) memiliki arti...", "应该", listOf("Sebaiknya / seharusnya", "Tidak boleh", "Pernah", "Sangat suka"), 0),
                QuizQuestion("Benda untuk mengobati penyakit '药' (yào) berarti...", "药", listOf("Obat", "Gelas", "Termometer", "Makanan"), 0),
                QuizQuestion("Bagaimana menanyakan keluhan 'Kamu kenapa?' dengan empati?", "你怎么了？", listOf("你怎么了？", "你是谁？", "你去哪儿？", "你几岁？"), 0)
            )
        )

        // ==================== BAB 13: Rumah & Perabot (Pages 121-130) ====================
        addStandardChapter(
            startGlobal = 121, num = 13, title = "Rumah & Tempat Tinggal", zh = "我家与居所", icon = "🏠",
            goals = listOf("Menyebutkan tata ruang di dalam rumah", "Menyebutkan perabotan rumah tangga", "Menyatakan keberadaan benda di dalam ruangan dengan 里/上/下", "Menggunakan kata penggolong perabot 张/把/个"),
            v1Title = "Ruangan di Dalam Rumah",
            v1Words = listOf(
                VocabWord("房子", "fángzi", "rumah / bangunan hunian", "我家的新房子很宽敞。", "Rumah baru saya sangat lapang."),
                VocabWord("房间", "fángjiān", "kamar / ruangan", "三室一厅的公寓。", "Apartemen 3 kamar tidur 1 ruang tamu."),
                VocabWord("客厅", "kètīng", "ruang tamu / ruang keluarga", "我们在客厅看电视。", "Kami menonton TV di ruang tamu."),
                VocabWord("卧室", "wòshì", "kamar tidur", "主卧室连着阳台。", "Kamar tidur utama terhubung ke balkon."),
                VocabWord("厨房", "chúfáng", "dapur", "爸爸在厨房煲汤。", "Ayah sedang merebus sup di dapur."),
                VocabWord("卫生间 / 浴室", "wèishēngjiān", "kamar mandi / toilet", "卫生间非常干净。", "Kamar mandi sangat bersih."),
                VocabWord("阳台", "yángtái", "balkon / beranda", "阳台上种满了绿植花卉。", "Balkon dipenuhi tanaman hias."),
                VocabWord("门", "mén", "pintu rumah", "出门记得锁门。", "Keluar rumah ingat mengunci pintu."),
                VocabWord("窗户", "chuānghu", "jendela", "打开窗户透透气。", "Buka jendela agar udara bersirkulasi."),
                VocabWord("灯", "dēng", "lampu", "客厅的水晶吊灯。", "Lampu gantung kristal di ruang tamu.")
            ),
            v2Title = "Perabotan & Fasilitas Rumah",
            v2Words = listOf(
                VocabWord("桌子", "zhuōzi", "meja", "书桌上有一台电脑。", "Di atas meja tulis ada satu komputer."),
                VocabWord("椅子", "yǐzi", "kursi", "木头椅子很结实。", "Kursi kayu sangat kokoh."),
                VocabWord("床", "chuáng", "tempat tidur / ranjang", "一张舒适的双人床。", "Satu ranjang ganda yang nyaman."),
                VocabWord("沙发", "shāfā", "sofa", "真皮沙发柔软舒适。", "Sofa kulit sangat lembut dan empuk."),
                VocabWord("电视", "diànshì", "televisi", "大屏幕智能电视。", "Televisi pintar layar lebar."),
                VocabWord("冰箱", "bīngxiāng", "kulkas / lemari es", "冰箱里有新鲜牛奶。", "Di kulkas ada susu segar."),
                VocabWord("空调", "kōngtiáo", "AC / pendingin ruangan", "夏天开空调很凉快。", "Musim panas menyalakan AC sangat sejuk."),
                VocabWord("洗衣机", "xǐyījī", "mesin cuci", "用全自动洗衣机洗衣服。", "Mencuci baju dengan mesin cuci otomatis."),
                VocabWord("衣柜", "yīguì", "lemari pakaian", "把衣服挂在衣柜里。", "Gantung pakaian di dalam lemari."),
                VocabWord("书架", "shūjià", "rak buku", "书架上摆满了中文书。", "Rak buku dipenuhi buku bahasa Mandarin.")
            ),
            g1Title = "Keberadaan Ruang dengan 方位词 (Preposisi Arah)",
            g1Items = listOf(
                GrammarItem("Lokasi + 里 / 上 / 下 + 有 + Benda", "Tempat/Benda + 里/上/下 + 有 + Objek", "Struktur klasik menyatakan keberadaan objek di dalam/atas/bawah perabot.", listOf(GrammarExample("房间里有一张大床。", "Fángjiān lǐ yǒu yì zhāng dà chuáng.", "Di dalam kamar ada satu ranjang besar."), GrammarExample("桌子上放着一本词典。", "Zhuōzi shàng fàng zhe yì běn cídiǎn.", "Di atas meja tergeletak satu kamus.")))
            ),
            g2Title = "Kata Penggolong Perabot: 张, 把, 台",
            g2Items = listOf(
                GrammarItem("Kata Penggolong Perabot Rumah", "Angka + 量词 + Perabot", "张 untuk permukaan datar (meja, tempat tidur); 把 untuk benda bergagang/sandaran (kursi); 台 untuk perabot elektronik (TV, kulkas, AC, mesin cuci).", listOf(GrammarExample("一张床和一张书桌。", "Yì zhāng chuáng hé yì zhāng shūzhuō.", "Satu ranjang dan satu meja belajar."), GrammarExample("两把木椅子。", "Liǎng bǎ mù yǐzi.", "Dua buah kursi kayu."), GrammarExample("一台新空调。", "Yì tái xīn kōngtiáo.", "Satu unit AC baru.")))
            ),
            d1Title = "Kunjungan ke Rumah Teman", d1Icon = "🏠", d1SceneTitle = "Bertamu di Akhir Pekan", d1SceneDesc = "Mengagumi penataan rumah baru teman.",
            d1Lines = listOf(
                DialogLine("A", "请进请进！欢迎来我家做客。", "Qǐng jìn qǐng jìn! Huānyíng lái wǒ jiā zuòkè.", "Silakan masuk! Selamat datang bertamu ke rumahku."),
                DialogLine("B", "打扰了！哇，你家客厅采光真好，又大又明亮！", "Dǎrǎo le! Wā, nǐ jiā kètīng cǎiguāng zhēn hǎo, yòu dà yòu míngliàng!", "Permisi mengganggu! Wah, pencahayaan ruang tamumu bagus sekali, besar dan terang!"),
                DialogLine("A", "请在沙发上坐，我去给你倒一杯热茶。", "Qǐng zài shāfā shàng zuò, wǒ qù gěi nǐ dào yì bēi rè chá.", "Silakan duduk di sofa, saya buatkan secangkir teh hangat."),
                DialogLine("B", "阳台上的兰花开得真娇艳，太温馨了！", "Yángtái shàng de lánhuā kāi de zhēn jiāoyàn, tài wēnxīn le!", "Bunga anggrek di balkon mekar sangat indah, rumah yang sangat hangat!")
            ),
            d2Title = "Menyewa Apartemen", d2Icon = "🔑", d2SceneTitle = "Di Kantor Agen Properti", d2SceneDesc = "Mencari apartemen sewaan di dekat kampus.",
            d2Lines = listOf(
                DialogLine("A", "您好，我想在五道口附近租一套一居室的房子。", "Nín hǎo, wǒ xiǎng zài Wǔdàokǒu fùjìn zū yí tào yījūshì de fángzi.", "Halo, saya ingin menyewa apartemen satu kamar di sekitar Wudaokou."),
                DialogLine("B", "没问题，您对家具有什么要求？", "Méi wèntí, nín duì jiājù yǒu shénme yāoqiú?", "Tidak masalah, apa persyaratan perabotan yang Anda inginkan?"),
                DialogLine("A", "需要配有床、书桌、衣柜，还有洗衣机和冰箱。", "Xūyào pèiyǒu chuáng, shūzhuō, yīguì, hái yǒu xǐyījī hé bīngxiāng.", "Perlu dilengkapi ranjang, meja belajar, lemari, serta mesin cuci dan kulkas."),
                DialogLine("B", "正好有一套刚装修好的，随时可以拎包入住！", "Zhènghǎo yǒu yí tào gāng zhuāngxiū hǎo de, suíshí kěyǐ līn bāo rùzhù!", "Pas sekali ada unit baru direnovasi, bisa langsung masuk bawa koper kapan saja!")
            ),
            rdTitle = "Konsep Kompleks Hunian (Xiaoqu) di China", rdZh = "中国当代的小区文化", rdIcon = "🏢",
            rdText = "在中国的现代化城市，人们多数居住在封闭式住宅小区。小区内不仅有保安24小时值守，还配备花园步道、儿童游乐设施、智能快递柜（如丰巢）以及便民便利店，生活极其便捷。",
            rdPy = "Zài Zhōngguó de xiàndàihuà chéngshì, rénmen duōshù jūzhù zài fēngbìshì zhùzhái xiǎoqū.",
            rdId = "Di perkotaan Tiongkok, warga umumnya bermukim di kompleks apartemen bernama 'Xiaoqu' (小区). Fasilitasnya lengkap: taman bermain, pos satpam 24 jam, loker paket pintar ekspres, hingga minimarket.",
            rdNote = "Kurir paket di China mengantarkan kiriman ke loker pintar (智能快递柜) yang dibuka warga memakai kode QR di ponsel.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("房间里有 [一张] 床。","桌子 [上] 放着电脑。","两 [把] 椅子。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Di ruang tamu ada sofa → 客厅里有沙发。", "Rumah saya 3 kamar → 我家有三个房间。", "Tutup pintunya → 请关门。"))
            ),
            quizList = listOf(
                QuizQuestion("Kosa kata '厨房' (chúfáng) berarti...", "厨房", listOf("Dapur", "Kamar mandi", "Ruang tamu", "Balkon"), 0),
                QuizQuestion("Kata penggolong yang tepat untuk kursi (椅子 yǐzi) adalah...", "把", listOf("把 (bǎ)", "张 (zhāng)", "本 (běn)", "条 (tiáo)"), 0),
                QuizQuestion("Kata penggolong yang tepat untuk ranjang tempat tidur (床 chuáng) adalah...", "张", listOf("张 (zhāng)", "把 (bǎ)", "个 (gè)", "台 (tái)"), 0),
                QuizQuestion("Peralatan elektronik '冰箱' (bīngxiāng) berarti...", "冰箱", listOf("Lemari es / kulkas", "Mesin cuci", "Televisi", "Pendingin ruangan"), 0),
                QuizQuestion("Apa arti ungkapan '桌子上面' (zhuōzi shàngmiàn)?", "桌子上面", listOf("Di atas meja", "Di bawah meja", "Di dalam meja", "Di samping meja"), 0)
            )
        )

        // ==================== BAB 14: Telepon & Internet (Pages 131-140) ====================
        addStandardChapter(
            startGlobal = 131, num = 14, title = "Telepon & Internet", zh = "通讯与移动互联", icon = "📱",
            goals = listOf("Melakukan panggilan telepon dengan 给…打电话", "Menyebutkan nomor telepon seluler digit per digit", "Menggunakan aplikasi pesan instan WeChat (微信)", "Menggunakan preposisi instrumen 用 (menggunakan)"),
            v1Title = "Komunikasi Telepon & Pesan",
            v1Words = listOf(
                VocabWord("打电话", "dǎ diànhuà", "menelepon", "我给妈妈打电话。", "Saya menelepon ibu."),
                VocabWord("接电话", "jiē diànhuà", "mengangkat telepon", "快接电话，响很久了。", "Cepat angkat teleponnya, sudah berdering lama."),
                VocabWord("手机", "shǒujī", "ponsel genggam / HP", "智能手机功能很强。", "Ponsel pintar fungsinya sangat canggih."),
                VocabWord("电话号码", "diànhuà hàomǎ", "nomor telepon", "你的电话号码是多少？", "Berapa nomor teleponmu?"),
                VocabWord("发短信", "fā duǎnxìn", "mengirim SMS / pesan teks", "我给你发了一条短信。", "Saya mengirimkanmu sebuah SMS."),
                VocabWord("收", "shōu", "menerima", "收到我的信息了吗？", "Sudahkah kamu menerima pesan saya?"),
                VocabWord("发邮件", "fā yóujiàn", "mengirim email", "把文件发邮件给我。", "Kirimkan dokumen via email ke saya."),
                VocabWord("回复", "huífù", "membalas pesan", "请收到后尽快回复。", "Harap balas secepatnya setelah menerima."),
                VocabWord("没电了", "méi diàn le", "habis baterai", "手机没电了，借个充电宝。", "HP kehabisan baterai, pinjam powerbank dong."),
                VocabWord("挂电话", "guà diànhuà", "menutup telepon", "先别挂电话。", "Jangan tutup telepon dulu.")
            ),
            v2Title = "Internet, Medsos & Gaya Hidup Digital",
            v2Words = listOf(
                VocabWord("上网", "shàngwǎng", "berselancar internet", "用Wi-Fi上网很顺畅。", "Internetan pakai Wi-Fi sangat lancar."),
                VocabWord("电脑", "diànnǎo", "komputer / laptop", "笔记本电脑。", "Komputer jinjing (laptop)."),
                VocabWord("微信", "Wēixìn", "WeChat", "我们扫码加个微信吧。", "Ayo kita pindai QR tambah kontak WeChat."),
                VocabWord("扫二维码", "sǎo èrwéimǎ", "memindai kode QR", "扫码支付快捷方便。", "Pindai QR bayar cepat dan praktis."),
                VocabWord("发朋友圈", "fā péngyouquān", "membuat status Moments WeChat", "发张照片到朋友圈。", "Unggah foto ke WeChat Moments."),
                VocabWord("视频通话", "shìpín tōnghuà", "panggilan video (video call)", "和远方家人视频通话。", "Panggilan video dengan keluarga jauh."),
                VocabWord("发消息", "fā xiāoxi", "mengirim pesan chat", "在群里发通知消息。", "Kirim pesan pengumuman di grup chat."),
                VocabWord("点赞", "diǎn zàn", "memberikan like", "给你的美照点个赞！", "Kasih jempol like untuk foto cantikmu!"),
                VocabWord("关注", "guānzhù", "mengikuti / follow akun", "欢迎关注我的频道。", "Selamat datang untuk mengikuti kanal saya."),
                VocabWord("用", "yòng", "menggunakan / memakai", "我用手机学中文。", "Saya menggunakan HP untuk belajar Mandarin.")
            ),
            g1Title = "Menelepon & Mengirim Pesan (给…打/发…)",
            g1Items = listOf(
                GrammarItem("给 + Orang + 打电话", "Subjek + 给 + Seseorang + 打电话", "Pola standar melakukan panggilan telepon dalam bahasa Mandarin.", listOf(GrammarExample("我晚上给妈妈打电话。", "Wǒ wǎnshang gěi māma dǎ diànhuà.", "Saya malam ini menelepon ibu."), GrammarExample("他刚才给我打电话了。", "Tā gāngcái gěi wǒ dǎ diànhuà le.", "Dia barusan menelepon saya."))),
                GrammarItem("给 + Orang + 发 + Pesan", "Subjek + 给 + Seseorang + 发 + 短信 / 微信 / 邮件", "Mengirimkan pesan atau surat elektronik.", listOf(GrammarExample("我发微信给你。", "Wǒ fā Wēixìn gěi nǐ.", "Saya kirim pesan WeChat kepadamu.")))
            ),
            g2Title = "Menyebutkan Nomor & Instrumen 用",
            g2Items = listOf(
                GrammarItem("Pengucapan Angka 1 pada Nomor Telepon", "Karakter 一 dibaca yāo pada digit telepon", "Untuk mencegah salah dengar antara yī dan qī (tujuh), angka 1 pada nomor HP atau kamar dibaca yāo.", listOf(GrammarExample("我的手机号是138... (yāo sān bā...)", "Wǒ de shǒujī hào shì yāo sān bā...", "Nomor ponsel saya 138..."))),
                GrammarItem("Preposisi Instrumen 用 (yòng)", "用 + Alat/Aplikasi + Kata Kerja", "Menyatakan sarana yang digunakan untuk melakukan aktivitas.", listOf(GrammarExample("我用微信和朋友聊天。", "Wǒ yòng Wēixìn hé péngyou liáotiān.", "Saya menggunakan WeChat mengobrol dengan kawan.")))
            ),
            d1Title = "Bertukar Kontak WeChat", d1Icon = "📞", d1SceneTitle = "Seusai Seminar", d1SceneDesc = "Saling bertukar nomor dan akun WeChat.",
            d1Lines = listOf(
                DialogLine("A", "今天聊得很开心，我们加个微信保持联系吧！", "Jīntiān liáo de hěn kāixīn, wǒmen jiā ge Wēixìn bǎochí liánxì ba!", "Hari ini mengobrol sangat asyik, mari kita tambah WeChat untuk tetap terhubung!"),
                DialogLine("B", "好啊，我打开我的二维码，你扫我还是我扫你？", "Hǎo a, wǒ dǎkāi wǒ de èrwéimǎ, nǐ sǎo wǒ háishi wǒ sǎo nǐ?", "Boleh sekali, saya buka kode QR saya, kamu pindai saya atau saya pindai kamu?"),
                DialogLine("A", "我扫你吧。好，已经发送好友申请了。", "Wǒ sǎo nǐ ba. Hǎo, yǐjīng fāsòng hǎoyǒu shēnqǐng le.", "Biar saya pindai kamu. Oke, permintaan pertemanan sudah terkirim."),
                DialogLine("B", "我已经通过了，有空多常交流！", "Wǒ yǐjīng tōngguò le, yǒu kòng duō cháng jiāoliú!", "Saya sudah terima, kalau senggang mari sering bertukar kabar!")
            ),
            d2Title = "Melakukan Panggilan Telepon", d2Icon = "📱", d2SceneTitle = "Sambungan Telepon", d2SceneDesc = "Menghubungi guru untuk konsultasi.",
            d2Lines = listOf(
                DialogLine("A", "喂，您好！请问是王老师吗？", "Wèi, nín hǎo! Qǐngwèn shì Wáng lǎoshī ma?", "Halo! Permisi apakah ini Bapak Guru Wang?"),
                DialogLine("B", "喂，是我。请问你是哪一位？", "Wèi, shì wǒ. Qǐngwèn nǐ shì nǎ yí wèi?", "Halo, ya ini saya. Permisi dengan siapa ini?"),
                DialogLine("A", "王老师好，我是留学生Budi。我想请教您关于论文的问题。", "Wáng lǎoshī hǎo, wǒ shì liúxuéshēng Budi. Wǒ xiǎng qǐngjiào nín guānyú lùnwén de wèntí.", "Halo Guru Wang, saya mahasiswa internasional Budi. Saya ingin berkonsultasi mengenai tugas makalah."),
                DialogLine("B", "好的Budi，明天下午两点你来我办公室吧。", "Hǎo de Budi, míngtiān xiàwǔ liǎng diǎn nǐ lái wǒ bàngōngshì ba.", "Baik Budi, besok jam dua siang kamu datang ke ruang kantor saya ya.")
            ),
            rdTitle = "Ekosistem Digital WeChat & Alipay di China", rdZh = "无现金社会的移动生态", rdIcon = "📲",
            rdText = "在当今中国，一部智能手机几乎可以满足全天候生活需求。微信（WeChat）和支付宝（Alipay）将社交、移动无感支付、扫码乘车、挂号看病、生活缴费等功能全面整合，中国已步入高度成熟的\"无现金社会\"。",
            rdPy = "Zài dāngjīn Zhōngguó, yí bù zhìnéng shǒujī jīhū kěyǐ mǎnzú quántiānhòu shēnghuó xūqiú.",
            rdId = "Di Tiongkok saat ini, satu smartphone sudah mencukupi segala kebutuhan: bayar jajanan kaki lima, tiket MRT, belanja online, hingga bayar tagihan air/listrik lewat WeChat & Alipay.",
            rdNote = "Turis asing kini dapat menautkan kartu kredit internasional Visa/Mastercard ke akun WeChat Pay dan Alipay dengan sangat mudah.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我给妈妈 [打] 电话。","你的手机 [号码] 是多少？","我们加个 [微信] 吧。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya menelepon ayah → 我给爸爸打电话。", "HP saya kehabisan baterai → 我的手机没电了。", "Pindai kode QR → 扫二维码。"))
            ),
            quizList = listOf(
                QuizQuestion("Kosa kata '手机' (shǒujī) berarti...", "手机", listOf("Ponsel genggam / HP", "Komputer desktop", "Pesawat TV", "Kamera digital"), 0),
                QuizQuestion("Pola kalimat yang tepat untuk 'menelepon ibu' adalah...", "给妈妈打电话", listOf("给妈妈打电话", "打电话妈妈", "妈妈打电话给", "要妈妈电话"), 0),
                QuizQuestion("Saat mengeja nomor telepon atau nomor kamar, angka 1 sering dilafalkan sebagai...", "yāo", listOf("yāo", "yī", "yí", "yì"), 0),
                QuizQuestion("Kosa kata '微信' (Wēixìn) adalah nama aplikasi...", "微信", listOf("WeChat", "WhatsApp", "Telegram", "Instagram"), 0),
                QuizQuestion("Kata kerja instrumen '用' (yòng) memiliki arti...", "用", listOf("Menggunakan / memakai", "Memberikan", "Menerima", "Membawa"), 0)
            )
        )

        // ==================== BAB 15: Janji & Acara (Pages 141-150) ====================
        addStandardChapter(
            startGlobal = 141, num = 15, title = "Janji & Perayaan Acara", zh = "约会与社交聚会", icon = "🎉",
            goals = listOf("Membuat janji bertemu dengan 有空 & 见面", "Mengundang teman dengan 请客 / 请你", "Memberikan ucapan selamat dengan 祝你", "Menghadiri pesta ulang tahun dan perayaan"),
            v1Title = "Janji Temu & Pertemuan",
            v1Words = listOf(
                VocabWord("约会", "yuēhuì", "janji temu / kencan", "今晚我和朋友有约会。", "Malam ini saya ada janji temu dengan teman."),
                VocabWord("见面", "jiànmiàn", "bertemu / jumpa muka", "我们老地方见面吧。", "Ayo kita bertemu di tempat biasa."),
                VocabWord("邀请", "yāoqǐng", "mengundang", "感谢你的热情邀请。", "Terima kasih atas undangan hangatmu."),
                VocabWord("参加", "cānjiā", "menghadiri / ikut serta", "参加生日派对。", "Menghadiri pesta ulang tahun."),
                VocabWord("聚会", "jùhuì", "kumpul-kumpul / reuni", "周末高中同学聚会。", "Akhir pekan reuni kawan SMA."),
                VocabWord("生日", "shēngrì", "hari ulang tahun", "今天是我的二十岁生日。", "Hari ini ulang tahun keduapuluhku."),
                VocabWord("结婚", "jiéhūn", "menikah", "表哥下个月结婚办婚礼。", "Sepupu bulan depan menikah dan gelar resepsi."),
                VocabWord("有空", "yǒu kòng", "ada waktu luang", "你明天上午有空吗？", "Besok pagi apakah kamu ada waktu luang?"),
                VocabWord("没空 / 忙", "méi kòng / máng", "tidak sempat / sibuk", "这两天工作特别忙。", "Dua hari ini pekerjaan sangat sibuk."),
                VocabWord("安排", "ānpái", "jadwal / rencana susunan", "周末有什么特别安排？", "Akhir pekan ada jadwal khusus apa?")
            ),
            v2Title = "Perayaan, Hadiah & Ucapan Selamat",
            v2Words = listOf(
                VocabWord("礼物", "lǐwù", "hadiah / kado", "这是送给你的生日礼物。", "Ini kado ulang tahun untukmu."),
                VocabWord("生日蛋糕", "shēngrì dàngāo", "kue ulang tahun", "点燃生日蜡烛，吹蜡烛。", "Nyalakan lilin ulang tahun, tiup lilin."),
                VocabWord("红包", "hóngbāo", "amplop merah (angpao)", "结婚要给新人包红包。", "Pernikahan memberi angpao untuk pengantin."),
                VocabWord("准时", "zhǔnshí", "tepat waktu (on time)", "请大家准时出席宴会。", "Harap semuanya hadir tepat waktu."),
                VocabWord("迟到", "chídào", "terlambat / telat", "路上塞车，迟到了十分钟。", "Jalanan macet, telat 10 menit."),
                VocabWord("祝", "zhù", "mendoakan / mengucapkan selamat", "祝你生日快乐，心想事成！", "Selamat ulang tahun, semoga impian terkabul!"),
                VocabWord("开心 / 快乐", "kāixīn / kuàilè", "bahagia / gembira", "祝你天天开心！", "Semoga harimu selalu bahagia!"),
                VocabWord("请客", "qǐngkè", "mentraktir makan", "今天我发薪水，我请客！", "Hari ini saya gajian, saya yang traktir!"),
                VocabWord("干杯", "gānbēi", "bersulang (toast)!", "为我们的友谊干杯！", "Bersulang untuk persahabatan kita!"),
                VocabWord("客气", "kèqi", "sungkan / sopan berlebih", "你太客气了，不用送礼。", "Kamu terlalu sungkan, tak perlu repot bawa kado.")
            ),
            g1Title = "Mengundang & Mentraktir dengan 请",
            g1Items = listOf(
                GrammarItem("请 (qǐng) — Mentraktir Seseorang", "Subjek + 请 + Orang + Verba", "Digunakan ketika mengundang sekaligus menanggung biayanya sebagai bentuk kebaikan hati.", listOf(GrammarExample("今天我请你喝咖啡。", "Jīntiān wǒ qǐng nǐ hē kāfēi.", "Hari ini saya traktir kamu minum kopi."), GrammarExample("我想请大家吃烤鸭。", "Wǒ xiǎng qǐng dàjiā chī kǎoyā.", "Saya ingin mentraktir semua makan bebek panggang.")))
            ),
            g2Title = "Ucapan Doa & Harapan dengan 祝",
            g2Items = listOf(
                GrammarItem("Ucapan Doa 祝 (zhù)", "祝 + Orang + Harapan Baik", "Format standar menyampaikan ucapan selamat dan doa keberkahan.", listOf(GrammarExample("祝你生日快乐！", "Zhù nǐ shēngrì kuàilè!", "Selamat ulang tahun untukmu!"), GrammarExample("祝你身体健康，工作顺利！", "Zhù nǐ shēntǐ jiànkāng, gōngzuò shùnlì!", "Semoga sehat selalu dan pekerjaan lancar!")))
            ),
            d1Title = "Mengundang Makan Malam", d1Icon = "🍽️", d1SceneTitle = "Di Telepon", d1SceneDesc = "Mengundang teman merayakan promosi jabatan.",
            d1Lines = listOf(
                DialogLine("A", "李明，你今晚有空吗？我升职了，想请你吃火锅！", "Lǐ Míng, nǐ jīnwǎn yǒu kòng ma? Wǒ shēngzhí le, xiǎng qǐng nǐ chī huǒguō!", "Li Ming, malam ini kamu senggang? Saya naik jabatan, mau traktir kamu makan hotpot!"),
                DialogLine("B", "太恭喜你了！今晚我有空，几点在哪儿汇合？", "Tài gōngxǐ nǐ le! Jīnwǎn wǒ yǒu kòng, jǐ diǎn zài nǎr huìhé?", "Selamat banyak untukmu! Malam ini saya senggang, jam berapa kumpul di mana?"),
                DialogLine("A", "晚上七点在海底捞见，我已经订好位子了。", "Wǎnshang qī diǎn zài Hǎidǐlāo jiàn, wǒ yǐjīng dìng hǎo wèizi le.", "Jam tujuh malam di Haidilao, saya sudah pesan meja reservasi."),
                DialogLine("B", "太棒了，我一定准时到！", "Tài bàng le, wǒ yídìng zhǔnshí dào!", "Mantap, saya pasti tiba tepat waktu!")
            ),
            d2Title = "Pesta Ulang Tahun", d2Icon = "🎂", d2SceneTitle = "Pesta Ulang Tahun", d2SceneDesc = "Memberikan ucapan dan hadiah.",
            d2Lines = listOf(
                DialogLine("A", "生日快乐！祝你越来越年轻漂亮！这是我挑的小礼物。", "Shēngrì kuàilè! Zhù nǐ yuèláiyuè niánqīng piàoliang! Zhè shì wǒ tiāo de xiǎo lǐwù.", "Selamat ulang tahun! Semoga makin awet muda dan cantik jelita! Ini kado kecil pilihanku."),
                DialogLine("B", "哇，谢谢你！你人来我就很高兴了，还带礼物太破费了！", "Wā, xièxie nǐ! Nǐ rén lái wǒ jiù hěn gāoxìng le, hái dài lǐwù tài pòfèi le!", "Wah terima kasih! Kehadiranmu saja sudah bikin gembira, bawa kado begini jadi sungkan!"),
                DialogLine("A", "快打开看看喜不喜欢！还有，大家都在等你吹蜡烛许愿呢。", "Kuài dǎkāi kànkan xǐ bu xǐhuan! Hái yǒu, dàjiā dōu zài děng nǐ chuī làzhú xǔyuàn ne.", "Cepat buka lihat suka tidak! Oh ya, semua orang sedang menunggumu tiup lilin dan bikin harapan."),
                DialogLine("B", "好，来，大家一起分蛋糕吃！", "Hǎo, lái, dàjiā yìqǐ fēn dàngāo chī!", "Ayo kumpul, kita potong kue dan santap bersama!")
            ),
            rdTitle = "Pantangan Memberi Hadiah dalam Budaya China", rdZh = "中国送礼的文化禁忌", rdIcon = "🎁",
            rdText = "在中国送礼极讲究吉祥寓意，存在几大文化禁忌：不能送钟表（\"送钟\"谐音\"送终\"，寓意不祥）；不能送雨伞或雪梨（\"伞\"\"梨\"谐音\"散\"\"离\"，暗指分离）；礼品通常挑选双数、红金喜庆包装。",
            rdPy = "Zài Zhōngguó sòng lǐ jí jiǎngjiu jíxiáng yùyì.",
            rdId = "Memberi hadiah di Tiongkok sarat simbol: dilarang memberi jam weker (sòng zhōng berbunyi sama dengan melayat kematian); dilarang memberi payung (sǎn) atau pir (lí) karena berbunyi sama dengan perpisahan.",
            rdNote = "Warna merah dan emas adalah warna kado terfavorit karena melambangkan kemakmuran dan keberuntungan berlimpah.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("你明天有 [空] 吗？","我 [请] 你喝咖啡。","[祝] 你生日快乐！")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Selamat ulang tahun! → 祝你生日快乐！", "Saya traktir kamu makan → 我请你吃饭。", "Sampai jumpa di tempat biasa → 老地方见。"))
            ),
            quizList = listOf(
                QuizQuestion("Arti dari kosa kata '有空' (yǒu kòng) adalah...", "有空", listOf("Memiliki waktu luang / senggang", "Sedang terburu-buru", "Tidak ada kawan", "Merasa kesepian"), 0),
                QuizQuestion("Ungkapan mentraktir 'Saya traktir kamu makan' adalah...", "我请你吃饭", listOf("我请你吃饭", "我给你吃饭", "我要你吃饭", "我做你吃饭"), 0),
                QuizQuestion("Kata kerja doa '祝' (zhù) memiliki makna...", "祝", listOf("Mendoakan / mengucapkan selamat", "Mengundang", "Meminjam", "Mengirim"), 0),
                QuizQuestion("Benda apa yang dipantangkan sebagai hadiah karena berbunyi sama dengan melayat kematian?", "钟表", listOf("Jam dinding / weker (钟 zhōng)", "Kemeja (衬衫)", "Buku kamus (字典)", "Bunga merah"), 0),
                QuizQuestion("Ucapan selamat ulang tahun yang paling umum adalah...", "生日快乐", listOf("祝你生日快乐！", "祝你新年好！", "恭喜发财！", "再见保重！"), 0)
            )
        )

        return pages
    }
}
