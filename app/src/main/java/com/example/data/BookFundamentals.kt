package com.example.data

object BookFundamentals {
    const val AUTHOR = "Capt.John I.P, SH, S.Si.T, M.Mar"
    const val APP_TAGLINE = "Belajar Bahasa China, Mahir oleh Siapa Pun"

    val INITIALS = listOf(
        PinyinItem("b", "爸 bà (ayah)"),
        PinyinItem("p", "怕 pà (takut)"),
        PinyinItem("m", "妈 mā (ibu)"),
        PinyinItem("f", "飞 fēi (terbang)"),
        PinyinItem("d", "大 dà (besar)"),
        PinyinItem("t", "他 tā (dia)"),
        PinyinItem("n", "你 nǐ (kamu)"),
        PinyinItem("l", "来 lái (datang)"),
        PinyinItem("g", "高 gāo (tinggi)"),
        PinyinItem("k", "看 kàn (melihat)"),
        PinyinItem("h", "好 hǎo (baik)"),
        PinyinItem("j", "家 jiā (rumah)"),
        PinyinItem("q", "七 qī (tujuh)"),
        PinyinItem("x", "西 xī (barat)"),
        PinyinItem("zh", "中 zhōng (tengah)"),
        PinyinItem("ch", "吃 chī (makan)"),
        PinyinItem("sh", "是 shì (adalah)"),
        PinyinItem("r", "人 rén (orang)"),
        PinyinItem("z", "再 zài (lagi)"),
        PinyinItem("c", "菜 cài (sayur)"),
        PinyinItem("s", "三 sān (tiga)")
    )

    val FINALS = listOf(
        PinyinItem("a", "妈 mā"),
        PinyinItem("o", "我 wǒ"),
        PinyinItem("e", "喝 hē"),
        PinyinItem("i", "你 nǐ"),
        PinyinItem("u", "五 wǔ"),
        PinyinItem("ü", "女 nǚ"),
        PinyinItem("ai", "爱 ài"),
        PinyinItem("ei", "妹 mèi"),
        PinyinItem("ao", "好 hǎo"),
        PinyinItem("ou", "都 dōu"),
        PinyinItem("an", "三 sān"),
        PinyinItem("en", "很 hěn"),
        PinyinItem("ang", "忙 máng"),
        PinyinItem("eng", "冷 lěng"),
        PinyinItem("ong", "中 zhōng"),
        PinyinItem("ia", "家 jiā"),
        PinyinItem("ie", "谢 xiè"),
        PinyinItem("iao", "小 xiǎo"),
        PinyinItem("iu", "六 liù"),
        PinyinItem("ian", "天 tiān"),
        PinyinItem("in", "心 xīn"),
        PinyinItem("iang", "想 xiǎng"),
        PinyinItem("ing", "英 yīng"),
        PinyinItem("ua", "花 huā"),
        PinyinItem("uo", "说 shuō"),
        PinyinItem("uai", "快 kuài"),
        PinyinItem("ui", "水 shuǐ"),
        PinyinItem("uan", "关 guān"),
        PinyinItem("un", "云 yún"),
        PinyinItem("uang", "黄 huáng"),
        PinyinItem("üe", "月 yuè")
    )

    val TONES = listOf(
        ToneItem("ā", "Nada 1", "Datar tinggi (5-5)", "妈", "mā", "ibu"),
        ToneItem("á", "Nada 2", "Naik (3-5)", "麻", "má", "rami/kebas"),
        ToneItem("ǎ", "Nada 3", "Turun lalu naik (2-1-4)", "马", "mǎ", "kuda"),
        ToneItem("à", "Nada 4", "Turun tajam (5-1)", "骂", "mà", "memaki"),
        ToneItem("a", "Nada Netral", "Ringan & pendek (0)", "吗", "ma", "apakah (tanya)")
    )

    val RADICALS = listOf(
        RadicalItem("人/亻", "rén", "orang", "你 他 住 作"),
        RadicalItem("口", "kǒu", "mulut", "吃 喝 叫 问"),
        RadicalItem("手/扌", "shǒu", "tangan", "打 找 拿 抱"),
        RadicalItem("心/忄", "xīn", "hati/perasaan", "想 快 怕 懂"),
        RadicalItem("水/氵", "shuǐ", "air/cairan", "河 海 洗 没"),
        RadicalItem("火/灬", "huǒ", "api/panas", "热 点 烧 烤"),
        RadicalItem("木", "mù", "kayu/pohon", "树 桌 椅 校"),
        RadicalItem("日", "rì", "matahari/waktu", "明 早 晴 时"),
        RadicalItem("月", "yuè", "bulan/organ", "朋 服 脸 胖"),
        RadicalItem("女", "nǚ", "perempuan", "妈 姐 妹 好"),
        RadicalItem("子", "zǐ", "anak", "孩 学 字 存"),
        RadicalItem("宀", "mián", "atap/rumah", "家 安 字 室"),
        RadicalItem("讠/言", "yán", "ucapan/bahasa", "说 话 语 读"),
        RadicalItem("钅/金", "jīn", "logam/uang", "钱 银 铜 铁"),
        RadicalItem("艹", "cǎo", "tanaman/herba", "花 茶 菜 草"),
        RadicalItem("纟/糸", "sī", "benang/tekstil", "红 纸 经 练"),
        RadicalItem("食/饣", "shí", "makanan", "饭 饱 饿 饼"),
        RadicalItem("目", "mù", "mata/penglihatan", "看 眼 睛 睡"),
        RadicalItem("辶", "chuò", "berjalan/gerak", "进 边 远 近"),
        RadicalItem("门", "mén", "pintu/gerbang", "问 间 闹 闭")
    )

    val STROKE_RULES = listOf(
        StrokeRule(1, "Dari Atas ke Bawah", "Goresan selalu dimulai dari bagian paling atas karakter.", "三 (sān)"),
        StrokeRule(2, "Dari Kiri ke Kanan", "Karakter yang memiliki sisi kiri dan kanan ditulis dari kiri.", "你 (nǐ)"),
        StrokeRule(3, "Garis Horizontal Dulu Baru Vertikal", "Garis mendatar (横 héng) ditarik sebelum garis tegak (竖 shù).", "十 (shí)"),
        StrokeRule(4, "Luar ke Dalam", "Goresan bingkai luar ditarik sebelum bagian dalam diisi.", "月 (yuè)"),
        StrokeRule(5, "Tengah Dulu Baru Samping", "Untuk karakter simetris, bagian tengah dikerjakan terlebih dahulu.", "小 (xiǎo)"),
        StrokeRule(6, "Titik Terakhir atau Awal", "Titik di atas/kiri dibuat di awal; titik di dalam/kanan dibuat di akhir.", "国 / 心"),
        StrokeRule(7, "Tutup Kerangka di Paling Akhir", "Bingkai bagian bawah ditutup setelah seluruh isi dalam selesai.", "日 / 回")
    )

    val STROKE_CHARS = listOf(
        StrokeChar("一", "yī", "satu"),
        StrokeChar("二", "èr", "dua"),
        StrokeChar("三", "sān", "tiga"),
        StrokeChar("人", "rén", "orang"),
        StrokeChar("大", "dà", "besar"),
        StrokeChar("小", "xiǎo", "kecil"),
        StrokeChar("中", "zhōng", "tengah"),
        StrokeChar("你", "nǐ", "kamu"),
        StrokeChar("好", "hǎo", "baik"),
        StrokeChar("我", "wǒ", "saya"),
        StrokeChar("日", "rì", "matahari"),
        StrokeChar("月", "yuè", "bulan")
    )
}
