package com.example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = ImperialRed,
    onPrimary = Color.White,
    primaryContainer = SoftRed,
    onPrimaryContainer = DarkRed,
    secondary = ImperialGold,
    onSecondary = ChineseInk,
    secondaryContainer = AmberLight,
    onSecondaryContainer = DarkRed,
    tertiary = PorcelainBlue,
    onTertiary = Color.White,
    background = ParchmentCream,
    onBackground = ChineseInk,
    surface = SurfaceCard,
    onSurface = ChineseInk,
    surfaceVariant = CardBackgroundAlt,
    onSurfaceVariant = CharcoalMuted,
    outline = BorderParchment,
    outlineVariant = BorderParchment.copy(alpha = 0.5f)
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFFF6B6B),
    onPrimary = Color(0xFF4A0004),
    primaryContainer = DarkRed,
    onPrimaryContainer = Color(0xFFFFDAD6),
    secondary = ImperialGold,
    onSecondary = Color(0xFF3F2E00),
    secondaryContainer = Color(0xFF5B4300),
    onSecondaryContainer = Color(0xFFFFE088),
    tertiary = Color(0xFF90CAF9),
    onTertiary = Color(0xFF003258),
    background = Color(0xFF141211),
    onBackground = Color(0xFFEDE0D9),
    surface = Color(0xFF1E1A18),
    onSurface = Color(0xFFEDE0D9),
    surfaceVariant = Color(0xFF2B2522),
    onSurfaceVariant = Color(0xFFD4C4BC),
    outline = Color(0xFF504540)
)

@Composable
fun MandarinPastiBisaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
