package com.saadiftkhar.toaster.utils

import android.content.Context
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.core.content.res.ResourcesCompat

class Utils {
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

        fun getFont(context: Context, fontResId: Int): Typeface? {
            return ResourcesCompat.getFont(context, fontResId)
        }
    }
}