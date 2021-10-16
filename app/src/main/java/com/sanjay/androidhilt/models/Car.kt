package com.sanjay.androidhilt.models

import android.util.Log
import javax.inject.Inject
import kotlin.math.log

// constructor injection
class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) {

    fun getCar(){
        engine.getEngine()
        wheels.getWheels()
        Log.d("Main", "getCar: Car is Running ")
    }

}