package com.example.reusablebuttonsofjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.reusablebuttonsofjetpackcompose.ui.theme.ReusableButtonsOfJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReusableButtonsOfJetpackComposeTheme {
                AddButton()
            }
        }
    }
}
