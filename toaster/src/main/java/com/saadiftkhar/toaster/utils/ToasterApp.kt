package com.saadiftkhar.toaster.utils

import android.app.Application
import android.content.Context
import com.saadiftkhar.toaster.listeners.Bus
import com.saadiftkhar.toaster.utils.CommonConfig

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