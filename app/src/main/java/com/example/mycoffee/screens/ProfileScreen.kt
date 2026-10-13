package com.example.mycoffee.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.PersonOutline
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycoffee.actionbars.BottomNavBar
import com.example.mycoffeeapp.ui.theme.LightBrown

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavHostController) {
    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(
                    text = "Profile", fontWeight = FontWeight.Bold
                )
            }
        )
    }, bottomBar = {
        BottomNavBar(navController)
    }) { innerpadding ->

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerpadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .size(100.dp)
                    .background(color = LightBrown.copy(alpha = 0.2f), shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier.size(50.dp),
                    imageVector = Icons.Default.PersonOutline,
                    contentDescription = "Profile", tint = LightBrown
                )
            }

            Text(
                text = "Supriya Agarwal", fontWeight = FontWeight.Bold, fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "sagarwal@gmail.com", fontWeight = FontWeight.SemiBold, color = Color.Gray
            )

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
            ) {
                Column() {
                    Text(
                        text = "Address", fontWeight = FontWeight.Bold, fontSize = 18.sp,
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "C-83, Block C" + "\n" +
                                "Sector 41, Noida " + "\n" +
                                "Uttar Pradesh - 201301",
                        fontWeight = FontWeight.SemiBold, color = Color.Gray,
                        fontSize = 16.sp
                    )
                }

            }
            Spacer(modifier = Modifier.height(50.dp))

            ProfileCard()


        }


    }

}

@Composable
fun ProfileCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 25.dp)
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "Cart", tint = LightBrown
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Orders",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color = Color.DarkGray
                )

            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Cart", tint = LightBrown
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Favorites",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color = Color.DarkGray
                )

            }
        }
    }

}