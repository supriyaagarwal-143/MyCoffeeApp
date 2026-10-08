package com.example.mycoffee

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun ProductGrid(products: List<Product>, navController: NavHostController) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {

        //item { topItem() }

        items(products.chunked(2)) { rowItem ->
            Row(modifier = Modifier.fillMaxWidth()) {
                Product(rowItem[0], Modifier.weight(1f), navController)
                if (rowItem.size == 2) Product(rowItem[1], Modifier.weight(1f), navController)
                else Spacer(modifier = Modifier.weight(1f))


            }

        }

    }

}