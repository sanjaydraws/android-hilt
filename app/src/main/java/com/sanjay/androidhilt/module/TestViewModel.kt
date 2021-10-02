package com.sanjay.androidhilt.module

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import javax.inject.Named

// viewmodelInject does viewmodel factory behind the scene
@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String2") testString2:String
) :ViewModel() {


    init {
        Log.d("ViewModel", "TestString From View Model:  $testString2")
    }
}

