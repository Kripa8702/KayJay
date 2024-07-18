package com.example.kayjay.utils

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import com.example.kayjay.R
import com.example.kayjay.navigation.NavRoutes

sealed class BottomNavigationItem(
    val id: Int,
    val label: String,
    val route: String? = null
) {
    object Home : BottomNavigationItem(
        id = R.drawable.heart_unfilled,
        label = "Home",
        route = NavRoutes.Home.route
    )
}