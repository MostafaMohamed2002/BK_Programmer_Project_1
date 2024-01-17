package com.mostafa.bk_programmer_pro_1.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewbinding.ViewBinding
import com.mostafa.bk_programmer_pro_1.R
import com.mostafa.bk_programmer_pro_1.databinding.ActivityBaseBinding

abstract class BaseActivity<VB: ViewBinding> : AppCompatActivity() {
    abstract val LOG_TAG: String
    abstract val bindingInflater: (layoutInflater: android.view.LayoutInflater) -> VB
    var _binding : ViewBinding? = null
    protected val binding: VB
        get() = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater(layoutInflater)
        setContentView(_binding?.root)

    }
}