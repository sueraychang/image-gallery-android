package com.src.imagegallery.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.src.imagegallery.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageGalleryView.setImageGalleryAdapter(
            ImageAdapter(
                this,
                images
            )
        )
    }

    companion object {

        private val images = listOf(
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/1280px-Test-Logo.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/1280px-Test-Logo.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/1280px-Test-Logo.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/1280px-Test-Logo.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/1280px-Test-Logo.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/1280px-Test-Logo.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/1280px-Test-Logo.svg.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Test-Logo.svg/1280px-Test-Logo.svg.png"
        )
    }
}