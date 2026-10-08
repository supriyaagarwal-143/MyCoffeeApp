package com.example.mycoffee.navigation
import com.example.mycoffee.Product
import kotlinx.serialization.Serializable

sealed class Routes {
    @Serializable
    object WelcomeScreen : Routes()
    @Serializable
    object HomeScreen : Routes()
    @Serializable
    data class ProductDetailScreen(val product: Product) : Routes()

}