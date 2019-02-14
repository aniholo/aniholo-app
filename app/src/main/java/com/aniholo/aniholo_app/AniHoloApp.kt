package com.aniholo.aniholo_app

import android.app.Application
import org.koin.android.ext.android.startKoin

class AniHoloApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf())
    }
}
