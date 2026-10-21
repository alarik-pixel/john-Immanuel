package com.example.data

object BookChapters16To20 {

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

        // ==================== BAB 16: Pengalaman Lampau (Pages 151-160) ====================
        addStandardChapter(
            startGlobal = 151, num = 16, title = "Pengalaman Lampau", zh = "往昔与人生经历", icon = "📖",
            goals = listOf("Menggunakan aspek pengalaman 过 (pernah)", "Menggunakan adverbia 已经 (sudah)", "Menceritakan masa lalu dengan 以前 & 后来", "Menceritakan kenangan perjalanan"),
            v1Title = "Waktu Lampau & Kronologi",
            v1Words = listOf(
                VocabWord("以前", "yǐqián", "dahulu / sebelum", "以前我住在北京胡同。", "Dahulu saya tinggal di lorong hutong Beijing."),
                VocabWord("已经", "yǐjīng", "sudah / telah", "高铁已经出发了。", "Kereta cepat sudah berangkat."),
                VocabWord("过", "guo", "pernah (partikel aspek)", "你去过长城吗？", "Pernahkah kamu ke Tembok Besar?"),
                VocabWord("曾经", "céngjīng", "pernah / dahulu kala", "他曾经是一名船长。", "Dia dahulu pernah menjadi seorang kapten kapal."),
                VocabWord("那时候", "nà shíhou", "pada waktu itu", "那时候生活简单朴素。", "Waktu itu kehidupan sederhana."),
                VocabWord("去年", "qùnián", "tahun lalu", "去年我考过了HSK三级。", "Tahun lalu saya lulus ujian HSK 3."),
                VocabWord("上个月", "shàng ge yuè", "bulan lalu", "上个月公司完成了大项目。", "Bulan lalu perusahaan menuntaskan proyek besar."),
                VocabWord("最近", "zuìjìn", "belakangan ini / akhir-akhir ini", "最近汉语学得怎么样？", "Belakangan ini bagaimana belajar Mandarinmu?"),
                VocabWord("后来", "hòulái", "kemudian / setelah itu", "后来他去了上海发展。", "Kemudian dia pergi ke Shanghai untuk berkarier."),
                VocabWord("过去", "guòqù", "masa lalu", "让过去的过去，把握现在。", "Biarkan masa lalu berlalu, genggam saat ini.")
            ),
            v2Title = "Pengalaman & Kenangan",
            v2Words = listOf(
                VocabWord("去过", "qù guo", "pernah pergi ke", "我去过上海和西安。", "Saya pernah pergi ke Shanghai dan Xi'an."),
                VocabWord("看过", "kàn guo", "pernah menonton / membaca", "我看过京剧《霸王别姬》。", "Saya pernah menonton opera Beijing 'Farewell My Concubine'."),
                VocabWord("吃过", "chī guo", "pernah mencicipi / makan", "吃过正宗的北京烤鸭。", "Pernah makan bebek panggang Beijing otentik."),
                VocabWord("经历", "jīnglì", "pengalaman hidup", "这是一段宝贵的留学经历。", "Ini adalah seuntai pengalaman studi berharga."),
                VocabWord("故事", "gùshi", "kisah / cerita", "听老船长讲海上的故事。", "Mendengarkan kapten senior bercerita kisah samudra."),
                VocabWord("记得", "jìde", "ingat", "我还清楚记得那一天。", "Saya masih ingat jelas hari itu."),
                VocabWord("忘记", "wàngjì", "melupakan", "不要忘记最初的梦想。", "Jangan lupakan impian awalmu."),
                VocabWord("好像", "hǎoxiàng", "sepertinya / mirip", "我好像在哪儿见过你。", "Sepertinya saya pernah melihatmu di suatu tempat."),
                VocabWord("难忘", "nánwàng", "sulit dilupakan / berkesan", "难忘的毕业典礼。", "Upacara kelulusan yang tak terlupakan."),
                VocabWord("习惯", "xíguàn", "kebiasaan / terbiasa", "我已经习惯这里的生活了。", "Saya sudah terbiasa dengan kehidupan di sini.")
            ),
            g1Title = "Partikel Aspek Pengalaman: Verba + 过",
            g1Items = listOf(
                GrammarItem("Verba + 过 (Pernah Melakukan)", "Subjek + Verba + 过 + Objek", "Menyatakan bahwa suatu tindakan atau pengalaman pernah dilakukan di masa lampau.", listOf(GrammarExample("我去过中国两次。", "Wǒ qù guo Zhōngguó liǎng cì.", "Saya pernah ke China dua kali."), GrammarExample("你吃过火锅吗？", "Nǐ chī guo huǒguō ma?", "Pernahkah kamu makan hotpot?"))),
                GrammarItem("Bentuk Negatif: 没(有) + Verba + 过", "Subjek + 没(有) + Verba + 过 + Objek", "Menyatakan belum pernah mengalami sesuatu sama sekali.", listOf(GrammarExample("我没去过长城。", "Wǒ méi qù guo Chángchéng.", "Saya belum pernah ke Tembok Besar.")))
            ),
            g2Title = "Keterangan Waktu: 已经 & 后来",
            g2Items = listOf(
                GrammarItem("已经…了 (Sudah)", "已经 + Verba/Kondisi + 了", "Menyatakan peristiwa yang telah terjadi dan selesai.", listOf(GrammarExample("我已经做完功课了。", "Wǒ yǐjīng zuòwán gōngkè le.", "Saya sudah menyelesaikan PR."))),
                GrammarItem("后来 (Hòulái) — Kemudian", "Peristiwa 1，后来 + Peristiwa 2", "Menghubungkan urutan kronologi kejadian di masa lampau.", listOf(GrammarExample("起初很不习惯，后来慢慢适应了。", "Qǐchū hěn bù xíguàn, hòulái mànmàn shìyìng le.", "Awalnya tidak terbiasa, kemudian perlahan beradaptasi.")))
            ),
            d1Title = "Bercerita Pengalaman ke Tiongkok", d1Icon = "🌏", d1SceneTitle = "Di Kedai Kopi", d1SceneDesc = "Membagikan pengalaman menjelajahi Tembok Besar.",
            d1Lines = listOf(
                DialogLine("A", "你去过中国旅游吗？", "Nǐ qù guo Zhōngguó lǚyóu ma?", "Pernahkah kamu bepergian wisata ke China?"),
                DialogLine("B", "去过，去年暑假我去过北京、西安和成都。", "Qù guo, qùnián shǔjià wǒ qù guo Běijīng, Xī'ān hé Chéngdū.", "Pernah, liburan musim panas tahun lalu saya ke Beijing, Xi'an, dan Chengdu."),
                DialogLine("A", "最让你难忘的经历是什么？", "Zuì ràng nǐ nánwàng de jīnglì shì shénme?", "Pengalaman apa yang paling tak terlupakan bagimu?"),
                DialogLine("B", "登上八达岭长城的那一刻，真是'不到长城非好汉'！", "Dēngshàng Bādálǐng Chángchéng de nà yí kè, zhēn shì 'bú dào Chángchéng fēi hǎohàn'!", "Momen ketika mendaki Tembok Besar Badaling, sungguh nyata 'belum ke Tembok Besar belum jadi pahlawan'!")
            ),
            d2Title = "Melihat Foto Lama", d2Icon = "📷", d2SceneTitle = "Membuka Album Foto", d2SceneDesc = "Mengenang masa-masa awal belajar bahasa Mandarin.",
            d2Lines = listOf(
                DialogLine("A", "这张照片是什么时候拍的？", "Zhè zhāng zhàopiàn shì shénme shíhou pāi de?", "Foto ini diambil kapan?"),
                DialogLine("B", "是两年前我们刚开始学汉语拼音的时候拍的。", "Shì liǎng nián qián wǒmen gāng kāishǐ xué Hànyǔ pīnyīn de shíhou pāi de.", "Dua tahun lalu saat kita baru mulai belajar pinyin Mandarin."),
                DialogLine("A", "那时候觉得声调好难发，现在我们都已经能流利对话了！", "Nà shíhou juéde shēngdiào hǎo nán fā, xiànzài wǒmen dōu yǐjīng néng liúlì duìhuà le!", "Waktu itu nada terasa sulit sekali dilafalkan, sekarang kita berdua sudah bisa berbincang lancar!"),
                DialogLine("B", "坚持努力就一定会有收获！", "Jiānchí nǔlì jiù yídìng huì yǒu shōuhuò!", "Tekun berusaha pasti akan menuai hasil manis!")
            ),
            rdTitle = "Makna Perjalanan Hidup", rdZh = "读万卷书，行万里路", rdIcon = "✈️",
            rdText = "古人云：\"读万卷书，行万里路。\"丰富的阅历是人生最丰盈的财富。亲历不同的国度与文化，能让人拥有更广阔的胸襟与包容的世界观。走过的每一步路，都会化作心中的从容底气。",
            rdPy = "Gǔrén yún: 'Dú wàn juǎn shū, xíng wàn lǐ lù.'",
            rdId = "Pepatah klasik Tiongkok berbunyi: 'Membaca sepuluh ribu jilid buku, menempuh perjalanan sepuluh ribu mil.' Pengalaman berkelana memperluas cakrawala berpikir dan memperkaya kebijaksanaan jiwa.",
            rdNote = "Ungkapan ini menggarisbawahi pentingnya keseimbangan antara ilmu teori di buku dan praktik nyata di lapangan.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我 [去] 过中国。","他 [已经] 走了。","[以前] 我住在北京。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya pernah ke China → 我去过中国。", "Saya sudah makan → 我已经吃了。", "Pengalaman yang tak terlupakan → 难忘的经历。"))
            ),
            quizList = listOf(
                QuizQuestion("Partikel aspek '过' (guo) setelah kata kerja menyatakan...", "过", listOf("Pengalaman pernah dilakukan di masa lalu", "Kegiatan yang sedang berlangsung", "Rencana di masa mendatang", "Perintah larangan"), 0),
                QuizQuestion("Bentuk negatif dari '我去过中国' (Saya pernah ke China) adalah...", "我没去过中国", listOf("我没去过中国。", "我不去过中国。", "我无去中国。", "我别去过中国。"), 0),
                QuizQuestion("Kata keterangan '已经' (yǐjīng) memiliki arti...", "已经", listOf("Sudah / telah", "Akan segera", "Tidak pernah", "Sedang"), 0),
                QuizQuestion("Kosa kata '难忘' (nánwàng) berarti...", "难忘", listOf("Sulit dilupakan / sangat berkesan", "Mudah lupa", "Membosankan", "Menyedihkan"), 0),
                QuizQuestion("Apa arti dari '以前' (yǐqián)?", "以前", listOf("Dahulu / sebelum", "Sekarang", "Nanti sore", "Tahun depan"), 0)
            )
        )

        // ==================== BAB 17: Rencana Masa Depan (Pages 161-170) ====================
        addStandardChapter(
            startGlobal = 161, num = 17, title = "Rencana Masa Depan", zh = "未来蓝图与展望", icon = "🌟",
            goals = listOf("Menyatakan rencana dengan 打算 (berencana)", "Menyatakan kepastian masa depan dengan 会 & 一定", "Mengungkapkan harapan mulia dengan 希望", "Menetapkan target dan cita-cita (目标)"),
            v1Title = "Rencana, Niat & Masa Depan",
            v1Words = listOf(
                VocabWord("以后", "yǐhòu", "nanti / kelak di masa depan", "以后我想去中国深造。", "Kelak saya ingin memperdalam ilmu di China."),
                VocabWord("将来", "jiānglái", "masa depan", "把握当下，创造将来。", "Genggam masa kini, ciptakan masa depan."),
                VocabWord("打算", "dǎsuàn", "berencana / berniat", "你暑假打算做什么？", "Kamu liburan musim panas berencana apa?"),
                VocabWord("计划", "jìhuà", "rencana kerja / agenda", "制订周密的学习计划。", "Menyusun rencana belajar yang terstruktur."),
                VocabWord("希望", "xīwàng", "berharap / harapan", "我希望考上心仪的大学。", "Saya berharap diterima di kampus idaman."),
                VocabWord("一定", "yídìng", "pasti / tentu saja", "有志者事竟成，我一定能行！", "Di mana ada kemauan pasti ada jalan!"),
                VocabWord("可能", "kěnéng", "mungkin / barangkali", "明天可能会下小雪。", "Besok barangkali akan turun salju kecil."),
                VocabWord("会", "huì", "akan (prediksi masa depan)", "明天会更好。", "Hari esok akan lebih baik."),
                VocabWord("要", "yào", "hendak / akan", "我明年要参加HSK考试。", "Saya tahun depan akan ikut ujian HSK."),
                VocabWord("准备", "zhǔnbèi", "mempersiapkan", "认真准备每一门功课。", "Mempersiapkan setiap pelajaran dengan sungguh-sungguh.")
            ),
            v2Title = "Target, Tekad & Pencapaian",
            v2Words = listOf(
                VocabWord("目标", "mùbiāo", "target / sasaran", "今年的目标是掌握一千个词汇。", "Target tahun ini menguasai 1.000 kosakata."),
                VocabWord("努力", "nǔlì", "bekerja keras / giat", "努力拼搏，无怨无悔。", "Berjuang gigih tanpa penyesalan."),
                VocabWord("坚持", "jiānchí", "tekun / pantang menyerah", "坚持就是胜利。", "Konsisten dan tekun adalah kunci kemenangan."),
                VocabWord("成功", "chénggōng", "berhasil / sukses", "祝愿你的创业计划成功！", "Semoga rencana rintisan usahamu berhasil!"),
                VocabWord("留学", "liúxué", "studi ke luar negeri", "去清华大学留学读硕士。", "Kuliah S2 ke luar negeri di Tsinghua."),
                VocabWord("梦想", "mèngxiǎng", "impian / cita-cita", "勇敢追寻内心的梦想。", "Berani mengejar impian hati."),
                VocabWord("机会", "jīhuì", "kesempatan / peluang emas", "抓住难得的发展机会。", "Menangkap peluang perkembangan langka."),
                VocabWord("挑战", "tiǎozhàn", "tantangan baru", "勇敢迎接未来的新挑战。", "Menyambut tantangan baru masa depan."),
                VocabWord("实现", "shíxiàn", "mewujudkan", "努力实现自己的人生价值。", "Berusaha mewujudkan nilai diri hidup."),
                VocabWord("进步", "jìnbù", "kemajuan pesat", "每天进步一点点。", "Setiap hari maju sedikit demi sedikit.")
            ),
            g1Title = "Menyatakan Rencana dengan 打算 & 会",
            g1Items = listOf(
                GrammarItem("打算 (dǎsuàn) — Berencana", "Subjek + 打算 + Rencana Kegiatan", "Menyatakan intensi atau rencana yang sudah dipikirkan.", listOf(GrammarExample("我打算明年去中国留学。", "Wǒ dǎsuàn míngnián qù Zhōngguó liúxué.", "Saya berencana tahun depan kuliah ke China."), GrammarExample("你周末打算去哪儿？", "Nǐ zhōumò dǎsuàn qù nǎr?", "Akhir pekan kamu berencana pergi ke mana?"))),
                GrammarItem("会 (huì) untuk Masa Depan", "Subjek + 会 + Verba", "Menyatakan keyakinan bahwa suatu peristiwa pasti akan terjadi di masa mendatang.", listOf(GrammarExample("我相信一切都会好起来的。", "Wǒ xiāngxìn yíqiè dōu huì hǎo qǐlái de.", "Saya percaya segalanya akan membaik.")))
            ),
            g2Title = "Harapan (希望) & Tekad Pasti (一定)",
            g2Items = listOf(
                GrammarItem("希望 (xīwàng) — Menyatakan Harapan", "希望 + Klausa / Impian", "Menyatakan cita-cita atau permohonan kebaikan.", listOf(GrammarExample("我希望我的家人都平安健康。", "Wǒ xīwàng wǒ de jiārén dōu píng'ān jiànkāng.", "Saya berharap keluarga saya senantiasa aman dan sehat."))),
                GrammarItem("一定 (yídìng) — Tekad Bulat Pasti", "Subjek + 一定 + Verba", "Menegaskan kepastian atau komitmen kuat.", listOf(GrammarExample("我一定会学好汉语！", "Wǒ yídìng huì xuéhǎo Hànyǔ!", "Saya pasti akan menguasai bahasa Mandarin dengan baik!")))
            ),
            d1Title = "Rencana Melanjutkan Studi ke Tiongkok", d1Icon = "🌟", d1SceneTitle = "Konsultasi Akademik", d1SceneDesc = "Membicarakan rencana beasiswa studi ke Tiongkok.",
            d1Lines = listOf(
                DialogLine("A", "Budi，本科毕业后你有什么打算？", "Budi, běnkē bìyè hòu nǐ yǒu shénme dǎsuàn?", "Budi, setelah lulus S1 apa rencanamu?"),
                DialogLine("B", "我打算申请中国政府奖学金，去北京读国际贸易硕士。", "Wǒ dǎsuàn shēnqǐng Zhōngguó zhèngfǔ jiǎngxuéjīn, qù Běijīng dú guójì màoyì shuòshì.", "Saya berencana mendaftar beasiswa CSC, pergi ke Beijing ambil S2 perdagangan internasional."),
                DialogLine("A", "你的汉语水平这么高，一定能顺利通过申请！", "Nǐ de Hànyǔ shuǐpíng zhème gāo, yídìng néng shùnlì tōngguò shēnqǐng!", "Kemampuan bahasa Mandarinmu setinggi ini, pasti lancar lolos seleksi!"),
                DialogLine("B", "谢谢老师鼓励，我一定会全力以赴准备！", "Xièxie lǎoshī gǔlì, wǒ yídìng huì quánlì-yǐfù zhǔnbèi!", "Terima kasih dorongan Bapak Guru, saya pasti mengerahkan segenap tenaga bersiap!")
            ),
            d2Title = "Target Belajar Tahun Ini", d2Icon = "🎯", d2SceneTitle = "Di Meja Belajar", d2SceneDesc = "Saling berbagi target kompetensi.",
            d2Lines = listOf(
                DialogLine("A", "你今年的学习目标是什么？", "Nǐ jīnnián de xuéxí mùbiāo shì shénme?", "Apa target belajarmu untuk tahun ini?"),
                DialogLine("B", "我希望在年底前考过HSK四级，掌握至少一千二百个汉字。", "Wǒ xīwàng zài niándǐ qián kǎoguò HSK sì jí, zhǎngwò zhìshǎo yì qiān èr bǎi ge hànzì.", "Saya berharap sebelum akhir tahun lulus HSK 4 dan menguasai minimal 1.200 karakter."),
                DialogLine("A", "只要每天坚持练习听说读写，目标一定会实现！", "Zhǐyào měitiān jiānchí liànxí tīng shuō dú xiě, mùbiāo yídìng huì shíxiàn!", "Asalkan setiap hari tekun melatih listening, speaking, reading, dan writing, target pasti tercapai!"),
                DialogLine("B", "对！坚持就是胜利，我们共同进步！", "Duì! Jiānchí jiù shì shènglì, wǒmen gòngtóng jìnbù!", "Betul! Konsistensi adalah kunci kemenangan, mari kita maju bersama!")
            ),
            rdTitle = "Konsep 'Zhongguo Meng' (Mimpi Tiongkok)", rdZh = "逐梦前行的时代精神", rdIcon = "🌈",
            rdText = "\"中国梦\"是当代中国广泛流传的发展理念，其核心内涵是国家富强、民族振兴、人民幸福。无数普通青年将个人对美好生活的追求融入时代浪潮中，用拼搏奋斗书写青春华章。",
            rdPy = "'Zhōngguó mèng' shì dāngdài Zhōngguó guǎnfàn liúchuán de fāzhǎn lǐniàn.",
            rdId = "Konsep 'Mimpi Tiongkok' menginspirasi generasi muda untuk merajut impian pribadi: menempuh pendidikan unggul, memiliki hunian mandiri, membangun keluarga harmonis, dan berkontribusi bagi dunia.",
            rdNote = "Pepatah motivasi terpopuler di kalangan pelajar China: 有志者事竟成 (Yǒu zhì zhě shì jìng chéng) — di mana ada kemauan, di situ ada jalan.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我 [打算] 去中国留学。","明天 [会] 更好。","我 [希望] 你成功。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya berencana kuliah ke China → 我打算去中国留学。", "Saya pasti bisa berhasil → 我一定能成功。", "Target saya adalah HSK 4 → 我的目标是HSK四级。"))
            ),
            quizList = listOf(
                QuizQuestion("Kosa kata '打算' (dǎsuàn) memiliki arti...", "打算", listOf("Berencana / berniat", "Menyesali masa lalu", "Sedang menikmati", "Membatalkan"), 0),
                QuizQuestion("Kata keterangan '一定' (yídìng) berarti...", "一定", listOf("Pasti / tentu saja", "Mungkin saja", "Tidak pernah", "Ragu-ragu"), 0),
                QuizQuestion("Kosa kata '希望' (xīwàng) memiliki arti...", "希望", listOf("Berharap / harapan", "Takut", "Marah", "Capek"), 0),
                QuizQuestion("Kosa kata '目标' (mùbiāo) berarti...", "目标", listOf("Target / sasaran capaian", "Alasan kekalahan", "Asal negara", "Waktu luang"), 0),
                QuizQuestion("Apa arti pepatah '坚持就是胜利' (jiānchí jiù shì shènglì)?", "坚持就是胜利", listOf("Ketekunan dan konsistensi adalah kemenangan", "Kekayaan membawa kebahagiaan", "Kecepatan mengalahkan ketelitian", "Istirahat adalah yang utama"), 0)
            )
        )

        // ==================== BAB 18: Emosi & Opini (Pages 171-180) ====================
        addStandardChapter(
            startGlobal = 171, num = 18, title = "Emosi & Opini Pribadi", zh = "情绪与观点表达", icon = "💭",
            goals = listOf("Menyatakan emosi gembira, sedih, lelah, cemas", "Menyatakan pendapat dengan 觉得 & 认为", "Menggunakan konjungsi kausal 因为…所以 (karena... maka...)", "Menyatakan persetujuan (同意) & penolakan (反对)"),
            v1Title = "Ungkapan Ragam Emosi",
            v1Words = listOf(
                VocabWord("高兴 / 开心", "gāoxìng / kāixīn", "senang / gembira", "今天通过考试，太高兴了！", "Hari ini lulus ujian, senang sekali!"),
                VocabWord("难过 / 伤心", "nánguò / shāngxīn", "sedih / pilu hati", "别难过了，一切都会过去的。", "Jangan bersedih lagi, semua akan berlalu."),
                VocabWord("生气", "shēngqì", "marah / kesal", "别为了小事生气。", "Jangan marah hanya karena masalah sepele."),
                VocabWord("紧张", "jǐnzhāng", "gugup / tegang", "面试前心里有点紧张。", "Sebelum wawancara hati terasa agak gugup."),
                VocabWord("害怕", "hàipà", "takut", "不要害怕犯错，犯错是成长的垫脚石。", "Jangan takut berbuat salah, kesalahan adalah batu loncatan."),
                VocabWord("累", "lèi", "lelah / capek", "今天忙了一整天，好累啊。", "Hari ini sibuk seharian, lelah sekali."),
                VocabWord("饿", "è", "lapar", "肚子咕咕叫，我饿了。", "Perut keroncongan, saya lapar."),
                VocabWord("渴", "kě", "haus / dahaga", "走了很远的路，口好渴。", "Jalan jauh sekali, tenggorokan haus."),
                VocabWord("担心", "dānxīn", "khawatir / cemas", "别担心，有我们在呢。", "Jangan cemas, ada kami di sini."),
                VocabWord("放心", "fàngxīn", "tenang / lega hati", "请妈妈放心，我一切都好。", "Harap ibu tenang, saya baik-baik saja.")
            ),
            v2Title = "Mengungkapkan Pendapat & Logika",
            v2Words = listOf(
                VocabWord("觉得", "juéde", "merasa / menganggap (opini santai)", "我觉得这部电影很有深度。", "Saya rasa film ini berbobot mendalam."),
                VocabWord("认为", "rènwéi", "berpendapat (formal/rasional)", "我认为方案还需要优化。", "Saya berpendapat proposal masih butuh optimasi."),
                VocabWord("同意", "tóngyì", "setuju / sepakat", "我完全同意你的看法。", "Saya sepenuhnya setuju dengan pandanganmu."),
                VocabWord("反对", "fǎnduì", "menolak / tidak setuju", "他反对这个草率的提议。", "Dia menolak usulan tergesa-gesa ini."),
                VocabWord("有意思", "yǒu yìsi", "menarik / seru", "中国书法非常有意思。", "Kaligrafi Tiongkok sangatlah menarik."),
                VocabWord("无聊", "wúliáo", "membosankan / menjemukan", "整天待在家里很无聊。", "Seharian di rumah membosankan."),
                VocabWord("当然", "dāngrán", "tentu saja / pasti", "当然可以，随时欢迎！", "Tentu saja boleh, selalu terbuka!"),
                VocabWord("真的吗", "zhēn de ma", "benarkah / sungguhkah", "真的吗？太不可思议了！", "Sungguhkah? Luar biasa sekali!"),
                VocabWord("其实", "qíshí", "sebenarnya / kenyataannya", "其实学汉语并不难。", "Sebenarnya belajar Mandarin tidaklah sulit."),
                VocabWord("看法 / 意见", "kànfǎ / yìjiàn", "pendapat / opini", "我想听听你的个人看法。", "Saya ingin mendengarkan pendapat pribadimu.")
            ),
            g1Title = "Menyatakan Pendapat: 觉得 & 认为",
            g1Items = listOf(
                GrammarItem("觉得 (juéde) — Pendapat Pribadi", "Subjek + 觉得 + Kalimat Penilaian", "Digunakan dalam obrolan santai untuk menyatakan rasa atau anggapan subjektif.", listOf(GrammarExample("我觉得这本书很有趣。", "Wǒ juéde zhè běn shū hěn yǒuqù.", "Saya merasa buku ini sangat menarik."), GrammarExample("你觉得这家餐厅怎么样？", "Nǐ juéde zhè jiā cāntīng zěnmeyàng?", "Menurutmu bagaimana restoran ini?"))),
                GrammarItem("认为 (rènwéi) — Pendapat Formal/Rasional", "Subjek + 认为 + Analisis", "Digunakan dalam konteks akademis atau profesional untuk menyatakan opini beralasan.", listOf(GrammarExample("我认为这个方案更可行。", "Wǒ rènwéi zhège fāng'àn gèng kěxíng.", "Saya berpendapat solusi ini lebih layak diterapkan.")))
            ),
            g2Title = "Konjungsi Kausal: 因为…所以…",
            g2Items = listOf(
                GrammarItem("因为…所以… (Karena... Maka...)", "因为 + Alasan, 所以 + Hasil/Kesimpulan", "Pola hubungan sebab-akibat standar dalam bahasa Mandarin.", listOf(GrammarExample("因为今天下暴雨，所以我没有去跑步。", "Yīnwèi jīntiān xià bàoyǔ, suǒyǐ wǒ méiyǒu qù pǎobù.", "Karena hari ini hujan lebat, maka saya tidak pergi lari."), GrammarExample("因为他坚持努力，所以取得了优异成绩。", "Yīnwèi tā jiānchí nǔlì, suǒyǐ qǔdé le yōuyì chéngjì.", "Karena dia tekun berusaha, maka meraih prestasi luar biasa.")))
            ),
            d1Title = "Bertukar Sudut Pandang", d1Icon = "💬", d1SceneTitle = "Diskusi Kelompok", d1SceneDesc = "Membicarakan metode belajar bahasa Mandarin.",
            d1Lines = listOf(
                DialogLine("A", "你觉得学中文最难的部分是汉字还是声调？", "Nǐ juéde xué Zhōngwén zuì nán de bùfen shì hànzì háishi shēngdiào?", "Menurutmu bagian tersulit belajar Mandarin adalah karakter Hanzi atau nada bicara?"),
                DialogLine("B", "我认为起初声调比较难，但掌握规律后，记汉字需要更多耐心。", "Wǒ rènwéi qǐchū shēngdiào bǐjiào nán, dàn zhǎngwò guīlǜ hòu, jì hànzì xūyào gèng duō nàixīn.", "Saya berpendapat awalnya nada agak sulit, namun setelah paham aturannya, mengingat Hanzi butuh lebih banyak kesabaran."),
                DialogLine("A", "我完全同意你的意见！多写多练是记住汉字的不二法门。", "Wǒ wánquán tóngyì nǐ de yìjiàn! Duō xiě duō liàn shì jìzhù hànzì de bú'èr fǎmén.", "Saya sepenuhnya setuju dengan pendapatmu! Banyak menulis dan berlatih adalah kunci utama menghafal Hanzi."),
                DialogLine("B", "没错，只要每天坚持写五个生字，日积月累就不可限量。", "Méi cuò, zhǐyào měitiān jiānchí xiě wǔ ge shēngzì, rìjī-yuèlěi jiù bùkě xiànliàng.", "Tepat sekali, asalkan setiap hari konsisten menulis 5 huruf baru, akumulasi seiring waktu tak terhingga.")
            ),
            d2Title = "Menghibur Sahabat yang Sedih", d2Icon = "😊", d2SceneTitle = "Di Bangku Taman", d2SceneDesc = "Memberikan dukungan moral kepada sahabat.",
            d2Lines = listOf(
                DialogLine("A", "你看上去闷闷不乐，发生什么事了？", "Nǐ kàn shàngqù mènmèn-búlè, fāshēng shénme shì le?", "Kamu terlihat murung, apa yang terjadi?"),
                DialogLine("B", "今天的演讲比赛我发挥失常，心里很难过。", "Jīntiān de yǎnjiǎng bǐsài wǒ fāhuī shīcháng, xīnlǐ hěn nánguò.", "Lomba pidato hari ini saya tampil kurang maksimal, hati saya sangat sedih."),
                DialogLine("A", "别灰心！失败是成功之母，大家已经看到了你的巨大进步。", "Bié huīxīn! Shībài shì chénggōng zhī mǔ, dàjiā yǐjīng kàndào le nǐ de jùdà jìnbù.", "Jangan patah arang! Kegagalan adalah ibu kesuksesan, semua orang sudah melihat kemajuan besarmu."),
                DialogLine("B", "听你这么说，我心里好受多了，谢谢你的安慰！", "Tīng nǐ zhème shuō, wǒ xīnlǐ hǎoshòu duō le, xièxie nǐ de ānwèi!", "Mendengar perkataanmu, hatiku merasa jauh lebih lega, terima kasih atas hiburanmu!")
            ),
            rdTitle = "Konsep 'Mianzi' (Martabat Muka) dalam Sosial Tiongkok", rdZh = "中国社交伦理中的\"面子\"", rdIcon = "🎭",
            rdText = "\"面子\"（个人尊严与体面）是中国人际交往中至关重要的隐性规则。在公开场合，中国人极力避免让对方\"丢面子\"，而是讲求\"给面子\"\"留余地\"。这种含蓄委婉的沟通艺术旨在维护集体的和谐稳定。",
            rdPy = "'Miànzi' shì Zhōngguó rénjì jiāowǎng zhōng zhìguān zhòngyào de yǐnxìng guīzé.",
            rdId = "Konsep 'Mianzi' (harga diri / martabat) sangat dijaga dalam relasi masyarakat Tiongkok. Di muka umum, orang Tionghoa menghindari mempermalukan orang lain dan memilih komunikasi yang menjaga martabat bersama.",
            rdNote = "Kritik atau masukan kepada rekan sebaiknya disampaikan secara empat mata dengan bahasa yang halus dan konstruktif.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我 [觉得] 这部电影很有意思。","[因为] 下雨，[所以] 我没去。","我完全 [同意] 你的想法。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya merasa ini sangat bagus → 我觉得这个很好。", "Karena sibuk maka tidak pergi → 因为忙所以没去。", "Saya setuju dengan pendapatmu → 我同意你的意见。"))
            ),
            quizList = listOf(
                QuizQuestion("Kosa kata '高兴' (gāoxìng) memiliki arti...", "高兴", listOf("Senang / gembira", "Marah besar", "Takut gelap", "Sangat lapar"), 0),
                QuizQuestion("Pasangan konjungsi kausal yang tepat untuk 'karena... maka...' adalah...", "因为所以", listOf("因为……所以…… (yīnwèi... suǒyǐ...)", "虽然……但是……", "不但……而且……", "如果……就……"), 0),
                QuizQuestion("Ungkapan untuk menyatakan 'Saya setuju' adalah...", "我同意", listOf("我同意 (wǒ tóngyì)", "我反对 (wǒ fǎnduì)", "我不知道", "我不客气"), 0),
                QuizQuestion("Kosa kata '无聊' (wúliáo) berarti...", "无聊", listOf("Membosankan / menjemukan", "Sangat menarik", "Luar biasa lezat", "Terlalu mahal"), 0),
                QuizQuestion("Kosa kata '紧张' (jǐnzhāng) menggambarkan perasaan...", "紧张", listOf("Gugup / tegang", "Mengantuk", "Kenyang", "Puas"), 0)
            )
        )

        // ==================== BAB 19: Budaya & Festival (Pages 181-190) ====================
        addStandardChapter(
            startGlobal = 181, num = 19, title = "Budaya & Festival Tradisional", zh = "传统民俗与节日", icon = "🏮",
            goals = listOf("Menyebutkan festival agung: Imlek, Kue Bulan, Perahu Naga", "Menceritakan tradisi Tahun Baru Imlek (春节)", "Menggunakan pola waktu 在…的时候 (ketika/pada saat)", "Mengucapkan salam perayaan selamat tahun baru"),
            v1Title = "Festival Tradisional Utama",
            v1Words = listOf(
                VocabWord("节日", "jiérì", "hari raya / festival perayaan", "你最喜欢的中国节日是什么？", "Apa festival Tiongkok favoritmu?"),
                VocabWord("春节", "Chūnjié", "Tahun Baru Imlek (Festival Musim Semi)", "春节是中国最重要的传统节日。", "Imlek adalah festival tradisional terpenting."),
                VocabWord("中秋节", "Zhōngqiūjié", "Festival Pertengahan Musim Gugur (Kue Bulan)", "中秋夜全家团聚赏满月。", "Malam kue bulan sekeluarga berkumpul memandang purnama."),
                VocabWord("端午节", "Duānwǔjié", "Festival Perahu Naga (Duanwu)", "端午节赛龙舟，吃甜咸粽子。", "Festival Duanwu balap perahu naga, makan bakcang."),
                VocabWord("元宵节", "Yuánxiāojié", "Festival Lampion (Cap Go Meh)", "正月十五闹元宵，猜灯谜。", "Tanggal 15 bulan pertama merayakan lampion dan tebak teka-teki."),
                VocabWord("国庆节", "Guóqìngjié", "Hari Kemerdekaan Nasional Tiongkok (1 Oktober)", "国庆长假放假七天黄金周。", "Libur panjang Hari Nasional 7 hari Golden Week."),
                VocabWord("放假", "fàngjià", "berlibur / cuti libur", "明天开始放假三天。", "Mulai besok libur selama 3 hari."),
                VocabWord("庆祝", "qìngzhù", "merayakan / memperingati", "热烈庆祝新年到来。", "Merayakan dengan hangat datangnya tahun baru."),
                VocabWord("月饼", "yuèbǐng", "kue bulan", "五仁月饼与蛋黄月饼。", "Kue bulan aneka kacang dan telur asin."),
                VocabWord("粽子", "zòngzi", "bakcang (nasi pulut isi)", "端午节包粽子。", "Membungkus bakcang saat Festival Duanwu.")
            ),
            v2Title = "Adat Istiadat & Simbol Kemakmuran",
            v2Words = listOf(
                VocabWord("红包 / 压岁钱", "hóngbāo", "angpao merah (uang berkah)", "长辈给晚辈发压岁钱红包。", "Generasi tua membagikan angpao berkah kepada anak muda."),
                VocabWord("饺子", "jiǎozi", "pangsit (lambang pundi emas)", "大年三十全家人包饺子。", "Malam tahun baru Imlek sekeluarga membungkus pangsit."),
                VocabWord("舞狮 / 舞龙", "wǔshī / wǔlóng", "barongsai (tari singa/naga)", "锣鼓喧天看精彩舞狮表演。", "Genderang riuh menonton atraksi barongsai."),
                VocabWord("拜年", "bàinián", "sungkem / silaturahmi tahun baru", "大年初一走亲访友去拜年。", "Hari pertama Imlek berkunjung silaturahmi sungkem."),
                VocabWord("贴春联", "tiē chūnlián", "menempelkan bait puisi musim semi merah", "门前贴上大红春联和福字。", "Di pintu ditempel kuplet merah dan karakter Fu."),
                VocabWord("放鞭炮", "fàng biānpào", "menyalakan petasan / kembang api", "噼里啪啦放鞭炮辞旧迎新。", "Menyalakan petasan menyambut tahun yang baru."),
                VocabWord("团圆饭", "tuányuán fàn", "makan malam reuni keluarga", "除夕夜吃丰盛的年夜团圆饭。", "Malam tahun baru bersantap malam reuni keluarga."),
                VocabWord("传统", "chuántǒng", "tradisi / warisan leluhur", "弘扬中华优秀传统文化。", "Melestarikan tradisi luhur Tionghoa."),
                VocabWord("新年快乐", "xīnnián kuàilè", "Selamat Tahun Baru!", "恭祝大家新年快乐，万事如意！", "Semoga semuanya Selamat Tahun Baru dan segala cita terkabul!"),
                VocabWord("恭喜发财", "gōngxǐ fācái", "Semoga makin makmur dan sejahtera!", "恭喜发财，红包拿来！", "Semoga banyak rezeki, bagi angpaonya!")
            ),
            g1Title = "Keterangan Waktu Khusus: 在…的时候",
            g1Items = listOf(
                GrammarItem("在 + Peristiwa / Waktu + 的时候", "在 + Musim/Hari Raya + 的时候，...", "Menyatakan kebiasaan atau aktivitas yang dilakukan bertepatan dengan momentum tersebut.", listOf(GrammarExample("在春节的时候，我们一家人包饺子吃。", "Zài Chūnjié de shíhou, wǒmen yì jiā rén bāo jiǎozi chī.", "Pada saat Imlek, sekeluarga kami membungkus dan makan pangsit."), GrammarExample("在中秋节的时候，大家一起吃月饼赏月。", "Zài Zhōngqiūjié de shíhou, dàjiā yìqǐ chī yuèbǐng shǎng yuè.", "Pada saat Festival Kue Bulan, semua bersama-sama makan kue bulan dan memandang rembulan.")))
            ),
            g2Title = "Ungkapan Memberi Hadiah: 给…送…",
            g2Items = listOf(
                GrammarItem("给 + Penerima + 送 + Hadiah", "Subjek + 给 + Seseorang + 送 + Benda", "Format menyatakan pemberian bingkisan atau hadiah.", listOf(GrammarExample("过节时我给老师送了盒茶叶。", "Guòjié shí wǒ gěi lǎoshī sòng le hé cháyè.", "Saat hari raya saya menghadiahkan sekotak daun teh untuk guru.")))
            ),
            d1Title = "Membicarakan Hari Raya Favorit", d1Icon = "🎊", d1SceneTitle = "Di Kelas Bahasa", d1SceneDesc = "Membahas festival Tiongkok yang paling disukai.",
            d1Lines = listOf(
                DialogLine("A", "在所有中国传统节日中，你最喜欢哪一个？", "Zài suǒyǒu Zhōngguó chuántǒng jiérì zhōng, nǐ zuì xǐhuan nǎ yí ge?", "Di antara semua festival tradisional Tiongkok, mana yang paling kamu sukai?"),
                DialogLine("B", "我最喜欢春节！因为街道上张灯结彩，到处洋溢着喜庆年味。", "Wǒ zuì xǐhuan Chūnjié! Yīnwèi jiēdào shàng zhāngdēng-jiécǎi, dàochù yángyì zhe xǐqìng niánwèi.", "Saya paling suka Imlek! Karena jalanan berhias lampion merah dan semarak aroma tahun baru."),
                DialogLine("A", "我也喜欢，尤其是大年夜全家人聚在一起吃团圆饭，温馨感人。", "Wǒ yě xǐhuan, yóuqí shì dànián yè quánjiā rén jù zài yìqǐ chī tuányuán fàn, wēnxīn gǎnrén.", "Saya juga suka, terutama saat malam tahun baru keluarga besar berkumpul makan malam reuni, sangat menghangatkan hati."),
                DialogLine("B", "还有孩子们最期盼的环节——收压岁钱红包！", "Hái yǒu háizimen zuì qīpàn de huánjié —— shōu yàsuìqián hóngbāo!", "Dan tentu momen yang paling dinantikan anak-anak — menerima amplop angpao!")
            ),
            d2Title = "Persiapan Menyambut Tahun Baru Imlek", d2Icon = "🏮", d2SceneTitle = "Di Rumah", d2SceneDesc = "Mempersiapkan pernak-pernik tahun baru.",
            d2Lines = listOf(
                DialogLine("A", "明天就是除夕了，家里的大扫除做好了吗？", "Míngtiān jiù shì Chúxī le, jiā lǐ de dàsǎochú zuòhǎo le ma?", "Besok sudah malam tahun baru, apakah bersih-bersih rumah sudah selesai?"),
                DialogLine("B", "窗明几净全打扫完了，正准备贴大红春联和'福'字呢。", "Chuāngmíng-jǐjìng quán dǎsǎo wán le, zhèng zhǔnbèi tiē dàhóng chūnlián hé 'fú' zì ne.", "Semua kaca dan perabot sudah kinclong disapu, ini sedang bersiap menempelkan kuplet merah dan huruf 'Fu'."),
                DialogLine("A", "'福'字要倒着贴，寓意'福气到家'！", "'Fú' zì yào dào zhe tiē, yùyì 'fúqì dào jiā'!", "Huruf 'Fu' (berkah) harus ditempel terbalik, perlambang 'berkah tiba di rumah'!"),
                DialogLine("B", "好传统！祝愿我们新的一年吉祥如意、幸福安康！", "Hǎo chuántǒng! Zhùyuàn wǒmen xīn de yì nián jíxiáng rúyì, xìngfú ānkāng!", "Tradisi yang indah! Semoga di tahun baru kita senantiasa beruntung dan bahagia sentosa!")
            ),
            rdTitle = "Makna Filosofis Festival Musim Semi (Chunjie)", rdZh = "春回大地，团圆至上", rdIcon = "🏮",
            rdText = "春节是中华民族数千年岁时文化的结晶。它不仅标志着严冬消退、大地迎春的农耕节律，更寄托了亿万家庭对\"团圆\"\"和谐\"与\"新生\"的永恒期盼。无论身在何方，除夕回家吃团圆饭是烙刻在每个华人心底的温情守望。",
            rdPy = "Chūnjié shì Zhōnghuá mínzú shù qiān nián suìshí wénhuà de jiéjīng.",
            rdId = "Tahun Baru Imlek (Chunjie) adalah festival teragung Tiongkok yang melambangkan datangnya musim semi, reuni akbar keluarga, dan harapan kemakmuran baru. Jutaan perantau pulang kampung (Chunyun) demi makan malam bersama keluarga di malam Imlek.",
            rdNote = "Bait puisi musim semi (春联) ditulis dengan tinta emas/hitam di atas kertas merah dan dipasang di sisi kanan-kiri pintu masuk.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("[春节] 是最重要的传统节日。","[中秋节] 全家一起吃月饼。","长辈给晚辈发 [红包]。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Selamat Tahun Baru! → 新年快乐！", "Semoga makin makmur → 恭喜发财！", "Pada saat Imlek kami makan pangsit → 在春节的时候我们吃饺子。"))
            ),
            quizList = listOf(
                QuizQuestion("Festival tradisional paling utama di Tiongkok adalah...", "春节", listOf("春节 (Chūnjié / Imlek)", "端午节 (Duanwu)", "中秋节 (Kue Bulan)", "清明节 (Qingming)"), 0),
                QuizQuestion("Makanan khas yang disantap pada saat Festival Kue Bulan (中秋节) adalah...", "月饼", listOf("月饼 (yuèbǐng / kue bulan)", "饺子 (pangsit)", "粽子 (bakcang)", "面条 (mie)"), 0),
                QuizQuestion("Amplop merah berisi uang berkah yang dibagikan saat Imlek disebut...", "红包", listOf("红包 (hóngbāo)", "月饼 (yuèbǐng)", "春联 (chūnlián)", "鞭炮 (biānpào)"), 0),
                QuizQuestion("Kosa kata '团圆' (tuányuán) memiliki makna luhur...", "团圆", listOf("Berkumpul bersama keluarga secara utuh", "Bepergian ke tempat jauh", "Menang dalam perlombaan", "Membeli barang mewah"), 0),
                QuizQuestion("Bagaimana mengucapkan 'Selamat Tahun Baru' dalam bahasa Mandarin?", "新年快乐", listOf("新年快乐！ (xīnnián kuàilè)", "生日快乐！", "再见保重！", "不用谢！"), 0)
            )
        )

        // ==================== BAB 20: Review & HSK (Pages 191-200) ====================
        addStandardChapter(
            startGlobal = 191, num = 20, title = "Review Akbar & HSK", zh = "知识总复习与HSK通关", icon = "🏆",
            goals = listOf("Meninjau 12 pola tata bahasa inti HSK 1–3", "Kiat sukses ujian HSK Listening & Reading", "Melatih pelafalan standar dan kefasihan berbicara", "Memantapkan tekad belajar mandiri berkelanjutan"),
            v1Title = "Kosa Kata Ujian & Evaluasi Kemampuan",
            v1Words = listOf(
                VocabWord("复习", "fùxí", "mengulang kaji / review pelajaran", "温故而知新，每天认真复习。", "Mengulang yang lama memahami yang baru, review tekun."),
                VocabWord("考试", "kǎoshì", "ujian / evaluasi tes", "HSK汉语水平考试。", "Ujian Standar Kemahiran Bahasa Mandarin (HSK)."),
                VocabWord("练习", "liànxí", "berlatih / latihan soal", "多做真题模拟练习。", "Perbanyak latihan simulasi soal ujian."),
                VocabWord("语法", "yǔfǎ", "tata bahasa (grammar)", "汉语语法结构条理清晰。", "Struktur tata bahasa Mandarin teratur dan runtut."),
                VocabWord("词汇", "cíhuì", "kosa kata (vocabulary)", "掌握核心常用词汇。", "Menguasai kosa kata inti sehari-hari."),
                VocabWord("听力", "tīnglì", "kemampuan mendengar (listening)", "每天听三十分钟中文广播练听力。", "Dengar siaran Mandarin 30 menit sehari untuk latih listening."),
                VocabWord("口语", "kǒuyǔ", "percakapan lisan (speaking)", "大胆开口说，不要怕说错。", "Berani buka mulut berbicara, jangan takut salah."),
                VocabWord("阅读", "yuèdú", "kemampuan membaca teks (reading)", "培养中文阅读语感。", "Menumbuhkan rasa bahasa membaca teks Mandarin."),
                VocabWord("写作", "xiězuò", "kemampuan menulis (writing)", "用学过的词汇写中文日记。", "Gunakan kosa kata yang dipelajari untuk menulis buku harian."),
                VocabWord("水平", "shuǐpíng", "tingkat kemahiran / level", "中文听说读写水平全面提升。", "Tingkat listening, speaking, reading, writing meningkat pesat.")
            ),
            v2Title = "Kiat Sukses & Motivasi Belajar",
            v2Words = listOf(
                VocabWord("通过", "tōngguò", "lulus / menembus batas ujian", "顺利通过HSK考试！", "Lancar lulus ujian HSK!"),
                VocabWord("加油", "jiāyóu", "semangat! / berjuanglah!", "加油！你一定能行！", "Semangat! Kamu pasti bisa!"),
                VocabWord("坚持", "jiānchí", "tekun / pantang menyerah", "滴水穿石，贵在坚持。", "Tetesan air menembus batu, kuncinya ketekunan."),
                VocabWord("进步", "jìnbù", "kemajuan / peningkatan pesat", "你的中文口语进步神速！", "Speaking Mandarinmu mengalami kemajuan luar biasa!"),
                VocabWord("信心", "xìnxīn", "kepercayaan diri (PD)", "树立坚定的自信心。", "Bangun rasa percaya diri yang kokoh."),
                VocabWord("流利", "liúlì", "fasih / lancar berbicara", "说一口流利标准的地道普通话。", "Berbicara Mandarin baku yang fasih dan otentik."),
                VocabWord("标准", "biāozhǔn", "standar baku / presisi", "发音吐字非常清晰标准。", "Pelafalan artikulasi sangat jelas dan baku."),
                VocabWord("成功", "chénggōng", "meraih kesuksesan gemilang", "祝贺你取得优异成绩！", "Selamat atas pencapaian prestasi gemilangmu!"),
                VocabWord("秘诀", "mìjué", "kunci rahasia sukses", "学好语言没有捷径，秘诀在于日积月累。", "Belajar bahasa tiada jalan pintas, kuncinya akumulasi konsisten."),
                VocabWord("圆满", "yuánmǎn", "tuntas paripurna / lengkap sempurna", "200页中文宝典圆满结课！", "Kitab 200 Halaman Mandarin tuntas paripurna!")
            ),
            g1Title = "Ringkasan 12 Pola Tata Bahasa Inti HSK 1–3",
            g1Items = listOf(
                GrammarItem(
                    title = "12 Pola Tata Bahasa Inti yang Wajib Dikuasai",
                    formula = "Ringkasan Formula Emas HSK 1-3",
                    description = "1. Kopula 是 (adalah)\n2. Kepemilikan 有 & 没有\n3. Tanya 吗, 什么, 哪儿, 几\n4. Modalitas 想, 要, 会, 能\n5. Pengalaman 过\n6. Perubahan 了\n7. Lokasi 在\n8. Derajat 太…了\n9. Kausal 因为…所以\n10. Rentang 从…到\n11. Komunikasi 给…打电话\n12. Ajakan 我们…吧",
                    examples = listOf(
                        GrammarExample("我是学生，我学汉语。", "Wǒ shì xuésheng, wǒ xué Hànyǔ.", "Saya adalah murid, saya belajar Mandarin."),
                        GrammarExample("我去过中国，我很喜欢那里的文化。", "Wǒ qù guo Zhōngguó, wǒ hěn xǐhuan nàlǐ de wénhuà.", "Saya pernah ke China, saya sangat suka budayanya."),
                        GrammarExample("因为坚持努力，所以一定能成功！", "Yīnwèi jiānchí nǔlì, suǒyǐ yídìng néng chénggōng!", "Karena tekun berusaha, maka pasti bisa sukses!")
                    )
                )
            ),
            g2Title = "Strategi Emas Menaklukkan Ujian HSK",
            g2Items = listOf(
                GrammarItem("Strategi Bagian Listening (听力)", "Baca pilihan opsi sebelum audio berbunyi", "Garis bawahi kata kunci: waktu (jam/hari), tempat, profesi, dan angka sebelum rekaman dimulai."),
                GrammarItem("Strategi Bagian Reading (阅读)", "Temukan kata kunci pertanyaan terlebih dahulu", "Cari kata kunci pertanyaan di dalam teks bacaan tanpa perlu menerjemahkan setiap karakter kata demi kata.")
            ),
            d1Title = "Dorongan Motivasi Terakhir", d1Icon = "💪", d1SceneTitle = "Di Kelas Terakhir", d1SceneDesc = "Guru memberikan petuah kelulusan.",
            d1Lines = listOf(
                DialogLine("A", "老师，学完了这200页，我发现自己能看懂好多汉字了！", "Lǎoshī, xuéwán le zhè èrbǎi yè, wǒ fāxiàn zìjǐ néng kàndǒng hǎoduō hànzì le!", "Guru, setelah menuntaskan 200 halaman ini, saya menyadari bisa membaca banyak karakter Hanzi!"),
                DialogLine("B", "太棒了！语言学习是一场美妙的旅程，你打下了极其扎实坚固的底子。", "Tài bàng le! Yǔyán xuéxí shì yì chǎng měimiào de lǚchéng, nǐ dǎxià le jíqí zhāshi jiāngù de dǐzi.", "Luar biasa! Belajar bahasa adalah petualangan indah, kamu telah meletakkan fondasi yang kokoh."),
                DialogLine("A", "我一定会继续坚持，争取今年顺利拿下HSK证书！", "Wǒ yídìng huì jìxù jiānchí, zhēngqǔ jīnnián shùnlì náxià HSK zhèngshū!", "Saya pasti akan terus konsisten, berjuang lancar meraih sertifikat HSK tahun ini!"),
                DialogLine("B", "加油，Budi！天道酬勤，未来更广阔的中文世界在等待着你！", "Jiāyóu, Budi! Tiāndào-chóuqín, wèilái gèng guǎngkuò de Zhōngwén shìjiè zài děngdài zhe nǐ!", "Semangat, Budi! Usaha takkan mengkhianati hasil, dunia Mandarin yang lebih luas menantimu!")
            ),
            d2Title = "Kelulusan Paripurna", d2Icon = "🎓", d2SceneTitle = "Wisuda Kursus", d2SceneDesc = "Saling mengucap selamat dan janji pertemanan abadi.",
            d2Lines = listOf(
                DialogLine("A", "真不敢相信，我们一起学完了整整二十个章节！", "Zhēn bù gǎn xiāngxìn, wǒmen yìqǐ xuéwán le zhěngzhěng èrshí ge zhāngjié!", "Sungguh menakjubkan, kita telah belajar bersama menuntaskan 20 bab utuh!"),
                DialogLine("B", "是啊，从最初的汉语拼音和四个声调，到现在能自如交流日常话题。", "Shì a, cóng zuìchū de Hànyǔ pīnyīn hé sì ge shēngdiào, dào xiànzài néng zìrú jiāoliú rìcháng huàtí.", "Benar sekali, dari mula pinyin dan 4 nada, kini mampu berbincang luwes topik harian."),
                DialogLine("A", "特别感谢作者Capt.John I.P精心编著的这套教材，图文声并茂！", "Tèbié gǎnxiè zuòzhě Capt.John I.P jīngxīn biānzhù de zhè tào jiàocái, tú wén shēng bìng mào!", "Terima kasih khusus kepada penulis Capt.John I.P yang merancang buku luar biasa ini, visual dan suara berpadu!"),
                DialogLine("B", "愿友谊天长地久，让我们在中文之路上共同翱翔！", "Yuàn yǒuyì tiāncháng-dìjiǔ, ràng wǒmen zài Zhōngwén zhī lù shàng gòngtóng áoxiáng!", "Semoga persahabatan abadi, mari kita terus terbang bersama di jalan bahasa Mandarin!")
            ),
            rdTitle = "Rahasia Utama Menguasai Bahasa Mandarin", rdZh = "精诚所至，金石为开", rdIcon = "🔑",
            rdText = "学习中文没有高深莫测的神秘捷径，唯一的秘诀就是：\"融入日常、日日坚持\"。每天花15分钟朗读、练习发音、听一段录音，效果远胜于一周只突击一次。保持好奇与热情，错误是最好的导师。只要持之以恒，人人都能说一口地道流利的中国话！",
            rdPy = "Xuéxí Zhōngwén méiyǒu gāoshēn-mòcè de shénmì jiéjìng.",
            rdId = "Belajar bahasa Mandarin tidak butuh jalan pintas yang rumit. Rahasianya sederhana: konsistensi 15 menit setiap hari. Mendengar, mengucapkan, membaca, dan menulis secara konsisten akan membuahkan kefasihan sejati.",
            rdNote = "Buku ini didedikasikan oleh Capt.John I.P, SH, S.Si.T, M.Mar untuk setiap pembelajar yang bertekad kuat menguasai bahasa Mandarin.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Pola", listOf("我 [是] 学生，我学汉语。","我去 [过] 中国两次。","[因为] 坚持努力，[所以] 进步很快。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Semangat! Kamu pasti bisa! → 加油！你一定行！", "Kemampuan saya maju pesat → 我的水平进步很快。", "Saya pasti bisa lulus ujian HSK → 我一定能通过HSK考试。"))
            ),
            quizList = listOf(
                QuizQuestion("Kosa kata motivasi '加油' (jiāyóu) memiliki arti...", "加油", listOf("Semangat! / Berjuanglah!", "Sampai jumpa", "Terima kasih", "Hati-hati di jalan"), 0),
                QuizQuestion("Strategi terbaik dalam mengerjakan soal HSK Listening adalah...", "听力技巧", listOf("Membaca opsi pilihan sebelum rekaman audio berbunyi", "Menutup mata dan hanya menebak", "Menunggu audio selesai baru membaca", "Mengabaikan angka dan waktu"), 0),
                QuizQuestion("Kosa kata '通过' (tōngguò) dalam konteks ujian berarti...", "通过", listOf("Lulus / lolos tes", "Gagal ujian", "Mengulang tahun", "Membeli formulir"), 0),
                QuizQuestion("Kosa kata '流利' (liúlì) menggambarkan kemampuan...", "流利", listOf("Fasih dan lancar berbicara", "Sulit dimengerti", "Sangat lambat", "Keras dan bising"), 0),
                QuizQuestion("Kunci terpenting untuk menguasai bahasa Mandarin hingga mahir adalah...", "学习秘诀", listOf("Konsistensi latihan setiap hari", "Menghafal satu malam sebelum ujian", "Hanya membaca tanpa mendengar audio", "Takut berbicara"), 0)
            )
        )

        return pages
    }
}
