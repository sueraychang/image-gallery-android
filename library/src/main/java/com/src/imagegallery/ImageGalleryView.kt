package com.src.imagegallery

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ImageGalleryView : RelativeLayout {

    constructor(context: Context) : super(context) {
        initialView(context)
    }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        initialView(context)
        initialAttrs(attributeSet)
    }

    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) : super(
        context,
        attributeSet,
        defStyleAttr
    ) {
        initialView(context)
        initialAttrs(attributeSet)
    }

    lateinit var pager: ViewPager2
        private set

    private lateinit var tab: TabLayout

    private lateinit var adapter: ImageGalleryAdapter

    private fun initialView(context: Context) {
        LayoutInflater.from(context).inflate(R.layout.view_image_gallery, this, true)

        pager = findViewById(R.id.image_gallery_view_pager)
        tab = findViewById(R.id.image_gallery_tab_layout)

    }

    private fun initialAttrs(attributeSet: AttributeSet) {

    }

    fun setImageGalleryAdapter(adapter: ImageGalleryAdapter) {
        this.adapter = adapter
        pager.adapter = adapter

        TabLayoutMediator(tab, pager) { tab, position ->

        }.attach()

        pager.setCurrentItem(0, true)
    }

    fun setUserInputEnable(enable: Boolean) {
        pager.isUserInputEnabled = enable
    }
}