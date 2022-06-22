package com.tenclouds.fluidbottomnavigation

import android.graphics.drawable.Drawable

data class FluidBottomNavigationItem(
    val title: String,
    val unselectDrawable: Drawable? = null,
    val selectDrawable: Drawable? = null
)