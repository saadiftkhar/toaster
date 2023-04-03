package com.saadiftikhar.toaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codesses.androidtoast.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.simpleToast(this, "Hello World")
    }
}