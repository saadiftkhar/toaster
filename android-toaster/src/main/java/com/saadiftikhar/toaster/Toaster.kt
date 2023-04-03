package com.saadiftikhar.toaster

import android.view.LayoutInflater
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.saadiftikhar.toaster.databinding.LayoutCustomToastBinding
import com.saadiftikhar.toaster.utils.AppUtil
import com.saadiftikhar.toaster.utils.CommonConfig


class Toaster {

    companion object {

        fun success(
            text: String,
            icon: Int = R.drawable.ic_success,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(CommonConfig.getAppContext()).run {
                LayoutCustomToastBinding.inflate(this)
            }

            AppUtil.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(CommonConfig.getAppContext(), R.color.color_success_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    CommonConfig.getAppContext(),
                    R.color.color_success_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = AppUtil.getFont(CommonConfig.getAppContext(), font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(CommonConfig.getAppContext()).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }

        fun error(
            text: String,
            icon: Int = R.drawable.ic_error,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(CommonConfig.getAppContext()).run {
                LayoutCustomToastBinding.inflate(this)
            }

            AppUtil.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(CommonConfig.getAppContext(), R.color.color_error_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    CommonConfig.getAppContext(),
                    R.color.color_error_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = AppUtil.getFont(CommonConfig.getAppContext(), font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(CommonConfig.getAppContext()).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }

        fun delete(
            text: String,
            icon: Int = R.drawable.ic_delete,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(CommonConfig.getAppContext()).run {
                LayoutCustomToastBinding.inflate(this)
            }

            AppUtil.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(CommonConfig.getAppContext(), R.color.color_error_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    CommonConfig.getAppContext(),
                    R.color.color_error_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = AppUtil.getFont(CommonConfig.getAppContext(), font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(CommonConfig.getAppContext()).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }

        fun warning(
            text: String,
            icon: Int = R.drawable.ic_warning,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(CommonConfig.getAppContext()).run {
                LayoutCustomToastBinding.inflate(this)
            }

            AppUtil.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(CommonConfig.getAppContext(), R.color.color_warning_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    CommonConfig.getAppContext(),
                    R.color.color_warning_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = AppUtil.getFont(CommonConfig.getAppContext(), font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(CommonConfig.getAppContext()).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }

        fun info(
            text: String,
            icon: Int = R.drawable.ic_info,
            font: Int = R.font.basiercircle_regular
        ) {
            val binding = LayoutInflater.from(CommonConfig.getAppContext()).run {
                LayoutCustomToastBinding.inflate(this)
            }

            AppUtil.setBackgroundTint(
                binding.clRoot.background,
                ContextCompat.getColor(CommonConfig.getAppContext(), R.color.color_info_dim)
            )
            binding.ivIcon.setColorFilter(
                ContextCompat.getColor(
                    CommonConfig.getAppContext(),
                    R.color.color_info_dark
                )
            )
            binding.tvText.apply {
                this.text = text
                this.typeface = AppUtil.getFont(CommonConfig.getAppContext(), font)
            }
            binding.ivIcon.setImageResource(icon)

            val toast = Toast(CommonConfig.getAppContext()).apply {
                this.duration = Toast.LENGTH_SHORT
            }
            toast.view = binding.root
            toast.show()
        }
    }
}