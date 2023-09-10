package com.sportapp.data

class MyRepository {
    private val playerList = mutableListOf<Player>()

    fun savePlayer(player: Player) {
        playerList.add(player)
    }

    fun getPlayerList(): List<Player> {
        return playerList
    }
}





