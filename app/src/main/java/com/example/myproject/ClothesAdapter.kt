package com.example.myproject.ui.slideshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject.R
import com.example.myproject.ui.slideshow.ClothesData.Clothing

class ClothesAdapter(private var clothingList: List<Clothing>) : RecyclerView.Adapter<ClothesAdapter.ViewHolder>() {

    // ViewHolder class to hold references to views in the layout
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoImageView: ImageView = itemView.findViewById(R.id.photoImageView)
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        // Add references to other TextViews as needed
    }

    // Inflate the layout for each item and return a ViewHolder object
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_slideshow, parent, false)
        return ViewHolder(view)
    }

    // Bind data to the views in each item
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = clothingList[position]
        holder.photoImageView.setImageResource(R.drawable._517832) // Set a placeholder image
        holder.nameTextView.text = currentItem.name
        // Bind other data to TextViews as needed
    }

    // Return the size of the clothingList
    override fun getItemCount(): Int {
        return clothingList.size
    }

    // Function to update clothing list
    fun updateClothingList(newList: List<Clothing>) {
        clothingList = newList
        notifyDataSetChanged()
    }
}
