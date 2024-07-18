package com.example.kayjay.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

// extension function to convert dp to responsive dp
@Composable
fun Dp.w(): Dp {
    val screenWidth = LocalContext.current.resources.displayMetrics.widthPixels
    return this.times(screenWidth / 360f )
}

@Composable
fun Dp.h(): Dp {
    val screenHeight = LocalContext.current.resources.displayMetrics.heightPixels
    return this.times(screenHeight / 640f)
}

// responsive sp
@Composable
fun TextUnit.fSize(): TextUnit {
    val screenWidth = LocalContext.current.resources.displayMetrics.widthPixels
    return this.times(screenWidth / 360f)
}
