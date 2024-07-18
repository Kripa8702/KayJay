package com.example.kayjay.navigation

enum class Routes{
    HOME,
    FAVOURITES,
    SEARCH,
    CART
}

sealed class NavRoutes(val route: String) {
    data object Home : NavRoutes(route = Routes.HOME.name)
    data object Favourites : NavRoutes(route = Routes.FAVOURITES.name)
    data object Search : NavRoutes(route = Routes.SEARCH.name)
    data object Cart : NavRoutes(route = Routes.CART.name)
}