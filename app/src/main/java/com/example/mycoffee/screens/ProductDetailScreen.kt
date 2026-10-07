package com.example.mycoffee.screens

import android.annotation.SuppressLint
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycoffee.R
import com.example.mycoffeeapp.ui.theme.CoffeeBrown
import com.example.mycoffeeapp.ui.theme.IvoryWhite
import com.example.mycoffeeapp.ui.theme.LightBrown

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProductDetailScreen(navController: NavHostController) {

    Scaffold(
        modifier = Modifier.background(color = IvoryWhite),
        topBar = { TopBar() },
        bottomBar = { BottomBar() }
    ) { innerpaddig ->
        MiddleContent(innerpaddig)
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBar() {
    TopAppBar(
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "Detail",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
        }, navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.regular_outline_arrow_left),
                contentDescription = "go back"
            )
        }, actions = {
            Icon(
                painter = painterResource(R.drawable.regular_outline_heart),
                contentDescription = "go back",
            )
        }
    )
}

@Composable
private fun BottomBar() {
    val context = LocalContext.current
    BottomAppBar {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Price",
                    color = Color.DarkGray.copy(alpha = 0.7f),
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "\u20B93.8",
                    color = LightBrown, fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )

            }

            Button(
                modifier = Modifier.width(200.dp),
                onClick = {
                    Toast.makeText(
                        context,"Added to Cart", LENGTH_SHORT).show()
                },
                colors = ButtonDefaults.buttonColors(containerColor = LightBrown),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Add to Cart"
                )

            }
        }
    }
}

@Composable
private fun MiddleContent(innerpaddig: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = IvoryWhite)
            .padding(innerpaddig)
            .padding(horizontal = 15.dp)
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(10.dp)),
            painter = painterResource(R.drawable.coffee_2),
            contentDescription = "coffee",
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Espresso",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.DarkGray
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Ice/Hot",
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                color = Color.DarkGray.copy(alpha = 0.6f)
            )

            Icon(
                modifier = Modifier
                    .size(20.dp),
                painter = painterResource(R.drawable.default_bean),
                contentDescription = "beans",
                tint = CoffeeBrown
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        HorizontalDivider(color = Color.LightGray.copy(alpha = 0.5f))
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Description",
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Strong and Rich..",
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            color = Color.DarkGray.copy(alpha = 0.6f)
        )

        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Size",
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Box(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .weight(1f)
                    .width(80.dp)
                    .height(35.dp), contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "S",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

            }

            Spacer(modifier = Modifier.width(30.dp))

            Box(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .weight(1f)
                    .width(80.dp)
                    .height(35.dp), contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "M",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

            }

            Spacer(modifier = Modifier.width(30.dp))

            Box(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .weight(1f)
                    .width(80.dp)
                    .height(35.dp), contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "L",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

            }

        }

    }

}
