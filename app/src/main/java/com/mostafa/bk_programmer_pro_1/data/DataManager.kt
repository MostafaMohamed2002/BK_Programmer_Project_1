package com.mostafa.bk_programmer_pro_1.data

import com.mostafa.bk_programmer_pro_1.data.domain.Match

object DataManager {
    private val matchesList = mutableListOf<Match>()
    val getMatches: List<Match>
        get() = matchesList.reversed()
    val getMatchesCount: Int
        get() = matchesList.size
    var matchIndex = 0
    fun addMatchAtEnd(match: Match) {
        matchesList.add(matchesList.size, match)
    }

    fun addMatch(match: Match) {
        matchesList.add(match)
    }

    fun getCurrentMatch(): Match {
        return matchesList[matchIndex]
    }

    fun removeMatchAt(index: Int) {
        matchesList.removeAt(index)
    }

    fun removeMatch(match: Match) {
        matchesList.remove(match)
    }

    fun getNextMatch(): Match {
        //handle end of array error
        if (matchIndex + 1 == matchesList.size - 1) {
            matchIndex = 0
        } else
            matchIndex++
        return matchesList[matchIndex]
    }

    fun getPrevMatch(): Match {
        if (matchIndex - 1 == 0 || matchIndex == 0) {
            matchIndex = matchesList.size - 1
        } else
            matchIndex--
        return matchesList[matchIndex]
    }
}