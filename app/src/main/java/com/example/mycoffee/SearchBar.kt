package com.example.mycoffee

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp.ui.theme.LightBrown

@Composable
fun SearchBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            modifier = Modifier
                .height(56.dp)
                .weight(1f),
            value = "Search Coffee",
            shape = RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp),
            onValueChange = {},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    tint = Color.LightGray
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFF2A2A2A),
                unfocusedTextColor = Color.LightGray
            ),

            )

        Spacer(modifier = Modifier.width(4.dp))

        Icon(
            painter = painterResource(R.drawable.regular_outline_filter),
            contentDescription = "filter",
            tint = Color.White,
            modifier = Modifier
                .background(
                    LightBrown,
                    shape = RoundedCornerShape(topEnd = 8.dp, bottomEnd = 8.dp)
                )
                .size(56.dp)
                .padding(5.dp)
        )
    }

}