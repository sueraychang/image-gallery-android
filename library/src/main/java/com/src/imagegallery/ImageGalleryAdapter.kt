package com.src.imagegallery

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class ImageGalleryAdapter(
    private val context: Context,
    private val viewHolderCreator: (ViewGroup) -> RecyclerView.ViewHolder
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return viewHolderCreator(parent)
    }
}