package com.example.mycoffee

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycoffeeapp.ui.theme.CoffeeBrown
import com.example.mycoffeeapp.ui.theme.LightGray

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CategoryList() {
    val categoryList = listOf(
        "All Coffee",
        "Macchiato",
        "Latte",
        "Americano",
        "Snacks",
        "Dessert"
    )
    var index by remember { mutableIntStateOf(0) }
    LazyRow(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(count = 5) {
            Text(
                modifier = Modifier
                    .background(
                        color = if (index == it)
                            CoffeeBrown else LightGray,
                        shape = RoundedCornerShape(6.dp)
                    )
                    .width(80.dp)
                    .height(30.dp)
                    .padding(5.dp)
                    .clickable(
                        enabled = true,
                        onClick = { index = it}
                    ),
                text = categoryList[it],
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = if (it == index) Color.White else Color.Black

            )
        }
    }

}