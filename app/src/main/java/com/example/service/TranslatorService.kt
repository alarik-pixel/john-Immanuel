package com.example.service

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.net.URLEncoder
import java.util.concurrent.TimeUnit

data class TranslationResult(
    val chinese: String,
    val pinyin: String,
    val indonesian: String,
    val provider: String
)

object TranslatorService {

    private val client = OkHttpClient.Builder()
        .connectTimeout(8, TimeUnit.SECONDS)
        .readTimeout(8, TimeUnit.SECONDS)
        .build()

    // Offline quick phrasebook for instantaneous offline translation
    private val offlinePhrases = mapOf(
        // Indonesian to Chinese
        "halo" to Pair("你好", "nǐ hǎo"),
        "hai" to Pair("你好", "nǐ hǎo"),
        "apa kabar" to Pair("你好吗？", "nǐ hǎo ma?"),
        "apa kabarmu" to Pair("你好吗？", "nǐ hǎo ma?"),
        "terima kasih" to Pair("谢谢", "xièxie"),
        "terima kasih banyak" to Pair("非常感谢", "fēicháng gǎnxiè"),
        "sama sama" to Pair("不客气", "bú kèqi"),
        "sama-sama" to Pair("不客气", "bú kèqi"),
        "maaf" to Pair("对不起", "duìbuqǐ"),
        "tidak apa apa" to Pair("没关系", "méi guānxi"),
        "tidak apa-apa" to Pair("没关系", "méi guānxi"),
        "selamat pagi" to Pair("早上好", "zǎoshang hǎo"),
        "selamat siang" to Pair("下午好", "xiàwǔ hǎo"),
        "selamat malam" to Pair("晚上好", "wǎnshang hǎo"),
        "selamat tidur" to Pair("晚安", "wǎn ān"),
        "sampai jumpa" to Pair("再见", "zàijiàn"),
        "siapa namamu" to Pair("你叫什么名字？", "nǐ jiào shénme míngzi?"),
        "nama saya" to Pair("我叫", "wǒ jiào"),
        "saya orang indonesia" to Pair("我是印度尼西亚人。", "wǒ shì Yìndùníxīyà rén."),
        "saya dari indonesia" to Pair("我来自印度尼西亚。", "wǒ láizì Yìndùníxīyà."),
        "senang berkenalan denganmu" to Pair("很高兴认识你。", "hěn gāoxìng rènshi nǐ."),
        "berapa harganya" to Pair("多少钱？", "duōshao qián?"),
        "ini berapa" to Pair("这个多少钱？", "zhège duōshao qián?"),
        "terlalu mahal" to Pair("太贵了！", "tài guì le!"),
        "murahkan sedikit" to Pair("便宜一点吧。", "piányi yìdiǎn ba."),
        "bisa diskon" to Pair("可以打折吗？", "kěyǐ dǎzhé ma?"),
        "toilet di mana" to Pair("洗手间在哪儿？", "xǐshǒujiān zài nǎr?"),
        "di mana toilet" to Pair("洗手间在哪儿？", "xǐshǒujiān zài nǎr?"),
        "saya mau makan" to Pair("我想吃", "wǒ xiǎng chī"),
        "saya mau minum" to Pair("我想喝", "wǒ xiǎng hē"),
        "pelayan minta bon" to Pair("服务员，买单！", "fúwùyuán, mǎidān!"),
        "minta air putih" to Pair("请给我一杯水。", "qǐng gěi wǒ yì bēi shuǐ."),
        "saya tidak bisa bahasa mandarin" to Pair("我不会说中文。", "wǒ bú huì shuō Zhōngwén."),
        "apakah kamu bisa bahasa inggris" to Pair("你会说英语吗？", "nǐ huì shuō Yīngyǔ ma?"),
        "tolong bantu saya" to Pair("请帮帮我。", "qǐng bāngbang wǒ."),
        "stasiun di mana" to Pair("车站在哪儿？", "chēzhàn zài nǎr?"),
        "bandara di mana" to Pair("机场在哪儿？", "jīchǎng zài nǎr?"),
        "saya mau ke bandara" to Pair("我要去机场。", "wǒ yào qù jīchǎng."),
        "berapa lama" to Pair("要多长时间？", "yào duō cháng shíjiān?"),
        "selamat tahun baru" to Pair("新年快乐！", "xīnnián kuàilè!"),
        "semoga sukses" to Pair("祝你成功！", "zhù nǐ chénggōng!"),
        "semangat" to Pair("加油！", "jiāyóu!"),
        "saya suka ini" to Pair("我喜欢这个。", "wǒ xǐhuan zhège."),
        "saya tidak suka" to Pair("我不喜欢。", "wǒ bù xǐhuan."),
        "saya lapar" to Pair("我饿了。", "wǒ è le."),
        "saya haus" to Pair("我渴了。", "wǒ kě le."),
        "saya lelah" to Pair("我很累。", "wǒ hěn lèi.")
    )

    // Reverse map for Chinese to Indonesian
    private val offlineChinese = mapOf(
        "你好" to Pair("Halo", "nǐ hǎo"),
        "你好吗" to Pair("Apa kabarmu?", "nǐ hǎo ma"),
        "谢谢" to Pair("Terima kasih", "xièxie"),
        "不客气" to Pair("Sama-sama", "bú kèqi"),
        "对不起" to Pair("Maaf", "duìbuqǐ"),
        "没关系" to Pair("Tidak apa-apa", "méi guānxi"),
        "再见" to Pair("Sampai jumpa", "zàijiàn"),
        "多少钱" to Pair("Berapa harganya?", "duōshao qián"),
        "太贵了" to Pair("Terlalu mahal!", "tài guì le"),
        "便宜一点" to Pair("Murahkan sedikit", "piányi yìdiǎn"),
        "洗手间在哪儿" to Pair("Toilet di mana?", "xǐshǒujiān zài nǎr"),
        "买单" to Pair("Bayar / minta bon", "mǎidān"),
        "新年快乐" to Pair("Selamat Tahun Baru!", "xīnnián kuàilè"),
        "加油" to Pair("Semangat!", "jiāyóu"),
        "我爱你" to Pair("Saya cinta kamu", "wǒ ài nǐ"),
        "好吃" to Pair("Enak / lezat", "hǎochī")
    )

    suspend fun translate(
        query: String,
        isIndonesianToChinese: Boolean
    ): Result<TranslationResult> = withContext(Dispatchers.IO) {
        val cleanQuery = query.trim()
        if (cleanQuery.isEmpty()) {
            return@withContext Result.failure(IllegalArgumentException("Teks input tidak boleh kosong"))
        }

        val norm = cleanQuery.lowercase().replace(Regex("[?!.,]"), "").trim()

        // 1. Try offline phrasebook first
        if (isIndonesianToChinese) {
            offlinePhrases[norm]?.let { (zh, py) ->
                return@withContext Result.success(
                    TranslationResult(
                        chinese = zh,
                        pinyin = py,
                        indonesian = cleanQuery,
                        provider = "Kamus Cepat (Offline)"
                    )
                )
            }
        } else {
            offlineChinese[norm]?.let { (id, py) ->
                return@withContext Result.success(
                    TranslationResult(
                        chinese = cleanQuery,
                        pinyin = py,
                        indonesian = id,
                        provider = "Kamus Cepat (Offline)"
                    )
                )
            }
        }

        // 2. Try Online Translation API (MyMemory / Lingva)
        try {
            val langPair = if (isIndonesianToChinese) "id|zh-CN" else "zh-CN|id"
            val encodedQuery = URLEncoder.encode(cleanQuery, "UTF-8")
            val url = "https://api.mymemory.translated.net/get?q=$encodedQuery&langpair=$langPair"

            val request = Request.Builder()
                .url(url)
                .header("User-Agent", "MandarinPastiBisaAndroid/1.0")
                .build()

            val response = client.newCall(request).execute()
            if (response.isSuccessful) {
                val body = response.body?.string() ?: ""
                val json = JSONObject(body)
                val responseData = json.optJSONObject("responseData")
                val translatedText = responseData?.optString("translatedText") ?: ""

                if (translatedText.isNotEmpty() && !translatedText.contains("MYMEMORY WARNING")) {
                    val (zh, id) = if (isIndonesianToChinese) {
                        Pair(translatedText, cleanQuery)
                    } else {
                        Pair(cleanQuery, translatedText)
                    }

                    // Heuristic pinyin generation for common characters
                    val pinyin = estimatePinyin(zh)

                    return@withContext Result.success(
                        TranslationResult(
                            chinese = zh,
                            pinyin = pinyin,
                            indonesian = id,
                            provider = "Cloud Translator"
                        )
                    )
                }
            }
        } catch (e: Exception) {
            // Fallthrough to fallback message
        }

        // 3. Fallback when network is unavailable
        val fallbackResult = if (isIndonesianToChinese) {
            TranslationResult(
                chinese = "无法连接翻译服务",
                pinyin = "wúfǎ liánjiē fānyì fúwù",
                indonesian = "$cleanQuery (Periksa koneksi internet untuk kalimat panjang)",
                provider = "Mode Offline"
            )
        } else {
            TranslationResult(
                chinese = cleanQuery,
                pinyin = estimatePinyin(cleanQuery),
                indonesian = "(Silakan sambungkan koneksi internet)",
                provider = "Mode Offline"
            )
        }
        Result.success(fallbackResult)
    }

    private fun estimatePinyin(chinese: String): String {
        val pinyinMap = mapOf(
            '你' to "nǐ", '好' to "hǎo", '我' to "wǒ", '是' to "shì", '的' to "de",
            '谢' to "xiè", '在' to "zài", '吃' to "chī", '饭' to "fàn", '喝' to "hē",
            '水' to "shuǐ", '茶' to "chá", '买' to "mǎi", '卖' to "mài", '多' to "duō",
            '少' to "shao", '钱' to "qián", '贵' to "guì", '便' to "pián", '宜' to "yi",
            '洗' to "xǐ", '手' to "shǒu", '间' to "jiān", '这' to "zhè", '那' to "nà",
            '中' to "zhōng", '国' to "guó", '人' to "rén", '大' to "dà", '小' to "xiǎo",
            '去' to "qù", '来' to "lái", '走' to "zǒu", '天' to "tiān", '气' to "qì",
            '冷' to "lěng", '热' to "rè", '雨' to "yǔ", '学' to "xué", '生' to "sheng",
            '老' to "lǎo", '师' to "shī", '朋' to "péng", '友' to "you", '家' to "jiā",
            '年' to "nián", '月' to "yuè", '日' to "rì", '时' to "shí", '分' to "fēn"
        )
        val sb = StringBuilder()
        for (char in chinese) {
            val py = pinyinMap[char]
            if (py != null) {
                if (sb.isNotEmpty()) sb.append(" ")
                sb.append(py)
            } else if (char.isLetterOrDigit()) {
                sb.append(char)
            }
        }
        return sb.toString()
    }
}
