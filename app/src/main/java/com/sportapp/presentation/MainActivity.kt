package com.sportapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.sportapp.presentation.navigation.NavGraph
import com.sportapp.presentation.ui.theme.SportAppTheme
import com.sportapp.presentation.ui.viewmodels.MyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            SportAppTheme {
                val viewModel: MyViewModel = hiltViewModel<MyViewModel>()
                NavGraph(viewModel)
            }
        }
    }
}
