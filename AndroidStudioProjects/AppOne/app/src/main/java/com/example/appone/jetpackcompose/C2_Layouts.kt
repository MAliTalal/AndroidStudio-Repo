package com.example.appone.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun RowExample() {
    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically

    ){
        Text(text="Apple", fontSize = 30.sp)
        Text(text="Mango", fontSize = 30.sp)
        Text(text="Banana", fontSize = 30.sp)
    }
}

@Composable
fun ColumnExample() {
    Column(modifier = Modifier.fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center){
        Text(text="Book 1", fontSize = 30.sp)
        Text(text="Book 2", fontSize = 30.sp)
        Text(text="Book 3", fontSize = 30.sp)
    }
}

@Composable
fun ColumnExample2() {
    Column(
          modifier = Modifier.fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally
        , verticalArrangement = Arrangement.Center){
        Text(text="Login Here", fontSize = 30.sp)

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter your Name") }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter your Email") }
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoxExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {

        Text(
            text="Note1",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.TopStart)
        )

        Text(
            text="Note2",
            fontSize = 30.sp
            , modifier = Modifier.align(Alignment.BottomEnd)
        )

        Text(
            text="Note3",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.Center))
    }
}
