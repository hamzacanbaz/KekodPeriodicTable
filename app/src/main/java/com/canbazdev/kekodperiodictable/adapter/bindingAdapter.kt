package com.canbazdev.kekodperiodictable.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("sourceImage")
    fun <T> sourceImage(view: ImageView, profileImage: T) {
        Glide.with(view.context)
            .load(profileImage)
            .into(view)

    }
}