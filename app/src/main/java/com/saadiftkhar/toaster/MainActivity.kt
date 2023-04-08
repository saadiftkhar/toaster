package com.saadiftkhar.toaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnSuccess).setOnClickListener {
            Toaster.success(this, "success")
        }
        findViewById<Button>(R.id.btnError).setOnClickListener {
            Toaster.error(this, "error")
        }
        findViewById<Button>(R.id.btnDelete).setOnClickListener {
            Toaster.delete(this, "delete")
        }
        findViewById<Button>(R.id.btnWarning).setOnClickListener {
            Toaster.warning(this, "warning")
        }
        findViewById<Button>(R.id.btnInfo).setOnClickListener {
            Toaster.info(this, "info")
        }
    }
}