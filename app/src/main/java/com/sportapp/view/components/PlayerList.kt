package com.sportapp.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sportapp.data.Player
import com.sportapp.viewmodels.MyViewModel

@Composable
fun PlayerList(navController: NavController, viewModel: MyViewModel) {
    val players by viewModel.dataFlow.collectAsState(emptyList())

    val playersByYear: Map<Int, List<Player>> = players.groupBy { it.age }

    LazyColumn {
        item {
            Text(
                text = "Total Players: ${players.size}",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
        }

        playersByYear.forEach { (year, playersForYear) ->
            item {
                PlayerCategoryCard(year = year)
            }

            var count = 1
            items(playersForYear) { player ->
                PlayerCard(player = player, count)
                count++
            }
            count = 1
        }
    }

    AddPlayerIconSmall(navController)
}







