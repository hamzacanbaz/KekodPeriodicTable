package com.canbazdev.kekodperiodictable.util

import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.canbazdev.kekodperiodictable.R

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("backgroundColor")
    fun setBackgroundColor(view: FrameLayout, type: Int) {
        when (type) {
            0 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.element_color_5
                )
            )
            1 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    android.R.color.holo_orange_light
                )
            )
            2 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.purple_200
                )
            )
            3 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.element_color_8
                )
            )
            4 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.element_color_2
                )
            )
            5 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.element_color_4
                )
            )
            6 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.element_color_7
                )
            )
            7 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    R.color.teal_200
                )
            )
            8 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    android.R.color.holo_blue_light
                )
            )
            9 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    android.R.color.holo_green_light
                )
            )
            10 -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    android.R.color.holo_red_light
                )
            )
            else -> view.setBackgroundColor(
                ContextCompat.getColor(
                    view.context,
                    android.R.color.holo_orange_light
                )
            )

        }


    }
}