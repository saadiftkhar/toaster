package com.saadiftikhar.toaster

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnSuccess).setOnClickListener {
            Toaster.success( "success")
        }
        findViewById<Button>(R.id.btnError).setOnClickListener {
            Toaster.error("error")
        }
        findViewById<Button>(R.id.btnDelete).setOnClickListener {
            Toaster.delete("delete")
        }
        findViewById<Button>(R.id.btnWarning).setOnClickListener {
            Toaster.warning("warning")
        }
        findViewById<Button>(R.id.btnInfo).setOnClickListener {
            Toaster.info("info")
        }
    }
}