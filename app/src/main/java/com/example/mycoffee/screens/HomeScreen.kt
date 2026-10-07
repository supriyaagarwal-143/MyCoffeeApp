package com.example.mycoffee.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycoffee.CategoryList
import com.example.mycoffee.Product
import com.example.mycoffee.ProductGrid
import com.example.mycoffee.R
import com.example.mycoffee.SearchBar
import com.example.mycoffee.actionbars.BottomNavBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = { BottomNavBar() }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1 / 3f)
                .background(
                    brush = Brush.linearGradient(
                        listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212)
                        )
                    )
                )
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Location",
                color = Color.Gray,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Sector 41, Noida",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.width(2.dp))

                Icon(
                    painter = painterResource(R.drawable.regular_outline_arrow_down),
                    contentDescription = "arrow down",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            SearchBar()

            Spacer(modifier = Modifier.height(40.dp))

            Image(
                painter = painterResource(R.drawable.banner_1),
                contentDescription = "banner"
            )

            Spacer(modifier = Modifier.height(16.dp))

            CategoryList()

            Spacer(modifier = Modifier.height(16.dp))

            val products = listOf(
                Product(1, "Espresso", "Strong and rich", R.drawable.coffee_2, 3.80),
                Product(2, "Latte", "Smooth and creamy", R.drawable.coffee_3, 2.80),
                Product(3, "Cappuccino", "White chocolate", R.drawable.coffee_1, 4.80),
                Product(4, "Mocha", "White cocoa flavour", R.drawable.coffee_4, 5.80),
                Product(5, "Macchiato", "Bold milky", R.drawable.coffee_5, 6.80),
                Product(6, "Flat White", "velvety smooth", R.drawable.coffee_6, 3.80),
                Product(6, "Iced Mocha", "Refreshing and rich", R.drawable.coffee_4, 1.80),
            )

            ProductGrid(products) {
                Text(text ="1")
                Text(text ="2")
            }

        }

    }


}