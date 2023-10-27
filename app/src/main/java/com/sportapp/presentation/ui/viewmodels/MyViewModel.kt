package com.sportapp.presentation.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.sportapp.data.MyRepository
import com.sportapp.data.Player
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val repository: MyRepository) : ViewModel() {
    private val _dataFlow = MutableStateFlow<List<Player>>(emptyList())
    val dataFlow: StateFlow<List<Player>> = _dataFlow.asStateFlow()

    fun savePlayerData(player: Player) {
        repository.savePlayer(player)
        updatePlayerList()
    }

    private fun updatePlayerList() {
        val players = repository.getPlayerList()
        _dataFlow.value = players
    }
}



