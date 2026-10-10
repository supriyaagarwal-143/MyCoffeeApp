package com.example.mycoffee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycoffee.CartCard
import com.example.mycoffee.Product
import com.example.mycoffee.R
import com.example.mycoffee.actionbars.BottomNavBar
import com.example.mycoffeeapp.ui.theme.CoffeeBrown
import com.example.mycoffeeapp.ui.theme.LightBrown

@Composable
fun CartScreen(navController: NavHostController) {
    val products = listOf(
        Product(1, "Espresso", "Strong and rich", R.drawable.coffee_2, 3.80),
        Product(2, "Latte", "Smooth and creamy", R.drawable.coffee_3, 4.50),
        Product(3, "Cappuccino", "White chocolate", R.drawable.coffee_1, 4.20),
    )

    var amount = 0.0
    Scaffold(
        topBar = { TopCartBar(navController) },
        bottomBar = { BottomNavBar(navController) }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 16.dp)
        ) {

            item {
                Text(
                    text = "Deliver",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = CoffeeBrown
                )
            }

            item {
                Spacer(modifier = Modifier.height(16.dp))
            }

            items(products.size) { index ->
                amount += products[index].price
                CartCard(products[index])
            }

            item {
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                Text(
                    text = "Payment Summary", fontWeight = FontWeight.Bold, fontSize = 18.sp
                )
                Spacer(
                    modifier = Modifier.height(8.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Price", fontSize = 18.sp
                    )
                    Text(
                        text = "$ $amount", fontSize = 18.sp
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Delivery Fee", fontSize = 18.sp
                    )
                    Text(
                        text = "$ 1.0", fontSize = 18.sp
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                PaymentCard(amount)
            }
        }

    }
}

@Composable
fun PaymentCard(amount: Double) {
    Card(
        modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(R.drawable.mobile_banking),
                    contentDescription = "banking", colorFilter = ColorFilter.tint(LightBrown)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Online",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "$ $amount", color = LightBrown, fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    Icon(modifier = Modifier.size(20.dp),
                        painter = painterResource(R.drawable.regular_outline_arrow_down),
                        contentDescription = "arrow down"
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {
                    //navController.navigate(Routes.HomeScreen)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = LightBrown),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Place Order", fontSize = 18.sp
                )
            }
        }

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopCartBar(navController: NavHostController) {
    TopAppBar(title = {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Order",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
    }, navigationIcon = {
        Icon(
            painter = painterResource(R.drawable.regular_outline_arrow_left),
            contentDescription = "go back",
            modifier = Modifier.clickable(onClick = {
                navController.navigateUp()
            })
        )
    })

}
