package com.example.mycoffee.actionbars

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.NavOptionsBuilder
import com.example.mycoffee.R
import com.example.mycoffee.navigation.Routes
import com.example.mycoffeeapp.ui.theme.LightBrown

@Composable
fun BottomNavBar(navController: NavHostController) {
    val navItemsList = listOf<NavItems>(
        NavItems("Home", R.drawable.regular_outline_home, Routes.HomeScreen),
        NavItems("Cart", R.drawable.regular_outline_bag, Routes.CartScreen),
        NavItems("Favourites", R.drawable.regular_outline_heart, Routes.HomeScreen),
        NavItems("Profile", R.drawable.outline_account_circle_24, Routes.HomeScreen)
    )

    NavigationBar (containerColor = Color.White){
        navItemsList.forEach { item ->
            NavigationBarItem(
                selected = false,
                label = {
                    Text(
                        text = item.title, color = LightBrown
                    )
                },
                icon = {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(
                            item.iconId),
                        contentDescription = item.title,
                        tint = LightBrown
                        )
                },
                onClick = {
                    navController.navigate(item.route)
                },
            )
        }

    }


}

data class NavItems(val title: String, val iconId: Int, val route: Routes)