package com.saadiftikhar.toaster.utils

import android.app.Application
import android.content.Context
import com.saadiftikhar.toaster.listeners.Bus

class ToasterApp : Application() {

    override fun onCreate() {
        super.onCreate()
        CommonConfig.initSharedConfig(configBus)
    }

    private val configBus = object : Bus {
        override fun getAppContext(): Context {
            return this@ToasterApp
        }
    }
}