package com.tarlad.eventsmap.base

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity

@Composable
fun Int.toDp() = with(LocalDensity.current) {
    this@toDp.toDp()
}