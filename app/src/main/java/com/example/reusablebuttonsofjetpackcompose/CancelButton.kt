package com.example.reusablebuttonsofjetpackcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reusablebuttonsofjetpackcompose.ui.theme.ReusableButtonsOfJetpackComposeTheme

@Composable
fun CancelButton() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "キャンセル",
            color = Color.White,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 16.dp, start = 16.dp)
        )
    }
}

@Preview
@Composable
fun CancelButtonPreview() {
    ReusableButtonsOfJetpackComposeTheme {
        CancelButton()
    }
}