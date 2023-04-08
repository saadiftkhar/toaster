package com.saadiftkhar.toaster.utils

import android.content.Context
import com.saadiftkhar.toaster.listeners.Bus


object Configs {
    private lateinit var mBus: Bus

    fun initSharedConfig(bus: Bus) {
        synchronized(this) {
            mBus = bus
        }
    }

    fun getAppContext(): Context {
        return mBus.getAppContext()
    }
}