package com.example.mycoffee.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycoffee.FavCard
import com.example.mycoffee.Product
import com.example.mycoffee.R
import com.example.mycoffee.actionbars.BottomNavBar

//@Preview(showBackground = true, showSystemUi = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FavouriteScreen(navController: NavHostController) {
    var products by remember {
        mutableStateOf(
            listOf(
                Product(1, "Espresso", "Strong and rich", R.drawable.coffee_2, 3.80),
                Product(2, "Latte", "Smooth and creamy", R.drawable.coffee_3, 4.50),
                Product(3, "Cappuccino", "White chocolate", R.drawable.coffee_1, 4.20),
            )
        )
    }

    Scaffold(
        bottomBar = { BottomNavBar(navController) }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {

            item {
                Spacer(modifier = Modifier.height(50.dp))

            }
            item {
                Text(
                    text = "Wishlist",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.DarkGray
                )
                Spacer(modifier = Modifier.height(20.dp))
            }

            items(products.size) { index ->
                FavCard(products[index]) {
                    products = products - products[index]
                }

            }

        }
    }

}