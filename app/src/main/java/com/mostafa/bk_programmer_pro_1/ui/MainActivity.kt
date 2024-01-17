package com.mostafa.bk_programmer_pro_1.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mostafa.bk_programmer_pro_1.databinding.ActivityMainBinding
import com.mostafa.bk_programmer_pro_1.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    var _binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        openFile()
    }

    private fun openFile() {
        val inputStream = assets.open("worldcup.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val csvParser = CsvParser()
        buffer.forEachLine {
            val currentMatch = csvParser.parse(it)
            Log.v("DATA", currentMatch.toString())
        }
    }
}