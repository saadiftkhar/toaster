package com.saadiftkhar.toaster

import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.saadiftkhar.toaster.databinding.LayoutCustomToastBinding
import com.saadiftkhar.toaster.utils.Utils


class Toaster {

    companion object {

        fun success(
            context: Context,
            text: String,
            icon: Int = R.drawable.ic_success,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(context).run {
                LayoutCustomToastBinding.inflate(this)
            }

            Utils.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(context, R.color.color_success_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    context,
                    R.color.color_success_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = Utils.getFont(context, font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(context).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }

        fun error(
            context: Context,
            text: String,
            icon: Int = R.drawable.ic_error,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(context).run {
                LayoutCustomToastBinding.inflate(this)
            }

            Utils.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(context, R.color.color_error_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    context,
                    R.color.color_error_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = Utils.getFont(context, font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(context).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }

        fun delete(
            context: Context,
            text: String,
            icon: Int = R.drawable.ic_delete,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(context).run {
                LayoutCustomToastBinding.inflate(this)
            }

            Utils.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(context, R.color.color_error_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    context,
                    R.color.color_error_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = Utils.getFont(context, font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(context).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }

        fun warning(
            context: Context,
            text: String,
            icon: Int = R.drawable.ic_warning,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(context).run {
                LayoutCustomToastBinding.inflate(this)
            }

            Utils.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(context, R.color.color_warning_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    context,
                    R.color.color_warning_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = Utils.getFont(context, font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(context).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }

        fun info(
            context: Context,
            text: String,
            icon: Int = R.drawable.ic_info,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(context).run {
                LayoutCustomToastBinding.inflate(this)
            }

            Utils.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(context, R.color.color_info_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    context,
                    R.color.color_info_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = Utils.getFont(context, font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(context).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }
    }
}