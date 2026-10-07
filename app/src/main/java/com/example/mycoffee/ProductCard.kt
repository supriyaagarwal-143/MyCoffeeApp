package com.example.mycoffee

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycoffeeapp.ui.theme.CoffeeBrown
import com.example.mycoffeeapp.ui.theme.LightBrown
import com.example.mycoffeeapp.ui.theme.LightGray

@Composable
fun Product(product: Product, modifier: Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth().height(160.dp)
                    .clip(RoundedCornerShape(20.dp))
            ) {
                Image(
                    painter = painterResource(product.image),
                    contentDescription = "coffee 1",
                    contentScale = ContentScale.Crop
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .background(
                            color = LightGray.copy(0.8f),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Icon(
                        modifier = Modifier
                            .size(16.dp),
                        painter = painterResource(R.drawable.regular_outline_heart),
                        contentDescription = "fav",
                        tint = LightBrown
                    )
                }


            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = product.title,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(5.dp))


            Text(
                text = product.des,
                color = Color.DarkGray,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "\u20B9${product.price}",
                    color = CoffeeBrown,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp
                )

                Button(
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = CoffeeBrown),
                    shape = RoundedCornerShape(10.dp),
                    onClick = {}) {
                    Text(
                        text = "+",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }


    }


}