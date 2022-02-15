package com.dassol.kanolio.app

import android.app.Application
import com.onesignal.OneSignal

class ClientOneSignal : Application() {

    override fun onCreate() {
        super.onCreate()

        OneSignal.initWithContext(applicationContext)
        OneSignal.setAppId("")  //THIS FIELD IN EVERY PROJECT IS UNIQUE !!!
    }
}