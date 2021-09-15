package com.canbazdev.kekodperiodictable

import android.widget.FrameLayout
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("backgroundColor")
    fun setBackgroundColor(view: FrameLayout, type: Int) {
        when(type){
            0->         view.setBackgroundColor(ContextCompat.getColor(view.context,android.R.color.holo_blue_light))
            1->         view.setBackgroundColor(ContextCompat.getColor(view.context,android.R.color.holo_green_light))
            2->         view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.purple_200))
            3->         view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.teal_700))
            4->         view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.purple_700))
            5->         view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.holo_orange_dark))
            6->         view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.holo_red_dark))
            7->         view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.teal_200))
            8->         view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.holo_green_dark))
            9->         view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.holo_orange_light))
            10->        view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.holo_red_light))
            else ->     view.setBackgroundColor(ContextCompat.getColor(view.context,android.R.color.holo_orange_light))

        }


    }
}