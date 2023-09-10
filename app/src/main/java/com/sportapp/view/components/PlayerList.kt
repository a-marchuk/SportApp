package com.sportapp.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sportapp.viewmodels.MyViewModel

@Composable
fun PlayerList(navController: NavController, viewModel: MyViewModel) {
    val players by viewModel.dataFlow.collectAsState(emptyList())

    LazyColumn {
        items(players) { player ->
            Text(
                text = "${player.surname} ${player.name} ${player.age}", // Отримуємо ім'я гравця
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                style = TextStyle(fontSize = 18.sp),
                textAlign = TextAlign.Center
            )
        }
    }
    AddPlayerIconSmall(navController)
}



