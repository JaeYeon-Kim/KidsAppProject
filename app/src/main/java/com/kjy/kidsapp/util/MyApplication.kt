package com.kjy.kidsapp.util

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        initLogger()
    }

    private fun initLogger() {
        // Logger 설정
        val strategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(false)
            .methodCount(5)
            .tag("LOG_RESULT")
            .build()
        Logger.clearLogAdapters()
        Logger.addLogAdapter(AndroidLogAdapter(strategy))
    }
}