package com.tarlad.eventsmap.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    background = Color.DarkGray,
    onBackground = Color.White,
    surface = Color(0xFF1B1B1B),
    onSurface = Color.White,
    primary = Color(0xFF412F8B),
    onPrimary = Color.White,
    secondary = Color(0xFF7159D5),
            onSecondary = Color.Black,
//        primary = Purple200,
//        primaryVariant = Purple700,
//        secondary = Teal200
)

private val LightColorPalette = lightColors(
//        primary = Purple500,
//        primaryVariant = Purple700,
//        secondary = Teal200

        /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun EventsMapTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors =
//        if (darkTheme) {
        DarkColorPalette
//    } else {
//        LightColorPalette
//    }

    MaterialTheme(
            colors = colors,
            content = content
    )
}
