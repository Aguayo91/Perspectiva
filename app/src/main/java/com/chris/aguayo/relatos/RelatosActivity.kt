package com.chris.aguayo.relatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.chris.aguayo.R
import com.chris.aguayo.databinding.ActivityRelatosBinding

class RelatosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRelatosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelatosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*Glide
            .with(this)
            .load("https://i.pinimg.com/564x/62/43/92/6243921acd60cb708d9bd295f84c614e.jpg")
            .into(binding.alvarez)*/
    }
}