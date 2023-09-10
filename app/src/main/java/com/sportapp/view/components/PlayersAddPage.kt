package com.sportapp.view.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sportapp.data.Player
import com.sportapp.navigation.MainDestinations
import com.sportapp.viewmodels.MyViewModel


@Composable
fun PlayersAddPage(navController: NavController, viewModel: MyViewModel) {
    val surnameState = remember { mutableStateOf(TextFieldValue("")) }
    val nameState = remember { mutableStateOf(TextFieldValue("")) }
    val ageState = remember { mutableStateOf(TextFieldValue("")) }

    val isSaveButtonEnabled =
        surnameState.value.text.isNotBlank() &&
                nameState.value.text.isNotBlank() &&
                ageState.value.text.isNotBlank()

    ElevatedCard(
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 30.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
        ) {
            TextFieldComponent(
                label = "Прізвище",
                value = surnameState.value,
                onValueChange = { surnameState.value = it }
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextFieldComponent(
                label = "Ім'я",
                value = nameState.value,
                onValueChange = { nameState.value = it }
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextFieldComponent(
                label = "Вікова категорія (рік)",
                value = ageState.value,
                onValueChange = { ageState.value = it }
            )


        }
    }
    SaveButton("Зберегти", enabled = isSaveButtonEnabled) {
        val surname = surnameState.value.text
        val name = nameState.value.text
        val age = ageState.value.text.toIntOrNull() ?: 0

        val player = Player(surname, name, age)
        viewModel.savePlayerData(player)
        navController.navigate(MainDestinations.PLAYER_LIST)
    }
}




