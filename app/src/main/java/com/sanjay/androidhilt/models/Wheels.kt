package com.sanjay.androidhilt.models

import android.util.Log
import javax.inject.Inject

class Wheels{
    @Inject
    constructor()

    fun getWheels(){
        Log.d("Main", "Whhels Made")
    }

}