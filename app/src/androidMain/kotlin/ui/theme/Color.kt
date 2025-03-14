package ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


val colorLight = lightColorScheme(
    primary = Color.Black,
    onPrimary = Color.White,
    secondary = Color.White,
    onSecondary = Color.Black,
    tertiary = Color.Gray,
    onTertiary = Color.White,
    background = Color.White,
    onBackground = Color.Gray,
    surface = Color.White
)

val colorDark = darkColorScheme(
    primary = Color(0xFF25262B),
    onPrimary = Color.White,
    secondary = Color(0xFF393A3F),
    onSecondary = Color.White,
    tertiary = Color(0xFF393A3F),
    onTertiary = Color.White,
    background = Color(0xFF1A1C20),
    onBackground = Color(0xFF767171),
    surface = Color(0xFF1A1C20)
)

abstract class AppColorSet {
    abstract val lightShadow: Color
    abstract val darkShadow : Color
    abstract val brightPanelForeground: Color
    abstract val brightPanelBackground: Color
    abstract val listSelectionButtonForeground: Color
    abstract val listSelectionButtonBackground: Color

    companion object {
        val isLight
            @Composable get() = !isSystemInDarkTheme()

        val currentColorScheme
            @Composable get() = MaterialTheme.colorScheme

        val currentAppColorSet
            @Composable get() = if (isLight) LightColorSet else DarkColorSet
    }
}

object LightColorSet: AppColorSet() {
    override val lightShadow = Color(0x60E0E3F3)
    override val darkShadow = Color(0xF0CBD3ED)
    override val brightPanelForeground = Color.White
    override val brightPanelBackground = colorLight.onPrimary
    override val listSelectionButtonForeground = colorLight.onPrimary
    override val listSelectionButtonBackground = Color(0xFFEDF3FD)
}

object DarkColorSet: AppColorSet() {
    override val lightShadow = Color(0x60494949)
    override val darkShadow = Color(0xD0000000)
    override val brightPanelForeground = Color.White
    override val brightPanelBackground = colorDark.primary
    override val listSelectionButtonForeground = colorDark.onSecondary
    override val listSelectionButtonBackground = colorDark.secondary
}

val appColorSet
    @Composable get() = AppColorSet.currentAppColorSet
