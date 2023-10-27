package com.sportapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sportapp.presentation.ui.view.components.AddPlayerIconLarge
import com.sportapp.presentation.ui.view.components.PlayerList
import com.sportapp.presentation.ui.view.components.PlayersAddPage
import com.sportapp.presentation.ui.view.screens.MainScreen
import com.sportapp.presentation.ui.viewmodels.MyViewModel


@Composable
fun NavGraph(viewModel: MyViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MainDestinations.MAIN_SCREEN
    ) {
        composable(MainDestinations.ADD_ICON_LARGE) {
            AddPlayerIconLarge(navController)
        }
        composable(MainDestinations.PLAYER_ADD) {
            PlayersAddPage(navController, viewModel)
        }
        composable(MainDestinations.MAIN_SCREEN) {
            MainScreen(navController, viewModel)
        }
        composable(MainDestinations.PLAYER_LIST) {
            PlayerList(navController, viewModel)
        }

    }
}


object MainDestinations {
    const val ADD_ICON_LARGE = "add_icon_large"
    const val PLAYER_ADD = "player_add"
    const val MAIN_SCREEN = "main_screen"
    const val PLAYER_LIST = "player_list"
}
