package com.sportapp.presentation.ui.view.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sportapp.presentation.navigation.MainDestinations


@Composable
fun AddPlayerIconLarge(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        LargeFloatingActionButton(
            onClick = {
                navController.navigate(MainDestinations.PLAYER_ADD)
            },
            containerColor = Color.Green,
            contentColor = Color.White
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Додати гравця",
                modifier = Modifier.size(48.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Додати гравця",
            color = Color.DarkGray,
        )
    }
}




