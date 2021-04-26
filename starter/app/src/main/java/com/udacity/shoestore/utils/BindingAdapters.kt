package com.udacity.shoestore.utils

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("android:text")
fun setPaddingLeft(textView: TextView, value: Double) {
    textView.text = value.toString()
}