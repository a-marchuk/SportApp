package com.sportapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sportapp.navigation.NavGraph
import com.sportapp.ui.theme.SportAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            SportAppTheme {
                NavGraph()
            }
        }
    }
}
