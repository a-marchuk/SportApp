package com.sportapp.presentation.ui.view.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import com.sportapp.presentation.navigation.MainDestinations
import com.sportapp.presentation.ui.viewmodels.MyViewModel


@Composable
fun MainScreen(navController: NavController, viewModel: MyViewModel) {
    val players by viewModel.dataFlow.collectAsState(emptyList())

    if (players.isEmpty()) {
        navController.navigate(MainDestinations.ADD_ICON_LARGE)
    } else {
        navController.navigate(MainDestinations.PLAYER_LIST)
    }
}



