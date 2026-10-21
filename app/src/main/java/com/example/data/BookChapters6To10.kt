package com.example.data

object BookChapters6To10 {

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

        // ==================== BAB 6: Belanja & Tawar (Pages 51-60) ====================
        addStandardChapter(
            startGlobal = 51, num = 6, title = "Belanja & Tawar Menawar", zh = "购物与讨价还价", icon = "🛍️",
            goals = listOf("Menanyakan harga barang dengan 多少钱", "Menyebutkan warna dan jenis pakaian", "Tawar menawar dengan 便宜一点", "Menyatakan terlalu mahal dengan 太…了"),
            v1Title = "Istilah Belanja Dasar",
            v1Words = listOf(
                VocabWord("买", "mǎi", "membeli", "我要买这个。", "Saya mau beli yang ini."),
                VocabWord("卖", "mài", "menjual", "这里卖水果吗？", "Apakah di sini menjual buah?"),
                VocabWord("多少钱", "duōshao qián", "berapa harganya", "这个多少钱？", "Berapa harga barang ini?"),
                VocabWord("块 / 元", "kuài / yuán", "yuan (satuan mata uang)", "五十块钱。", "Lima puluh yuan."),
                VocabWord("毛 / 角", "máo / jiǎo", "0,1 yuan (sen)", "五毛钱。", "Lima puluh sen (0,5 yuan)."),
                VocabWord("商店", "shāngdiàn", "toko", "这家商店很大。", "Toko ini sangat besar."),
                VocabWord("超市", "chāoshì", "supermarket", "我去超市买东西。", "Saya ke supermarket belanja barang."),
                VocabWord("市场", "shìchǎng", "pasar tradisional", "菜市场很热闹。", "Pasar sayur sangat ramai."),
                VocabWord("便宜", "piányi", "murah", "便宜一点吧！", "Murahkan sedikit dong!"),
                VocabWord("贵", "guì", "mahal", "太贵了！", "Terlalu mahal!")
            ),
            v2Title = "Warna & Pakaian",
            v2Words = listOf(
                VocabWord("颜色", "yánsè", "warna", "你喜欢什么颜色？", "Kamu suka warna apa?"),
                VocabWord("红", "hóng", "merah", "我喜欢红色的衣服。", "Saya suka baju warna merah."),
                VocabWord("黄", "huáng", "kuning", "黄色的花。", "Bunga warna kuning."),
                VocabWord("蓝", "lán", "biru", "蓝色的天空。", "Langit warna biru."),
                VocabWord("黑", "hēi", "hitam", "黑色的鞋子。", "Sepatu hitam."),
                VocabWord("白", "bái", "putih", "白色的衬衫。", "Kemeja putih."),
                VocabWord("衣服", "yīfu", "pakaian / baju", "这件衣服真漂亮。", "Baju ini sungguh indah."),
                VocabWord("鞋子", "xiézi", "sepatu", "我要买新鞋子。", "Saya mau beli sepatu baru."),
                VocabWord("帽子", "màozi", "topi", "这顶帽子多少钱？", "Topi ini berapa harganya?"),
                VocabWord("件", "jiàn", "kata penggolong pakaian", "一件衣服。", "Satu potong pakaian.")
            ),
            g1Title = "Menanyakan Harga & Pola 太…了",
            g1Items = listOf(
                GrammarItem("Menanyakan Harga (多少钱)", "Nomina + 多少钱？", "Digunakan untuk menanyakan harga barang.", listOf(GrammarExample("这个书包多少钱？", "Zhège shūbāo duōshao qián?", "Berapa harga tas ransel ini?"), GrammarExample("苹果多少钱一斤？", "Píngguǒ duōshao qián yì jīn?", "Apel berapa per setengah kilo?"))),
                GrammarItem("Struktur 太…了 (Terlalu...)", "太 + Kata Sifat + 了", "Menyatakan derajat yang sangat tinggi atau berlebihan.", listOf(GrammarExample("太贵了！", "Tài guì le!", "Terlalu mahal!"), GrammarExample("太好了！", "Tài hǎo le!", "Bagus sekali!")))
            ),
            g2Title = "Tawar Menawar & Permohonan Sopan",
            g2Items = listOf(
                GrammarItem("便宜一点 (Murahkan Sedikit)", "便宜 + 一点(儿) + 吧", "Kalimat pamungkas saat berbelanja di pasar tradisional.", listOf(GrammarExample("老板，便宜一点吧。", "Lǎobǎn, piányi yìdiǎn ba.", "Bos, tolong murahkan sedikit."), GrammarExample("可以打折吗？", "Kěyǐ dǎzhé ma?", "Apakah boleh dapat diskon?")))
            ),
            d1Title = "Menawar di Pasar Suvenir", d1Icon = "🧺", d1SceneTitle = "Di Pasar Cendera Mata", d1SceneDesc = "Budi menawar barang suvenir.",
            d1Lines = listOf(
                DialogLine("A", "老板，这个折扇多少钱？", "Lǎobǎn, zhège zhéshàn duōshao qián?", "Bos, kipas lipat ini berapa harganya?"),
                DialogLine("B", "八十块一把。", "Bāshí kuài yì bǎ.", "Delapan puluh yuan per buah."),
                DialogLine("A", "有点太贵了！便宜一点吧，五十块行不行？", "Yǒudiǎn tài guì le! Piányi yìdiǎn ba, wǔshí kuài xíng bù xíng?", "Agak kemahalan! Murahkan dikit dong, lima puluh yuan boleh tidak?"),
                DialogLine("B", "五十太少了，给你六十块吧，交个朋友！", "Wǔshí tài shǎo le, gěi nǐ liùshí kuài ba, jiāo ge péngyou!", "Lima puluh terlalu rendah, saya kasih enam puluh deh, anggap teman!"),
                DialogLine("A", "好，我要一把红色的，谢谢！", "Hǎo, wǒ yào yì bǎ hóngsè de, xièxie!", "Baik, saya ambil satu yang warna merah, terima kasih!")
            ),
            d2Title = "Membeli Pakaian", d2Icon = "👕", d2SceneTitle = "Toko Pakaian", d2SceneDesc = "Memilih ukuran dan mencoba baju.",
            d2Lines = listOf(
                DialogLine("A", "你好，这件衣服有大号的吗？", "Nǐ hǎo, zhè jiàn yīfu yǒu dà hào de ma?", "Halo, apakah baju ini ada ukuran besar (L)?"),
                DialogLine("B", "有的，您想试穿一下吗？", "Yǒu de, nín xiǎng shìchuān yíxià ma?", "Ada, apakah Anda mau mencobanya?"),
                DialogLine("A", "可以试穿吗？试衣间在哪儿？", "Kěyǐ shìchuān ma? Shìyījiān zài nǎr?", "Boleh dicoba? Ruang pas ada di mana?"),
                DialogLine("B", "试衣间就在那边的左拐处。", "Shìyījiān jiù zài nàbiān de zuǒ guǎi chù.", "Ruang pas tepat di sebelah kiri sana.")
            ),
            rdTitle = "Seni Tawar Menawar di China", rdZh = "中国的讨价还价艺术", rdIcon = "💰",
            rdText = "在中国的夜市、农贸市场和小商品市场，讨价还价是常见的生活场景。但大型百货商场、连锁超市通常明码标价，不能还价。还价时保持礼貌和微笑，往往能拿到满意的价格。",
            rdPy = "Zài Zhōngguó de yèshì, nóngmào shìchǎng hé xiǎoshāngpǐn shìchǎng, tǎojià huánjià shì chángjiàn de shēnghuó chǎngjǐng.",
            rdId = "Di pasar malam atau pasar rakyat China, tawar-menawar adalah bagian dari seni belanja sehari-hari. Namun di mall besar atau supermarket modern, harga sudah pas.",
            rdNote = "Trik umum: tawar dengan sopan sekitar 20-30% di pasar suvenir turis.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("这个多少 [钱]？", "太 [贵] 了，便宜一点吧！", "我要买一 [件] 衣服。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Berapa harganya? → 这个多少钱？", "Bisa diskon tidak? → 可以打折吗？", "Baju merah ini sangat indah → 这件红衣服很漂亮。"))
            ),
            quizList = listOf(
                QuizQuestion("Bagaimana menanyakan 'Berapa harganya?' dalam bahasa Mandarin?", "多少钱", listOf("多少钱？", "什么钱？", "几块钱？", "有钱吗？"), 0),
                QuizQuestion("Apa arti ungkapan '太贵了' (tài guì le)?", "太贵了", listOf("Terlalu mahal", "Sangat murah", "Cukup bagus", "Kurang besar"), 0),
                QuizQuestion("Warna 'Merah' dalam bahasa Mandarin adalah...", "红", listOf("红 (hóng)", "蓝 (lán)", "黄 (huáng)", "黑 (hēi)"), 0),
                QuizQuestion("Kata penggolong khusus untuk pakaian baju atau jaket adalah...", "件", listOf("件 (jiàn)", "张 (zhāng)", "本 (běn)", "条 (tiáo)"), 0),
                QuizQuestion("Ungkapan untuk menawar 'Murahkan sedikit dong' adalah...", "便宜一点吧", listOf("便宜一点吧", "太贵了吧", "买单了吧", "再见了吧"), 0)
            )
        )

        // ==================== BAB 7: Tempat & Arah (Pages 61-70) ====================
        addStandardChapter(
            startGlobal = 61, num = 7, title = "Tempat & Petunjuk Arah", zh = "地点与方向", icon = "📍",
            goals = listOf("Menanyakan lokasi dengan 在哪儿", "Menyebutkan arah kiri, kanan, depan, belakang", "Menggunakan preposisi 在", "Menanyakan cara menuju suatu tempat (怎么走)"),
            v1Title = "Kata Penunjuk Arah & Posisi",
            v1Words = listOf(
                VocabWord("在", "zài", "di / berada di", "我在家。", "Saya berada di rumah."),
                VocabWord("哪儿 / 哪里", "nǎr / nǎlǐ", "di mana", "你在哪儿？", "Kamu di mana?"),
                VocabWord("这里 / 这儿", "zhèlǐ / zhèr", "di sini", "请来这里坐。", "Silakan duduk di sini."),
                VocabWord("那里 / 那儿", "nàlǐ / nàr", "di sana", "他在那儿看书。", "Dia di sana membaca buku."),
                VocabWord("上面", "shàngmiàn", "atas", "书在桌子上面。", "Buku di atas meja."),
                VocabWord("下面", "xiàmiàn", "bawah", "小猫在椅子下面。", "Kucing kecil di bawah kursi."),
                VocabWord("左边", "zuǒbiān", "sebelah kiri", "银行在左边。", "Bank di sebelah kiri."),
                VocabWord("右边", "yòubiān", "sebelah kanan", "厕所在右边。", "Toilet di sebelah kanan."),
                VocabWord("前面", "qiánmiàn", "depan", "学校在前面。", "Sekolah di depan."),
                VocabWord("后面", "hòumiàn", "belakang", "超市在后面。", "Supermarket di belakang.")
            ),
            v2Title = "Fasilitas & Tempat Umum",
            v2Words = listOf(
                VocabWord("银行", "yínháng", "bank", "中国银行在哪儿？", "Bank of China di mana?"),
                VocabWord("学校", "xuéxiào", "sekolah", "我们的学校很漂亮。", "Sekolah kami sangat indah."),
                VocabWord("医院", "yīyuàn", "rumah sakit", "附近有医院吗？", "Di dekat sini ada rumah sakit?"),
                VocabWord("洗手间 / 厕所", "xǐshǒujiān / cèsuǒ", "toilet / kamar kecil", "请问，洗手间在哪儿？", "Permisi, toilet di mana?"),
                VocabWord("饭馆", "fànguǎn", "restoran", "这家饭馆很有名。", "Restoran ini sangat terkenal."),
                VocabWord("公园", "gōngyuán", "taman", "我们去公园散步吧。", "Ayo kita jalan-jalan ke taman."),
                VocabWord("机场", "jīchǎng", "bandara", "首都国际机场。", "Bandara Internasional Ibukota."),
                VocabWord("车站", "chēzhàn", "stasiun / halte", "地铁车站在哪儿？", "Stasiun MRT di mana?"),
                VocabWord("附近", "fùjìn", "dekat / sekitar", "我家附近有个超市。", "Di dekat rumahku ada supermarket."),
                VocabWord("旁边", "pángbiān", "samping / sebelah", "银行在超市旁边。", "Bank di samping supermarket.")
            ),
            g1Title = "Penggunaan Preposisi 在",
            g1Items = listOf(
                GrammarItem("Subjek + 在 + Tempat", "Subjek + 在 + Tempat + [Aktivitas]", "Menyatakan lokasi keberadaan atau tempat suatu aktivitas berlangsung.", listOf(GrammarExample("我在家吃饭。", "Wǒ zài jiā chīfàn.", "Saya makan di rumah."), GrammarExample("洗手间在哪儿？", "Xǐshǒujiān zài nǎr?", "Toilet ada di sebelah mana?")))
            ),
            g2Title = "Arah & Petunjuk Jalan",
            g2Items = listOf(
                GrammarItem("Menanyakan Arah (怎么走)", "去 + Tempat + 怎么走？", "Digunakan untuk menanyakan rute menuju suatu tempat.", listOf(GrammarExample("去地铁站怎么走？", "Qù dìtiě zhàn zěnme zǒu?", "Bagaimana jalan menuju stasiun MRT?"), GrammarExample("一直往前走，然后向左拐。", "Yìzhí wǎng qián zǒu, ránhòu xiàng zuǒ guǎi.", "Jalan lurus terus ke depan, lalu belok kiri.")))
            ),
            d1Title = "Mencari Toilet di Pusat Belanja", d1Icon = "🚻", d1SceneTitle = "Di Mall", d1SceneDesc = "Menanyakan lokasi fasilitas toilet.",
            d1Lines = listOf(
                DialogLine("A", "请问，洗手间在几楼？", "Qǐngwèn, xǐshǒujiān zài jǐ lóu?", "Permisi, toilet ada di lantai berapa?"),
                DialogLine("B", "在二楼，出电梯往右转就是。", "Zài èr lóu, chū diàntī wǎng yòu zhuǎn jiù shì.", "Di lantai dua, keluar dari lift belok kanan langsung sampai."),
                DialogLine("A", "谢谢您！电梯在哪儿呢？", "Xièxie nín! Diàntī zài nǎr ne?", "Terima kasih! Liftnya ada di mana ya?"),
                DialogLine("B", "直走二十米，左手边就是直梯。", "Zhí zǒu èrshí mǐ, zuǒshǒubiān jiù shì zhítī.", "Lurus 20 meter, di sebelah kiri tangan adalah liftnya.")
            ),
            d2Title = "Menanyakan Jalan ke Bank", d2Icon = "🗺️", d2SceneTitle = "Di Persimpangan Jalan", d2SceneDesc = "Mencari arah ke bank terdekat.",
            d2Lines = listOf(
                DialogLine("A", "师傅，请问中国银行怎么走？", "Shīfu, qǐngwèn Zhōngguó Yínháng zěnme zǒu?", "Pak, permisi bagaimana jalan menuju Bank of China?"),
                DialogLine("B", "一直往前走，过两个红绿灯，然后右转。", "Yìzhí wǎng qián zǒu, guò liǎng ge hónglǜdēng, ránhòu yòu zhuǎn.", "Lurus terus ke depan, lewati 2 lampu merah, lalu belok kanan."),
                DialogLine("A", "离这里远不远？", "Lí zhèlǐ yuǎn bù yuǎn?", "Jauh tidak dari sini?"),
                DialogLine("B", "不远，走路大约五分钟就到了。", "Bù yuǎn, zǒulù dàyuē wǔ fēnzhōng jiù dào le.", "Tidak jauh, jalan kaki sekitar 5 menit sudah sampai.")
            ),
            rdTitle = "Format Penulisan Alamat di China", rdZh = "中国地址的书写规则", rdIcon = "📮",
            rdText = "中国书写地址的逻辑同样遵循\"从大到小\"的原则：先写国家、省份、城市、区县，再写街道门牌号，最后是房间号。这种逻辑体现了东方文化由整体到局部的系统化思维。",
            rdPy = "Zhōngguó shūxiě dìzhǐ de luójí tóngyàng zūnxún \"cóng dà dào xiǎo\" de yuánzé.",
            rdId = "Format penulisan alamat di China mengikuti prinsip 'dari besar ke kecil': Negara → Provinsi → Kota → Distrik → Jalan → Nomor Gedung → Nomor Ruangan.",
            rdNote = "Contoh: 中国北京市朝阳区建国门外大街1号 (No.1 Jianguomenwai St, Chaoyang District, Beijing, China).",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我 [在] 学校。", "洗手间在 [哪儿]？", "一直往前走，然后 [右] 转。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Toilet di mana? → 洗手间在哪儿？", "Bank ada di sebelah kiri → 银行在左边。", "Jalan lurus terus ke depan → 一直往前走。"))
            ),
            quizList = listOf(
                QuizQuestion("Bagaimana menanyakan 'Toilet di mana?' dalam bahasa Mandarin?", "洗手间在哪儿？", listOf("洗手间在哪儿？", "洗手间是什么？", "洗手间多大？", "洗手间贵吗？"), 0),
                QuizQuestion("Arti kata '左边' (zuǒbiān) adalah...", "左边", listOf("Sebelah kiri", "Sebelah kanan", "Bagian depan", "Bagian belakang"), 0),
                QuizQuestion("Arti kata '右边' (yòubiān) adalah...", "右边", listOf("Sebelah kanan", "Sebelah kiri", "Atas", "Bawah"), 0),
                QuizQuestion("Ungkapan '一直走' (yìzhí zǒu) berarti...", "一直走", listOf("Jalan lurus terus", "Belok putar balik", "Berhenti sejenak", "Jalan mundur"), 0),
                QuizQuestion("Kata depan '在' (zài) memiliki arti...", "在", listOf("Di / berada di", "Pergi ke", "Datang dari", "Melihat"), 0)
            )
        )

        // ==================== BAB 8: Transportasi (Pages 71-80) ====================
        addStandardChapter(
            startGlobal = 71, num = 8, title = "Transportasi & Perjalanan", zh = "交通与出行", icon = "🚇",
            goals = listOf("Menyebutkan moda transportasi umum", "Menggunakan kata kerja 坐 (naik/duduk) & 骑 (mengendarai)", "Menanyakan durasi perjalanan dengan 多长时间", "Membeli tiket perjalanan"),
            v1Title = "Moda Transportasi",
            v1Words = listOf(
                VocabWord("坐", "zuò", "naik / duduk (kendaraan)", "我坐地铁去公司。", "Saya naik MRT ke kantor."),
                VocabWord("出租车 / 的士", "chūzūchē / díshì", "taksi", "我们打出租车吧。", "Kita naik taksi yuk."),
                VocabWord("公共汽车 / 公交", "gōnggòng qìchē", "bus umum", "乘公共汽车很便宜。", "Naik bus umum sangat murah."),
                VocabWord("地铁", "dìtiě", "kereta bawah tanah (MRT)", "北京地铁很方便。", "MRT Beijing sangat praktis."),
                VocabWord("火车", "huǒchē", "kereta api", "坐火车去上海。", "Naik kereta api ke Shanghai."),
                VocabWord("高铁", "gāotiě", "kereta cepat (High-Speed Rail)", "高铁速度真快！", "Kecepatan kereta cepat sungguh pesat!"),
                VocabWord("飞机", "fēijī", "pesawat terbang", "我坐飞机去北京。", "Saya naik pesawat ke Beijing."),
                VocabWord("自行车", "zìxíngchē", "sepeda", "共享单车很好用。", "Sepeda sewa bersama sangat mudah dipakai."),
                VocabWord("骑", "qí", "mengendarai (sepeda/motor)", "我骑自行车上学。", "Saya naik sepeda ke sekolah."),
                VocabWord("开", "kāi", "mengemudi (mobil)", "爸爸开车送我。", "Ayah mengemudi mobil mengantarku.")
            ),
            v2Title = "Kosa Kata Perjalanan",
            v2Words = listOf(
                VocabWord("票", "piào", "tiket", "买一张火车票。", "Beli satu lembar tiket kereta."),
                VocabWord("车票 / 机票", "chēpiào / jīpiào", "tiket kereta/bus / tiket pesawat", "往返机票。", "Tiket pesawat pulang-pergi."),
                VocabWord("远", "yuǎn", "jauh", "这里离机场很远。", "Dari sini ke bandara sangat jauh."),
                VocabWord("近", "jìn", "dekat", "学校离我家很近。", "Sekolah sangat dekat dari rumahku."),
                VocabWord("快", "kuài", "cepat", "高铁比普通火车快。", "Kereta cepat lebih cepat dari kereta biasa."),
                VocabWord("慢", "màn", "lambat / pelan", "公共汽车有点慢。", "Bus umum agak lambat."),
                VocabWord("多长时间", "duō cháng shíjiān", "berapa lama waktu", "坐飞机要多长时间？", "Naik pesawat butuh berapa lama?"),
                VocabWord("小时", "xiǎoshí", "jam (durasi)", "大约两个小时。", "Sekitar dua jam."),
                VocabWord("分钟", "fēnzhōng", "menit (durasi)", "十分钟就到了。", "Sepuluh menit sudah sampai."),
                VocabWord("换乘 / 换车", "huànchéng / huànchē", "transit / berganti kendaraan", "在人民广场站换乘一号线。", "Transit ke Line 1 di Stasiun People's Square.")
            ),
            g1Title = "Penggunaan 坐 & 骑 + Transportasi",
            g1Items = listOf(
                GrammarItem("坐 (zuò) + Kendaraan", "Subjek + 坐 + Moda Transportasi + 去 + Tempat", "坐 digunakan untuk kendaraan yang dinaiki dengan cara duduk di dalam (taksi, bus, MRT, pesawat, kereta).", listOf(GrammarExample("我坐地铁去学校。", "Wǒ zuò dìtiě qù xuéxiào.", "Saya naik MRT ke sekolah."), GrammarExample("我们坐飞机去中国。", "Wǒmen zuò fēijī qù Zhōngguó.", "Kami naik pesawat ke China."))),
                GrammarItem("骑 (qí) + Kendaraan", "Subjek + 骑 + Sepeda / Motor + 去 + Tempat", "骑 digunakan untuk kendaraan roda dua yang dinaiki dengan cara mengangkang.", listOf(GrammarExample("他每天骑自行车上班。", "Tā měitiān qí zìxíngchē shàngbān.", "Dia setiap hari mengendarai sepeda ke kantor.")))
            ),
            g2Title = "Menanyakan Durasi Perjalanan",
            g2Items = listOf(
                GrammarItem("要多长时间？ (Berapa lama?)", "Perjalanan + 要多长时间？", "Menanyakan estimasi waktu perjalanan dari suatu tempat ke tempat lain.", listOf(GrammarExample("坐高铁从北京到上海要多长时间？", "Zuò gāotiě cóng Běijīng dào Shànghǎi yào duō cháng shíjiān?", "Naik kereta cepat dari Beijing ke Shanghai butuh berapa lama?"), GrammarExample("大概需要四个半小时。", "Dàgài xūyào sì ge bàn xiǎoshí.", "Kira-kira membutuhkan empat setengah jam.")))
            ),
            d1Title = "Naik Taksi Menuju Bandara", d1Icon = "🚕", d1SceneTitle = "Di Depan Hotel", d1SceneDesc = "Meminta sopir taksi menuju bandara.",
            d1Lines = listOf(
                DialogLine("A", "师傅，您好！我去大兴国际机场。", "Shīfu, nín hǎo! Wǒ qù Dàxīng Guójì Jīchǎng.", "Pak sopir, halo! Saya mau ke Bandara Internasional Daxing."),
                DialogLine("B", "好的，请系好安全带。走高速可以吗？", "Hǎo de, qǐng jì hǎo ānquándài. Zǒu gāosù kěyǐ ma?", "Baik, tolong pasang sabuk pengaman. Lewat jalan tol boleh?"),
                DialogLine("A", "可以。请问路上大约要多长时间？", "Kěyǐ. Qǐngwèn lùshang dàyuē yào duō cháng shíjiān?", "Boleh. Permisi di jalan kira-kira butuh berapa lama?"),
                DialogLine("B", "现在不堵车，大约四十分钟就到。", "Xiànzài bù dǔchē, dàyuē sìshí fēnzhōng jiù dào.", "Sekarang tidak macet, sekitar 40 menit sampai.")
            ),
            d2Title = "Membeli Tiket Kereta Cepat", d2Icon = "🚄", d2SceneTitle = "Loket Stasiun Kereta", d2SceneDesc = "Membeli tiket kereta cepat ke Shanghai.",
            d2Lines = listOf(
                DialogLine("A", "您好，我要买一张明天去上海的高铁二等座票。", "Nín hǎo, wǒ yào mǎi yì zhāng míngtiān qù Shànghǎi de gāotiě èrděngzuò piào.", "Halo, saya mau beli satu tiket kelas 2 kereta cepat ke Shanghai besok."),
                DialogLine("B", "请出示您的护照。您想买上午的还是下午的？", "Qǐng chūshì nín de hùzhào. Nín xiǎng mǎi shàngwǔ de háishi xiàwǔ de?", "Tolong tunjukkan paspor Anda. Mau beli keberangkatan pagi atau siang?"),
                DialogLine("A", "上午十点左右的有吗？", "Shàngwǔ shí diǎn zuǒyòu de yǒu ma?", "Apakah ada sekitar jam 10 pagi?"),
                DialogLine("B", "有G13次，上午十点零五分发车，票价五百五十三元。", "Yǒu G13 cì, shàngwǔ shí diǎn líng wǔ fēn fāchē, piàojià wǔbǎi wǔshísān yuán.", "Ada kereta G13, berangkat pukul 10.05 pagi, harga tiket 553 yuan.")
            ),
            rdTitle = "Jaringan Kereta Cepat Tiongkok", rdZh = "中国高铁的奇迹", rdIcon = "🚄",
            rdText = "中国拥有全球规模最大、运营速度最高的高铁网络，运营里程超过4万公里。乘坐高铁出行安静、平稳、准时、极速，极大改变了人们的城际出行生活方式。",
            rdPy = "Zhōngguó yōngyǒu quánqiú guīmó zuì dà, yùnyíng sùdù zuì gāo de gāotiě wǎngluò.",
            rdId = "China memiliki jaringan kereta cepat (Gaotie) terpanjang di dunia dengan jarak lebih dari 40.000 km. Kereta cepat melaju hingga 350 km/jam dengan sangat stabil.",
            rdNote = "Tiket kereta cepat di China kini terhubung digital dengan paspor/ID card tanpa perlu tiket kertas cetak.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我 [坐] 地铁去。", "去机场要多长 [时间]？", "我要买一 [张] 火车票。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Saya naik MRT → 我坐地铁。", "Kereta cepat sangat pesat → 高铁很快。", "Berapa lama naik pesawat? → 坐飞机要多长时间？"))
            ),
            quizList = listOf(
                QuizQuestion("Moda transportasi '地铁' (dìtiě) berarti...", "地铁", listOf("MRT / Kereta Bawah Tanah", "Bus Umum", "Pesawat Terbang", "Taksi"), 0),
                QuizQuestion("Kata kerja yang tepat untuk 'mengendarai sepeda' adalah...", "骑", listOf("骑 (qí)", "坐 (zuò)", "开 (kāi)", "走 (zǒu)"), 0),
                QuizQuestion("Kalimat '要多长时间？' digunakan untuk menanyakan...", "多长时间", listOf("Berapa lama waktu yang dibutuhkan", "Berapa harga barang", "Berapa banyak orang", "Di mana letak lokasinya"), 0),
                QuizQuestion("Kata penggolong lembar untuk tiket (票 piào) adalah...", "张", listOf("张 (zhāng)", "本 (běn)", "个 (gè)", "支 (zhī)"), 0),
                QuizQuestion("Apa arti kalimat '我到了' (wǒ dào le)?", "我到了", listOf("Saya sudah sampai / tiba", "Saya baru berangkat", "Saya sedang menunggu", "Saya tersesat"), 0)
            )
        )

        // ==================== BAB 9: Cuaca & Musim (Pages 81-90) ====================
        addStandardChapter(
            startGlobal = 81, num = 9, title = "Cuaca & Empat Musim", zh = "天气与季节", icon = "☀️",
            goals = listOf("Menanyakan kondisi cuaca dengan 天气怎么样", "Menyebutkan empat musim di Tiongkok", "Menyatakan suhu udara dan derajat dengan 度", "Menggunakan pola akan segera terjadi 要…了"),
            v1Title = "Kondisi Cuaca",
            v1Words = listOf(
                VocabWord("天气", "tiānqì", "cuaca", "今天天气真好！", "Cuaca hari ini sungguh bagus!"),
                VocabWord("热", "rè", "panas", "夏天非常热。", "Musim panas sangatlah panas."),
                VocabWord("冷", "lěng", "dingin", "今天有点冷。", "Hari ini agak dingin."),
                VocabWord("暖和", "nuǎnhuo", "hangat bersahabat", "春天很暖和。", "Musim semi sangat hangat."),
                VocabWord("凉快", "liángkuai", "sejuk dan nyaman", "秋天很凉快。", "Musim gugur sangat sejuk."),
                VocabWord("下雨", "xià yǔ", "turun hujan", "外面下雨了。", "Di luar turun hujan."),
                VocabWord("下雪", "xià xuě", "turun salju", "北京冬天下大雪。", "Musim dingin Beijing turun salju lebat."),
                VocabWord("刮风", "guā fēng", "bertiup angin kencang", "今天刮大风。", "Hari ini bertiup angin kencang."),
                VocabWord("晴天", "qíngtiān", "hari cerah berawan tipis", "今天是晴天。", "Hari ini cerah berseri."),
                VocabWord("阴天", "yīntiān", "hari mendung", "天空阴沉沉的。", "Langit tampak mendung pekat.")
            ),
            v2Title = "Empat Musim & Perlengkapan",
            v2Words = listOf(
                VocabWord("季节", "jìjié", "musim", "你最喜欢哪个季节？", "Musim apa yang paling kamu sukai?"),
                VocabWord("春天", "chūntiān", "musim semi", "春天万物复苏，百花盛开。", "Musim semi bunga bermekaran."),
                VocabWord("夏天", "xiàtiān", "musim panas", "夏天去海边游泳。", "Musim panas pergi ke pantai berenang."),
                VocabWord("秋天", "qiūtiān", "musim gugur", "北京的秋天最美。", "Musim gugur di Beijing paling indah."),
                VocabWord("冬天", "dōngtiān", "musim dingin", "冬天要穿厚羽绒服。", "Musim dingin harus pakai jaket tebal down."),
                VocabWord("穿", "chuān", "mengenakan / memakai", "今天穿外套。", "Hari ini kenakan jaket."),
                VocabWord("外套 / 羽绒服", "wàitào / yǔróngfú", "jaket / mantel musim dingin", "买一件羽绒服。", "Membeli sebuah jaket mantel."),
                VocabWord("雨伞", "yǔsǎn", "payung", "出门记得带雨伞。", "Keluar rumah ingat bawa payung."),
                VocabWord("度", "dù", "derajat (suhu Celsius)", "最高气温三十度。", "Suhu tertinggi tiga puluh derajat."),
                VocabWord("零下", "líng xià", "di bawah nol (minus)", "零下十度，滴水成冰。", "Minus 10 derajat, air membeku.")
            ),
            g1Title = "Menanyakan Cuaca & Pola 要…了",
            g1Items = listOf(
                GrammarItem("Menanyakan Cuaca", "Hari/Tempat + 天气怎么样？", "Menanyakan kondisi iklim atau prakiraan cuaca.", listOf(GrammarExample("今天天气怎么样？", "Jīntiān tiānqì zěnmeyàng?", "Bagaimana cuaca hari ini?"), GrammarExample("挺暖和的，最高二十度。", "Tǐng nuǎnhuo de, zuìgāo èrshí dù.", "Cukup hangat, tertinggi 20 derajat."))),
                GrammarItem("Pola 要…了 (Akan Segera Terjadi)", "要 + Verba + 了", "Menyatakan perubahan peristiwa yang akan segera terjadi dalam waktu dekat.", listOf(GrammarExample("快走吧，要下雨了！", "Kuài zǒu ba, yào xià yǔ le!", "Ayo cepat jalan, sebentar lagi akan hujan!"), GrammarExample("冬天要来了。", "Dōngtiān yào lái le.", "Musim dingin akan segera tiba.")))
            ),
            g2Title = "Menyatakan Suhu Udara",
            g2Items = listOf(
                GrammarItem("Suhu Udara dan Minus (零下)", "Suhu: Angka + 度 (dù) | Minus: 零下 + Angka + 度", "Format menyatakan temperatur di Tiongkok.", listOf(GrammarExample("今天气温三十五度，真热！", "Jīntiān qìwēn sānshíwǔ dù, zhēn rè!", "Suhu hari ini 35 derajat, panas sekali!"), GrammarExample("哈尔滨冬天零下二十度。", "Hā'ěrbīn dōngtiān líng xià èrshí dù.", "Musim dingin di Harbin minus 20 derajat.")))
            ),
            d1Title = "Hari yang Hujan", d1Icon = "🌧️", d1SceneTitle = "Melihat ke Luar Jendela", d1SceneDesc = "Mempersiapkan diri menghadapi hujan deras.",
            d1Lines = listOf(
                DialogLine("A", "外面乌云密布，是不是要下雨了？", "Wàimiàn wūyún mìbù, shì bu shì yào xià yǔ le?", "Di luar awan gelap tebal, apakah sebentar lagi mau hujan?"),
                DialogLine("B", "天气预报说今天下午有雷阵雨。", "Tiānqì yùbào shuō jīntiān xiàwǔ yǒu léizhènyǔ.", "Prakiraan cuaca bilang siang ini ada hujan petir."),
                DialogLine("A", "幸好我包里带了一把折叠雨伞。", "Xìnghǎo wǒ bāo lǐ dài le yì bǎ zhédié yǔsǎn.", "Untung di dalam tasku bawa payung lipat."),
                DialogLine("B", "雨下得真大，气温也凉快下来了。", "Yǔ xià de zhēn dà, qìwēn yě liángkuai xiàlái le.", "Hujannya deras sekali, suhu udara juga jadi sejuk.")
            ),
            d2Title = "Musim Favorit", d2Icon = "🍂", d2SceneTitle = "Di Halaman Kampus", d2SceneDesc = "Membicarakan keindahan musim gugur.",
            d2Lines = listOf(
                DialogLine("A", "在一年四季中，你最喜欢哪一个？", "Zài yì nián sì jì zhōng, nǐ zuì xǐhuan nǎ yí ge?", "Di antara empat musim dalam setahun, mana yang paling kamu sukai?"),
                DialogLine("B", "我最喜欢秋天，不冷也不热，满地金黄银杏叶。", "Wǒ zuì xǐhuan qiūtiān, bù lěng yě bú rè, mǎn dì jīnhuáng yínxìng yè.", "Saya paling suka musim gugur, tidak dingin dan tidak panas, dedaunan ginkgo keemasan di mana-mana."),
                DialogLine("A", "我也很喜欢秋天，但是冬天看初雪更有诗意。", "Wǒ yě hěn xǐhuan qiūtiān, dànshì dōngtiān kàn chūxuě gèng yǒu shīyì.", "Saya juga suka musim gugur, tapi melihat salju pertama di musim dingin lebih puitis."),
                DialogLine("B", "只要穿得够暖和，冬天其实很美。", "Zhǐyào chuān de gòu nuǎnhuo, dōngtiān qíshí hěn měi.", "Asalkan memakai pakaian cukup hangat, musim dingin sebenarnya sangat indah.")
            ),
            rdTitle = "Keragaman Iklim Utara & Selatan Tiongkok", rdZh = "中国南北气候的巨大差异", rdIcon = "🌸",
            rdText = "中国幅员横跨热带至寒温带。冬季时，南方的海南岛温暖如夏，人们可以在海滩游泳；而北方的黑龙江早已千里冰封、万里雪飘，两地温差可达40摄氏度以上。",
            rdPy = "Zhōngguó fúyuán héngkuà rèdài zhì hánwēndài.",
            rdId = "China terbentang dari zona tropis hingga subarktik. Di musim dingin, pulau Hainan di selatan hangat seperti musim panas, sementara Harbin di utara membeku dengan salju tebal.",
            rdNote = "Rumah di Tiongkok utara dilengkapi pemanas sentral (nuǎnqì), sedangkan di selatan umumnya memakai AC pendingin/penghangat mandiri.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("今天天气很 [好]。","要下 [雨] 了，记得带伞。","我最喜欢 [秋天]，很凉快。")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Bagaimana cuaca hari ini? → 今天天气怎么样？", "Sebentar lagi mau turun hujan → 要下雨了。", "Suhu udara 25 derajat → 气温二十五度。"))
            ),
            quizList = listOf(
                QuizQuestion("Kosa kata '下雪' (xià xuě) memiliki arti...", "下雪", listOf("Turun salju", "Turun hujan", "Bertiup angin", "Matahari terbit"), 0),
                QuizQuestion("Empat musim berurutan dalam bahasa Mandarin adalah...", "春夏秋冬", listOf("春、夏、秋、冬 (Semi, Panas, Gugur, Dingin)", "冬、秋、夏、春", "夏、春、冬、秋", "秋、冬、春、夏"), 0),
                QuizQuestion("Suhu minus 5 derajat Celcius diucapkan sebagai...", "零下五度", listOf("零下五度 (líng xià wǔ dù)", "五度零下", "零五度", "下五度"), 0),
                QuizQuestion("Pola '要下雨了' (yào xià yǔ le) menunjukkan arti...", "要下雨了", listOf("Sebentar lagi akan turun hujan", "Kemarin sudah hujan lebat", "Tidak pernah turun hujan", "Suka melihat hujan"), 0),
                QuizQuestion("Kosa kata '凉快' (liángkuai) memiliki makna...", "凉快", listOf("Sejuk dan nyaman", "Panas menyengat", "Sangat beku", "Hangat bersahabat"), 0)
            )
        )

        // ==================== BAB 10: Hobi (Pages 91-100) ====================
        addStandardChapter(
            startGlobal = 91, num = 10, title = "Hobi & Waktu Luang", zh = "爱好与业余生活", icon = "🎨",
            goals = listOf("Menyebutkan berbagai hobi populer", "Membedakan penggunaan kata kerja modal 会 (bisa/keahlian) & 能 (mampu/kondisi)", "Membuat ajakan santai dengan 我们…吧", "Menggunakan adverbia 一起 (bersama-sama)"),
            v1Title = "Kosa Kata Hobi Kreatif & Rekreasi",
            v1Words = listOf(
                VocabWord("爱好", "àihào", "hobi / kegemaran", "你有什么业余爱好？", "Apa hobi waktu luangmu?"),
                VocabWord("看书", "kàn shū", "membaca buku", "我平时喜欢在书房看书。", "Saya biasanya suka membaca buku di ruang kerja."),
                VocabWord("看电影", "kàn diànyǐng", "menonton film", "周末我们去看电影吧。", "Akhir pekan ayo kita nonton film."),
                VocabWord("听音乐", "tīng yīnyuè", "mendengarkan musik", "听音乐能让我放松。", "Mendengarkan musik membuat saya rileks."),
                VocabWord("唱歌", "chànggē", "bernyanyi / karaoke", "她唱歌非常好听。", "Dia bernyanyi sangat merdu."),
                VocabWord("跳舞", "tiàowǔ", "menari", "妹妹从小学习跳舞。", "Adik perempuan sejak kecil belajar menari."),
                VocabWord("玩游戏", "wán yóuxì", "bermain game", "别总在电脑前玩游戏。", "Jangan selalu main game di depan komputer."),
                VocabWord("拍照 / 摄影", "pāizhào", "memotret / fotografi", "我喜欢旅游和拍照。", "Saya suka jalan-jalan dan fotografi."),
                VocabWord("画画", "huàhuà", "menggambar / melukis", "中国国画很有意境。", "Lukisan tradisional China sarat filosofi."),
                VocabWord("旅游", "lǚyóu", "bepergian / traveling", "去过很多国家旅游。", "Pernah bepergian ke banyak negara.")
            ),
            v2Title = "Olahraga & Kebugaran",
            v2Words = listOf(
                VocabWord("运动", "yùndòng", "olahraga / berolahraga", "每天坚持运动一小时。", "Setiap hari rutin berolahraga satu jam."),
                VocabWord("游泳", "yóuyǒng", "berenang", "夏天我经常去游泳馆。", "Musim panas saya sering ke kolam renang."),
                VocabWord("跑步", "pǎobù", "berlari / jogging", "晨跑呼吸新鲜空气。", "Lari pagi menghirup udara segar."),
                VocabWord("踢足球", "tī zúqiú", "bermain sepak bola", "男孩子们在草地上踢足球。", "Anak-anak laki bermain bola di rumput."),
                VocabWord("打篮球", "dǎ lánqiú", "bermain bola basket", "姚明是著名的篮球明星。", "Yao Ming adalah bintang basket terkenal."),
                VocabWord("打羽毛球", "dǎ yǔmáoqiú", "bermain bulu tangkis", "羽毛球在印尼很受欢迎。", "Bulu tangkis sangat populer di Indonesia."),
                VocabWord("打乒乓球", "dǎ pīngpāngqiú", "bermain tenis meja (pingpong)", "乒乓球是中国的国球。", "Tenis meja adalah olahraga nasional China."),
                VocabWord("爬山", "pá shān", "mendaki gunung", "重阳节有登高爬山的习俗。", "Ada tradisi mendaki gunung saat Chongyang."),
                VocabWord("太极拳", "tàijíquán", "senam Tai Chi", "公园里老人们在打太极拳。", "Di taman para lansia bersenam Tai Chi."),
                VocabWord("瑜伽", "yújiā", "yoga", "练习瑜伽保持身心平和。", "Latihan yoga menjaga kedamaian raga.")
            ),
            g1Title = "Modalitas: Perbedaan 会 & 能",
            g1Items = listOf(
                GrammarItem("会 (huì) — Kemampuan dari Belajar", "Subjek + 会 + Kata Kerja", "Menyatakan keterampilan yang dikuasai melalui proses belajar atau latihan.", listOf(GrammarExample("我会说汉语。", "Wǒ huì shuō Hànyǔ.", "Saya bisa berbicara bahasa Mandarin."), GrammarExample("他会游泳。", "Tā huì yóuyǒng.", "Dia bisa berenang."))),
                GrammarItem("能 (néng) — Kemampuan Berdasarkan Kondisi/Izin", "Subjek + 能 + Kata Kerja", "Menyatakan kesanggupan karena kondisi fisik, waktu, situasi, atau perizinan.", listOf(GrammarExample("我现在能听懂一点儿。", "Wǒ xiànzài néng tīngdǒng yìdiǎnr.", "Saya sekarang mampu mengerti sedikit."), GrammarExample("你明天能来参加聚会吗？", "Nǐ míngtiān néng lái cānjiā jùhuì ma?", "Apakah besok kamu bisa hadir ikut kumpul?")))
            ),
            g2Title = "Ajakan Bersama: 我们…吧 & 一起",
            g2Items = listOf(
                GrammarItem("Ajakan Santai (我们 + 一起 + Verba + 吧)", "我们 + 一起 + Kata Kerja + 吧", "Pola ramah untuk mengajak kawan melakukan kegiatan bersama.", listOf(GrammarExample("我们一起去看电影吧！", "Wǒmen yìqǐ qù kàn diànyǐng ba!", "Ayo kita nonton film bersama-sama!"), GrammarExample("周末我们一起去爬山，好不好？", "Zhōumò wǒmen yìqǐ qù pá shān, hǎo bu hǎo?", "Akhir pekan kita mendaki gunung bareng, bagaimana?")))
            ),
            d1Title = "Bincang Hobi di Akhir Pekan", d1Icon = "🎨", d1SceneTitle = "Di Kafe Kampus", d1SceneDesc = "Membicarakan cara menghabiskan waktu luang.",
            d1Lines = listOf(
                DialogLine("A", "你平时周末都有什么爱好？", "Nǐ píngshí zhōumò dōu yǒu shénme àihào?", "Biasanya di akhir pekan kamu punya hobi apa saja?"),
                DialogLine("B", "我喜欢打羽毛球和摄影，偶尔去电影院。", "Wǒ xǐhuan dǎ yǔmáoqiú hé shèyǐng, ǒu'ěr qù diànyǐngyuàn.", "Saya suka main bulu tangkis dan fotografi, kadang ke bioskop."),
                DialogLine("A", "太巧了！我也特别喜欢打羽毛球。", "Tài qiǎo le! Wǒ yě tèbié xǐhuan dǎ yǔmáoqiú.", "Kebetulan sekali! Saya juga sangat gemar main bulu tangkis."),
                DialogLine("B", "那这周六下午我们一起打一场球吧！", "Nà zhè zhōuliù xiàwǔ wǒmen yìqǐ dǎ yì chǎng qiú ba!", "Kalau begitu Sabtu sore ini ayo kita main bersama satu sesi!")
            ),
            d2Title = "Mendaki Gunung Bersama", d2Icon = "⛰️", d2SceneTitle = "Merencanakan Kegiatan Luar Ruangan", d2SceneDesc = "Mengajak teman mendaki bukit di hari Minggu.",
            d2Lines = listOf(
                DialogLine("A", "星期天你有空吗？你想不想去爬香山？", "Xīngqītiān nǐ yǒu kòng ma? Nǐ xiǎng bu xiǎng qù pá Xiāngshān?", "Hari Minggu apakah kamu senggang? Mau pergi mendaki bukit Xiangshan?"),
                DialogLine("B", "好主意！听说那里的风景非常壮美。", "Hǎo zhǔyi! Tīngshuō nàlǐ de fēngjǐng fēicháng zhuàngměi.", "Ide bagus! Kudengar pemandangan di sana sangat menakjubkan."),
                DialogLine("A", "我们早上七点半在校门口集合出发。", "Wǒmen zǎoshang qī diǎn bàn zài xiàoménkǒu jíhé chūfā.", "Kita kumpul jam 7.30 pagi di gerbang kampus lalu berangkat."),
                DialogLine("B", "好的，我带好相机，不见不散！", "Hǎo de, wǒ dài hǎo xiàngjī, bú jiàn bú sàn!", "Baik, saya siapkan kamera, jangan pergi sebelum ketemu!")
            ),
            rdTitle = "Aktivitas Rekreasi Rakyat di China", rdZh = "中国街头巷尾的休闲文化", rdIcon = "🀄",
            rdText = "在中国城市的公园和社区，你会看到丰富多样的休闲景象：清晨有人在湖畔打太极、练太极剑；树荫下有人下中国象棋或围棋；傍晚的广场上则伴着欢快音乐跳起广场舞。",
            rdPy = "Zài Zhōngguó chéngshì de gōngyuán hé shèqū, nǐ huì kàndào fēngfù duōyàng de xiūxián jǐngxiàng.",
            rdId = "Di taman kota China, suasana rekreasi sangat semarak: pagi hari ada yang berlatih Tai Chi, di bawah pohon asyik bermain catur Tiongkok (Xiangqi), dan sore hari para ibu berkumpul menari tarian lapangan (guǎngchǎng wǔ).",
            rdNote = "Tarian lapangan (广场舞) adalah fenomena sosial populer di mana puluhan orang senam menari bersama di ruang publik.",
            exGroups = listOf(
                ExerciseGroup("A. Lengkapi Kata", listOf("我 [会] 说汉语。", "我们一起去打羽毛球 [吧]！", "你有什么业余 [爱好]？")),
                ExerciseGroup("B. Terjemahkan ke Mandarin", listOf("Apa hobimu? → 你有什么爱好？", "Saya bisa berenang → 我会游泳。", "Ayo kita nonton film bersama → 我们一起去看电影吧。"))
            ),
            quizList = listOf(
                QuizQuestion("Kata kerja modal yang tepat untuk keahlian hasil belajar (misal: berbahasa Mandarin) adalah...", "会", listOf("会 (huì)", "能 (néng)", "可以 (kěyǐ)", "想 (xiǎng)"), 0),
                QuizQuestion("Olahraga '羽毛球' (yǔmáoqiú) berarti...", "羽毛球", listOf("Bulu Tangkis (Badminton)", "Bola Basket", "Sepak Bola", "Tenis Meja"), 0),
                QuizQuestion("Fungsi partikel '吧' (ba) dalam kalimat '我们去看电影吧' adalah...", "吧", listOf("Menyatakan ajakan / saran santai", "Menanyakan pertanyaan tegas", "Menunjukkan penyesalan", "Menyatakan waktu lampau"), 0),
                QuizQuestion("Kata '一起' (yìqǐ) memiliki arti...", "一起", listOf("Bersama-sama", "Sendirian", "Sangat cepat", "Di masa depan"), 0),
                QuizQuestion("Apa arti ungkapan '有空' (yǒu kòng)?", "有空", listOf("Memiliki waktu luang / senggang", "Sedang sangat sibuk", "Tidak ada ruang", "Merasa lelah"), 0)
            )
        )

        return pages
    }
}
