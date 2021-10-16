package com.sanjay.androidhilt.models

import com.sanjay.androidhilt.interfaces.One
import javax.inject.Inject


class Main @Inject constructor(private val one: One){
    fun getName(){
        one.getName()
    }
}