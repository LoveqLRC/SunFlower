package com.example.liaoruochen.sunflower.adapters

import android.view.View
import androidx.databinding.BindingAdapter


@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone:Boolean){
    view.visibility = if (isGone){
        View.VISIBLE
    }else{
        View.GONE
    }
}