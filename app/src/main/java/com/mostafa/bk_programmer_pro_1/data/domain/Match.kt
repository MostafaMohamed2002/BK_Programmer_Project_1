package com.mostafa.bk_programmer_pro_1.data.domain

data class Match(
    val year: Int,
    val stadium: String,
    val city: String,
    val homeTeamName: String,
    val homeTeamGoals: Int,
    val awayTeamName: String,
    val awayTeamGoals: Int,
)
