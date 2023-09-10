package com.sportapp.view.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.sportapp.data.MyRepository
import com.sportapp.navigation.NavGraph
import com.sportapp.view.components.AddPlayerIconLarge


@Composable
fun PlayerListScreen() {
//    val repository = MyRepository() // Замініть це на ваш спосіб отримання репозиторію
//
//    val players by repository.dataFlow.collectAsState(emptyList())
    val navController = rememberNavController()

    if (true) {
        AddPlayerIconLarge(navController = navController)
    } else {
        // Додайте код для виведення списку гравців (PlayerList) з використанням players
    }
}




