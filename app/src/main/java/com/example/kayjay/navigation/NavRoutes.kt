package com.example.kayjay.navigation

enum class Routes{
    Home,
}

sealed class NavRoutes(val route: String) {
    data object Home : NavRoutes(route = Routes.Home.name)
}