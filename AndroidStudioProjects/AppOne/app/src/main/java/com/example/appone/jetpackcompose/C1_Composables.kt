package com.example.appone.jetpackcompose

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.remember


@Composable
fun TextExample(){

    Text(
        text = "App One 2026",
        color = Color.Red,
        fontSize= 30.sp,
        fontWeight= FontWeight.Bold,
        fontFamily= FontFamily.Cursive,
        textAlign= TextAlign.Center
    )
}

@Composable
fun TextFieldExample() {
    var name= remember {mutableStateOf(value="")}
    TextField(
        value=name.value,
        onValueChange = {name.value=it},
        //label = { Text(text = "Enter your Name") }
        placeholder = { Text(text = "Enter your Name") },
        leadingIcon = {
            Text(
                text = "*"
            )
        },
        trailingIcon = {
            Text(
                text = "*"
            )
        },
        singleLine = true
        )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextFieldExample() {
    var name= remember {mutableStateOf(value="")}
    OutlinedTextField(
        value=name.value,
        onValueChange = {name.value=it},
        //label = { Text(text = "Enter your Name") }
        placeholder = { Text(text = "Enter your Name") },
        leadingIcon = {
            Text(
                text = "*"
            )
        },
        trailingIcon = {
            Text(
                text = "*"
            )
        },
        singleLine = true

    )
}