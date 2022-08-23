package com.insidecoderz.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("MAIN","onCreate")

    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN","onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN","onStop")
    }
}