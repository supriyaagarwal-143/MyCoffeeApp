package com.example.mycoffee

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: Int,
    val title: String,
    val des: String,
    val image: Int,
    val price: Double
)