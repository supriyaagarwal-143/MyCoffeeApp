package com.example.mycoffee
import android.net.Uri
import android.os.Bundle
import androidx.navigation.NavType
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

val ProductType = object: NavType<Product>(isNullableAllowed = false) {
    override fun get(bundle: Bundle, key: String): Product? {
        return bundle.getString(key)?.let { Json.decodeFromString(it) }
    }

    override fun parseValue(value: String): Product {
        return Json.decodeFromString(Uri.decode(value))
    }

    override fun serializeAsValue(value: Product): String {
        return Uri.encode(Json.encodeToString(value))
    }

    override fun put(bundle: Bundle, key: String, value: Product) {
        bundle.putString(key, Json.encodeToString(value))
    }
}