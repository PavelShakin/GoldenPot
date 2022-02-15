package com.dassol.kanolio.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.dassol.kanolio.R
import com.dassol.kanolio.databinding.ActivityMainBinding
import com.dassol.kanolio.presentation.view.game_view.FragmentMenu

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setDefaultFragment()
    }

    private fun setDefaultFragment() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainer, FragmentMenu())
        }
    }
}