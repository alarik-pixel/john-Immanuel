package com.example.service

import android.content.Context
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import java.util.Locale

class SpeechHelper(context: Context) : TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = TextToSpeech(context.applicationContext, this)
    private var isChineseReady = false
    private var isIndonesianReady = false
    private var isSpeaking = false

    var onSpeakingStateChanged: ((Boolean) -> Unit)? = null

    init {
        tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                isSpeaking = true
                onSpeakingStateChanged?.invoke(true)
            }

            override fun onDone(utteranceId: String?) {
                isSpeaking = false
                onSpeakingStateChanged?.invoke(false)
            }

            @Deprecated("Deprecated in Java")
            override fun onError(utteranceId: String?) {
                isSpeaking = false
                onSpeakingStateChanged?.invoke(false)
            }

            override fun onError(utteranceId: String?, errorCode: Int) {
                isSpeaking = false
                onSpeakingStateChanged?.invoke(false)
            }
        })
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val ttsEngine = tts ?: return

            // Test Chinese locale support
            val zhResult = ttsEngine.setLanguage(Locale.SIMPLIFIED_CHINESE)
            isChineseReady = (zhResult != TextToSpeech.LANG_MISSING_DATA && zhResult != TextToSpeech.LANG_NOT_SUPPORTED)
            if (!isChineseReady) {
                val zhChinaResult = ttsEngine.setLanguage(Locale.CHINA)
                isChineseReady = (zhChinaResult != TextToSpeech.LANG_MISSING_DATA && zhChinaResult != TextToSpeech.LANG_NOT_SUPPORTED)
            }

            // Test Indonesian locale support
            val idLocale = Locale("id", "ID")
            val idResult = ttsEngine.setLanguage(idLocale)
            isIndonesianReady = (idResult != TextToSpeech.LANG_MISSING_DATA && idResult != TextToSpeech.LANG_NOT_SUPPORTED)

            ttsEngine.setPitch(1.0f)
            ttsEngine.setSpeechRate(0.85f) // Optimal speed for learning pronunciation
            Log.d("SpeechHelper", "TTS Initialized. Chinese: $isChineseReady, Indonesian: $isIndonesianReady")
        } else {
            Log.e("SpeechHelper", "TTS Initialization failed: $status")
        }
    }

    fun speak(text: String, isChinese: Boolean = true, rate: Float = 0.85f) {
        val ttsEngine = tts ?: return
        if (text.isBlank()) return

        stop()

        val locale = if (isChinese) {
            Locale.SIMPLIFIED_CHINESE
        } else {
            if (isIndonesianReady) Locale("id", "ID") else Locale.ENGLISH
        }

        try {
            ttsEngine.language = locale
            ttsEngine.setSpeechRate(rate)
            val utteranceId = "mpb_${System.currentTimeMillis()}"
            ttsEngine.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
        } catch (e: Exception) {
            Log.e("SpeechHelper", "Error speaking text", e)
        }
    }

    fun stop() {
        try {
            tts?.stop()
            isSpeaking = false
            onSpeakingStateChanged?.invoke(false)
        } catch (e: Exception) {
            Log.e("SpeechHelper", "Error stopping TTS", e)
        }
    }

    fun destroy() {
        try {
            tts?.stop()
            tts?.shutdown()
            tts = null
        } catch (e: Exception) {
            Log.e("SpeechHelper", "Error shutting down TTS", e)
        }
    }
}
