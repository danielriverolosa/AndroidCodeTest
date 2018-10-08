package com.innocv.androidcodetest.presentation.base.utils

import android.content.Context
import android.support.v7.widget.SearchView
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.innocv.androidcodetest.R


fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}


fun ImageView.showCircleImage(context: Context, url: String? = null) {
    Glide.with(context)
            .load(url)
            .apply(RequestOptions
                    .bitmapTransform(CircleCrop())
                    .placeholder(R.drawable.ic_account_large))
            .into(this)
}

fun SearchView.onQueryTextChange(queryTextChange: (String) -> Unit) {
    this.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
        override fun onQueryTextChange(newText: String?): Boolean {
            newText?.let {
                queryTextChange.invoke(newText)
            }
            return true
        }

        override fun onQueryTextSubmit(query: String?): Boolean { return false }
    })
}