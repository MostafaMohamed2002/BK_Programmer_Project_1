package com.mostafa.bk_programmer_pro_1.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mostafa.bk_programmer_pro_1.R
import com.mostafa.bk_programmer_pro_1.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    var _binding : ActivitySearchBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
    }
}