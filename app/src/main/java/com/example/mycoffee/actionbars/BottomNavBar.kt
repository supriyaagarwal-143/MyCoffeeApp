package com.example.mycoffee.actionbars

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycoffee.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomNavBar() {
    val navItemsList = listOf<NavItems>(
        NavItems("Home", R.drawable.regular_outline_home),
        NavItems("Search", R.drawable.regular_outline_search),
        NavItems("Favourites", R.drawable.regular_outline_heart),
        NavItems("Profile", R.drawable.outline_account_circle_24)
    )

    NavigationBar {
        navItemsList.forEach { item ->
            NavigationBarItem(
                selected = true,
                icon = {
                    Icon(
                        painter = painterResource(
                            item.iconId),
                        contentDescription = item.title,
                        )
                },
                onClick = { },
            )
        }

    }


}

data class NavItems(val title: String, val iconId: Int)