package com.example.affirmations_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourceId:Int,@DrawableRes val imgResourceId:Int) {

}