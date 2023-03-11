package com.chris.aguayo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chris.aguayo.databinding.ActivityMainBinding
import com.chris.aguayo.relatos.RelatosActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enterReadAnime()
    }

    private fun enterReadAnime() {
        binding.textviewEntrar.setOnClickListener {
            startActivity(Intent(this@MainActivity, RelatosActivity::class.java))
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }
    }
}