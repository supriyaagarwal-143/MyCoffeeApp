package com.example.mycoffee.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycoffee.screens.ProductDetailScreen
import com.example.mycoffee.screens.WelcomeScreen
import com.example.mycoffee.screens.HomeScreen

@Preview
@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = Routes.WelcomeScreen
    ) {

        composable<Routes.WelcomeScreen> { WelcomeScreen(navController) }
        composable<Routes.ProductDetailScreen> { ProductDetailScreen(navController) }

        composable<Routes.ProductScreen> { HomeScreen(navController) }


    }

}