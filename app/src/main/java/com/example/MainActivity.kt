package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.data.PreferencesManager
import com.example.service.SpeechHelper
import com.example.ui.screens.MainScreen
import com.example.ui.theme.MandarinPastiBisaTheme

class MainActivity : ComponentActivity() {

    private lateinit var speechHelper: SpeechHelper
    private lateinit var preferencesManager: PreferencesManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        speechHelper = SpeechHelper(this)
        preferencesManager = PreferencesManager(this)

        setContent {
            MandarinPastiBisaTheme {
                MainScreen(
                    speechHelper = speechHelper,
                    preferencesManager = preferencesManager
                )
            }
        }
    }

    override fun onStop() {
        super.onStop()
        speechHelper.stop()
    }

    override fun onDestroy() {
        super.onDestroy()
        speechHelper.destroy()
    }
}
