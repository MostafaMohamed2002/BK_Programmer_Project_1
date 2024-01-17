package com.mostafa.bk_programmer_pro_1.util

import com.mostafa.bk_programmer_pro_1.data.domain.Match

class CsvParser {
    fun parse(line: String): Match {
        val tokens = line.split(",")
        return Match(
            year = tokens[Constants.columnIndex.YEAR].toInt(),
            stadium = tokens[Constants.columnIndex.STADIUM],
            city = tokens[Constants.columnIndex.CITY],
            homeTeamName = tokens[Constants.columnIndex.HOME_TEAM_NAME],
            homeTeamGoals = tokens[Constants.columnIndex.HOME_TEAM_GOALS].toInt(),
            awayTeamName = tokens[Constants.columnIndex.AWAY_TEAM_NAME],
            awayTeamGoals = tokens[Constants.columnIndex.AWAY_TEAM_GOALS].toInt()
        )
    }
}