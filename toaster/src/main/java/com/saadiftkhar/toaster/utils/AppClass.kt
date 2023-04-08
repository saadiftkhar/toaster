package com.saadiftkhar.toaster.utils

import android.app.Application
import android.content.Context
import com.saadiftkhar.toaster.listeners.Bus

class AppClass : Application() {

    override fun onCreate() {
        super.onCreate()
        Configs.initSharedConfig(configBus)
    }

    private val configBus = object : Bus {
        override fun getAppContext(): Context {
            return this@AppClass
        }
    }
}