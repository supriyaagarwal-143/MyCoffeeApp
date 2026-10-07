package com.example.mycoffee.navigation

sealed class Routes {
    object WelcomeScreen : Routes()
    object ProductScreen : Routes()

    object ProductDetailScreen : Routes()


}