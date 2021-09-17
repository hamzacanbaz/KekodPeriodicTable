package com.canbazdev.kekodperiodictable.model

import android.graphics.drawable.Drawable
import com.canbazdev.kekodperiodictable.R

data class Element(
    var name: String? = null,
    var shortName: String? = "A",
    var number: Byte? = 100,
    var image: Int? = R.drawable.b,
    var atomicWeight: String? = null,
    var classification: Int? = 4,
    var isVisible: Boolean? = true,
)
