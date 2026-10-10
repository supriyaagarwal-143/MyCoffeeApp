package com.example.mycoffee.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.mycoffee.Product
import com.example.mycoffee.ProductType
import com.example.mycoffee.screens.CartScreen
import com.example.mycoffee.screens.ProductDetailScreen
import com.example.mycoffee.screens.WelcomeScreen
import com.example.mycoffee.screens.HomeScreen
import kotlin.reflect.typeOf

@Preview
@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = Routes.WelcomeScreen
    ) {

        composable<Routes.WelcomeScreen> { WelcomeScreen(navController) }
        composable<Routes.ProductDetailScreen>(
            typeMap = mapOf(typeOf<Product>() to ProductType) // This fixes the empty typeMap {} error
        ) { backStackEntry ->
            val args = backStackEntry.toRoute<Routes.ProductDetailScreen>()
            ProductDetailScreen(navController, args.product)
        }

        composable<Routes.HomeScreen> {
            HomeScreen(navController)
        }

        composable<Routes.CartScreen> {
            CartScreen(navController)
        }

    }

}