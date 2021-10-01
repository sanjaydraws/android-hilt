package com.sanjay.androidhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sanjay.androidhilt.databinding.ActivityMainBinding
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(this.root)
        }

        Log.d("MAINACTIVITY", "onCreate: $testString")
        Log.d("MAINACTIVITY", "onCreate: $testString3")

    }
}
