package com.sportapp.view.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.sportapp.navigation.MainDestinations


@Composable
fun MainScreen(navController: NavController) {

    if (true) {
        navController.navigate(MainDestinations.ADD_ICON_LARGE)
    } else {
        navController.navigate(MainDestinations.PLAYER_LIST)
    }

}

