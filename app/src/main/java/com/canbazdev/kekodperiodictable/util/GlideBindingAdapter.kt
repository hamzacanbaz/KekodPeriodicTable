package com.canbazdev.kekodperiodictable.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object GlideBindingAdapter {
    @JvmStatic
    @BindingAdapter("sourceImage")
    fun <T> sourceImage(view: ImageView, profileImage: T) {
        Glide.with(view.context)
            .load(profileImage)
            .into(view)

    }
}