package com.mostafa.bk_programmer_pro_1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mostafa.bk_programmer_pro_1.data.DataManager
import com.mostafa.bk_programmer_pro_1.data.domain.Match
import com.mostafa.bk_programmer_pro_1.databinding.ActivityMainBinding
import com.mostafa.bk_programmer_pro_1.ui.adapter.MatchAdapter
import com.mostafa.bk_programmer_pro_1.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader


class MainActivity : AppCompatActivity() {
    var _binding: ActivityMainBinding? = null
    lateinit var matchAdapter: MatchAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        parseFile()
        runRecyclerView()
        addCallBack()
    }

    fun runRecyclerView() {
        /*
                val llm = LinearLayoutManager(this)
                llm.orientation = LinearLayoutManager.VERTICAL
        */
        matchAdapter = MatchAdapter(DataManager.getMatches)
        _binding?.recyclerView?.adapter = matchAdapter
//        _binding?.recyclerView?.setLayoutManager(llm)
    }

    private fun addCallBack() {
        _binding?.floatingActionButton?.setOnClickListener {
            val newMatch = Match(
                year = 2020,
                stadium = "blabla",
                homeTeamName = "eg",
                homeTeamGoals = 10,
                awayTeamName = "egy",
                awayTeamGoals = 20,
                city = "bla"
            )
            DataManager.addMatchAtEnd(newMatch)
            matchAdapter.setNewData(DataManager.getMatches)
        }
    }


    private fun parseFile() {
        val inputStream = assets.open("worldcup.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val csvParser = CsvParser()
        buffer.forEachLine {
            val currentMatch: Match = csvParser.parse(it)
            DataManager.addMatch(currentMatch)
        }
    }

    /*
        fun applyCallBacks() {
            _binding?.apply {
                nextButton.setOnClickListener {
                    val match = DataManager.getNextMatch()
                    bindMatch(match)
                    Log.v("MatchID", DataManager.matchIndex.toString())
                }
                prevButton.setOnClickListener {
                    var match = DataManager.getPrevMatch()
                    bindMatch(match)
                    Log.v("MatchID", DataManager.matchIndex.toString())
                }
            }
        }

        private fun bindMatch(match: Match) {
            _binding?.apply {
                yearTextView.text = match.year.toString()
                stadiumTextView.text = match.stadium.toString()
                homeTeamNameTextView.text = match.homeTeamName.toString()
                homeTeamGoalsTextView.text = match.homeTeamGoals.toString()
                awayTeamGoalsTextView.text = match.awayTeamGoals.toString()
                awayTeamNameTextView.text = match.awayTeamName
            }
        }
    */

}