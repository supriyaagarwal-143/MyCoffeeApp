package com.example.mycoffee

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycoffeeapp.ui.theme.CoffeeBrown
import com.example.mycoffeeapp.ui.theme.LightBrown
import com.example.mycoffeeapp.ui.theme.LightGray

@Composable
fun CartCard(product: Product) {
    var value by remember { mutableIntStateOf(0) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = LightGray),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(10.dp)),
                painter = painterResource(product.image),
                contentDescription = "coffee1"
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = product.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text(
                    text = product.des,
                    color = Color.DarkGray
                )
            }



          Row(verticalAlignment = Alignment.CenterVertically,
              horizontalArrangement = Arrangement.spacedBy(6.dp)) {
              IconButton(
                  modifier = Modifier
                      .background(color = LightBrown.copy(alpha = 0.1f), shape = CircleShape)
                      .size(24.dp),
                  onClick = { value++ },
                  enabled = true
              ) {
                  Icon(
                      imageVector = Icons.Default.Add,
                      contentDescription = "Add", tint = CoffeeBrown
                  )
              }

              Text(
                  text = "$value",
                  fontSize = 20.sp,
                  fontWeight = FontWeight.SemiBold
              )
              IconButton(
                  modifier = Modifier.background(color = LightBrown.copy(alpha = 0.1f), CircleShape)
                      .size(24.dp),
                  onClick = { value-- },
                  enabled = value > 0,
              ) {
                  Icon(
                      imageVector = Icons.Default.Remove,
                      contentDescription = "Remove", tint = CoffeeBrown
                  )
              }


          }


        }



    }
}
