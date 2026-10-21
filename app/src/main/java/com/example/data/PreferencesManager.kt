package com.example.data

import android.content.Context
import android.content.SharedPreferences

class PreferencesManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("mandarin_pasti_bisa_prefs", Context.MODE_PRIVATE)

    var lastPage: Int
        get() = prefs.getInt(KEY_LAST_PAGE, 1).coerceIn(1, 200)
        set(value) = prefs.edit().putInt(KEY_LAST_PAGE, value.coerceIn(1, 200)).apply()

    var isAutoVoiceEnabled: Boolean
        get() = prefs.getBoolean(KEY_AUTO_VOICE, false)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_VOICE, value).apply()

    fun getBookmarks(): Set<Int> {
        val stringSet = prefs.getStringSet(KEY_BOOKMARKS, emptySet()) ?: emptySet()
        return stringSet.mapNotNull { it.toIntOrNull() }.toSet()
    }

    fun toggleBookmark(pageNum: Int): Boolean {
        val current = getBookmarks().toMutableSet()
        val isAdded = if (current.contains(pageNum)) {
            current.remove(pageNum)
            false
        } else {
            current.add(pageNum)
            true
        }
        prefs.edit().putStringSet(KEY_BOOKMARKS, current.map { it.toString() }.toSet()).apply()
        return isAdded
    }

    fun isBookmarked(pageNum: Int): Boolean {
        return getBookmarks().contains(pageNum)
    }

    fun saveQuizScore(chapterNum: Int, score: Int) {
        prefs.edit().putInt("quiz_ch_$chapterNum", score).apply()
    }

    fun getQuizScore(chapterNum: Int): Int {
        return prefs.getInt("quiz_ch_$chapterNum", -1)
    }

    companion object {
        private const val KEY_LAST_PAGE = "key_last_page"
        private const val KEY_AUTO_VOICE = "key_auto_voice"
        private const val KEY_BOOKMARKS = "key_bookmarks"
    }
}
