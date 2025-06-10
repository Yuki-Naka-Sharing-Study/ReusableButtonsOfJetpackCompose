package com.example.reusablebuttonsofjetpackcompose

import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reusablebuttonsofjetpackcompose.ui.theme.ReusableButtonsOfJetpackComposeTheme

@Composable
fun BackButton() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "戻る",
            colorFilter = ColorFilter.tint(Color.White),
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 16.dp, start = 16.dp)
        )
    }
}

@Preview
@Composable
fun BackButtonPreview() {
    ReusableButtonsOfJetpackComposeTheme {
        BackButton()
    }
}