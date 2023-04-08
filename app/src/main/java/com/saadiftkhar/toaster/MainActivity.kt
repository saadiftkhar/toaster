package com.saadiftkhar.toaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnSuccess).setOnClickListener {
            Toaster.success(
                context = this,
                text = "success"
            )
        }
        findViewById<Button>(R.id.btnError).setOnClickListener {
            Toaster.error(
                this,
                "error",
                font = R.font.basier_circle
            )
        }
        findViewById<Button>(R.id.btnDelete).setOnClickListener {
            Toaster.delete(
                this,
                "delete",
                font = R.font.basier_circle
            )
        }
        findViewById<Button>(R.id.btnWarning).setOnClickListener {
            Toaster.warning(
                this,
                "warning",
                font = R.font.basier_circle
            )
        }
        findViewById<Button>(R.id.btnInfo).setOnClickListener {
            Toaster.info(
                this,
                "info",
                R.font.basier_circle
            )
        }
    }
}