package com.chris.aguayo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chris.aguayo.databinding.ActivityAnimeBinding

class AnimeActivity : AppCompatActivity() {

    private lateinit var rvAdapter: AnimeAdapter
    private lateinit var binding: ActivityAnimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )

        rvAdapter = AnimeAdapter(this)
        binding.items.adapter = rvAdapter

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.items.setLayoutManager(layoutManager)

        val list = resources.getStringArray(R.array.FairyTail)
        rvAdapter.setListPages(list.asList())

    }

}