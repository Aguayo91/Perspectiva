package com.chris.aguayo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.chris.aguayo.databinding.ListItemAnimeBinding

class AnimeAdapter(val context: Context): RecyclerView.Adapter<AnimeAdapter.ImagesViewHolder>() {
    inner class ImagesViewHolder(val binding: ListItemAnimeBinding):RecyclerView.ViewHolder(binding.root)

    fun setListPages(list: List<String>){
        listOfPages = list.toList()
    }
    private var listOfPages:List<String> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        val binding = ListItemAnimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImagesViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return listOfPages.size
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        with(holder){
            with(listOfPages[position]){
                val imageUrl = listOfPages[position]
            Glide
                .with(context)
                .load(imageUrl)
                .into(binding.anime)
            }
        }

    }

}