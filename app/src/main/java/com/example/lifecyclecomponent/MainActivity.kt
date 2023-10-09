package com.example.lifecyclecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("MAIN","Activity onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN","Activity onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MAIN","Activity onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MAIN","Activity onStop")
    }
}