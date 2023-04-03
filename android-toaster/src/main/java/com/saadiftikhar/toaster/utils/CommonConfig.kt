package com.saadiftikhar.toaster.utils

import android.content.Context
import com.saadiftikhar.toaster.listeners.Bus


object CommonConfig {
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