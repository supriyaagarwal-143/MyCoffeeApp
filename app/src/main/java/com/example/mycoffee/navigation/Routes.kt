package com.example.mycoffee.navigation
import kotlinx.serialization.Serializable

sealed class Routes {
    @Serializable
    object WelcomeScreen : Routes()
    @Serializable
    object ProductScreen : Routes()
    @Serializable
    object ProductDetailScreen : Routes()

}