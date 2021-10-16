package com.sanjay.androidhilt

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.google.gson.Gson
import com.sanjay.androidhilt.databinding.ActivityMainBinding
import com.sanjay.androidhilt.models.Car
import com.sanjay.androidhilt.models.Main
import com.sanjay.androidhilt.models.Wheels
import com.sanjay.androidhilt.module.TestViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

// to inject dependency in fragment, activity or view
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null

    // it will search on module
    @Inject
    @Named("String1")
    lateinit var testString :String

    @Inject
    @Named("String3")
    lateinit var testString3:String

    @Inject
    lateinit var gson1:Gson


    private val mViewModel:TestViewModel by viewModels()


    // field Injection
    @Inject
    lateinit var wheels: Wheels


    // example of interface injection
    @Inject
    lateinit var  main:Main

    @Inject
    lateinit var car:Car // injecting car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(this.root)
        }

        Log.d("MAINACTIVITY", "onCreate: $testString")
        Log.d("MAINACTIVITY", "onCreate: $testString3") // our injection String - we will inject String

        mViewModel // to access


        car.getCar()
        wheels.getWheels()
        main.getName()



    }
}
