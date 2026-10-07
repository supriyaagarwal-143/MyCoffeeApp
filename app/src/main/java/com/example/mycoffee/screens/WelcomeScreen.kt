package com.example.mycoffee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycoffee.R
import com.example.mycoffee.navigation.Routes
import com.example.mycoffeeapp.ui.theme.LightBrown

@Composable
fun WelcomeScreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(R.drawable.image_splash),
            contentDescription = "welcome screen",
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .absolutePadding(left = 24.dp, right = 24.dp, bottom = 70.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = "Fall in Love with Coffee in Blissful Delight!",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Welcome to our cozy coffee corner, where every cup " +
                        "is delight for you",
                color = Color.LightGray,
                fontSize = 14.sp,
                maxLines = 2,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Serif
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = {navController.navigate(Routes.ProductScreen)},
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = LightBrown),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Get Started",
                    fontSize = 18.sp
                )
            }
        }
    }

}