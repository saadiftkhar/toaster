package com.saadiftikhar.toaster.utils

import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build

class AppUtil {
    companion object {

        fun setBackgroundTint(drawable: Drawable, color: Int) {
            drawable?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    drawable.colorFilter = BlendModeColorFilter(color, BlendMode.SRC_ATOP)
                } else {
                    drawable.setColorFilter(
                        color, PorterDuff.Mode.SRC_ATOP
                    )
                }
            }
        }

    }
}