package com.example.kayjay.utils

import com.example.kayjay.R
import com.example.kayjay.navigation.NavRoutes

sealed class BottomNavigationItem(
    val selectedIconId: Int,
    val unselectedIconId: Int,
    val label: String,
    val route: String? = null
) {
    data object Home : BottomNavigationItem(
        selectedIconId = R.drawable.home_filled,
        unselectedIconId = R.drawable.home_unfilled,
        label = "Home",
        route = NavRoutes.Home.route
    )

    data object Favourites : BottomNavigationItem(
        selectedIconId = R.drawable.heart_filled,
        unselectedIconId = R.drawable.heart_unfilled,
        label = "Favourites",
        route = NavRoutes.Favourites.route
    )

    data object Search : BottomNavigationItem(
        selectedIconId = R.drawable.search,
        unselectedIconId = R.drawable.search,
        label = "Search",
        route = NavRoutes.Search.route
    )

    data object Cart : BottomNavigationItem(
        selectedIconId = R.drawable.cart_filled,
        unselectedIconId = R.drawable.cart_unfilled,
        label = "Cart",
        route = NavRoutes.Cart.route
    )
}