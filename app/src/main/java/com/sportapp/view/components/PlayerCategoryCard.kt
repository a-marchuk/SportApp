package com.sportapp.view.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlayerCategoryCard(year: Int) {
    ElevatedCard(
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Вікова категорія (рік)",
                style = TextStyle(fontSize = 18.sp),
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = year.toString(),
                style = TextStyle(fontSize = 18.sp),
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}