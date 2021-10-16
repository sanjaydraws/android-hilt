package com.sanjay.androidhilt.models

import android.util.Log
import com.sanjay.androidhilt.interfaces.One
import javax.inject.Inject


class OneImpl @Inject constructor(): One {
    override fun getName() {
        Log.d("main", "getName: One Implementation ")
    }
}