package com.src.imagegallery.sample

import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.src.imagegallery.ImageGalleryAdapter
import com.src.imagegallery.sample.databinding.ItemImageBinding

class ImageAdapter(
    private val context: Context,
    private val images: List<String>
) : ImageGalleryAdapter(context, {
    val binding = ItemImageBinding.inflate(
        LayoutInflater.from(it.context),
        it,
        false
    )
    ViewHolder(binding)
}) {

    class ViewHolder(val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root)

    override fun getItemCount() = images.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).binding.apply {
            Glide.with(context)
                .load(images[position])
                .fitCenter()
                .into(itemImageView)
        }
    }

    companion object {
        private const val TAG = "[IG]ImageAdapter"
    }
}