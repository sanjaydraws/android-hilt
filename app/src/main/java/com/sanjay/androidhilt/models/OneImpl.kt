package com.sanjay.androidhilt.models

import android.util.Log
import com.sanjay.androidhilt.interfaces.One
import com.sanjay.androidhilt.module.FName
import com.sanjay.androidhilt.module.LName
import javax.inject.Inject


class OneImpl @Inject constructor(
    @FName private val fName:String,
    @LName private val lName:String,

    ): One {
    override fun getName() {
        Log.d("OneImpl", "getName: One Implementation $fName $lName")
    }
}