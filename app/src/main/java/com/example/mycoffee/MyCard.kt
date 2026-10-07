package com.example.mycoffee

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyCard() {
    Card(
        modifier = Modifier
            .width(400.dp)
            .background(
                color = Color.Transparent
            ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.banner_1),
            contentDescription = "banner",
            contentScale = ContentScale.Inside
        )
    }


}