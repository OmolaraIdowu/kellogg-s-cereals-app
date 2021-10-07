package com.swancodes.kelloggscereals.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cereals(
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId1: Int,
    @DrawableRes val imageResourceId: Int)
