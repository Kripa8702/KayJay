package com.example.kayjay.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kayjay.presentation.screens.cart.CartScreen
import com.example.kayjay.presentation.screens.favourites.FavouritesScreen
import com.example.kayjay.presentation.screens.home.HomeScreen
import com.example.kayjay.presentation.screens.search.SearchScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Home.route
    ) {
        composable(NavRoutes.Home.route) {
            HomeScreen(
                navController = navController
            )
        }
        composable(NavRoutes.Favourites.route) {
            FavouritesScreen(
                navController = navController
            )
        }
        composable(NavRoutes.Search.route) {
            SearchScreen(
                navController = navController
            )
        }
        composable(NavRoutes.Cart.route) {
            CartScreen(
                navController = navController
            )
        }
    }
}
