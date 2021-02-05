package com.srikandi

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerMainComponent
        .builder()
        .applicationContext(this)
        .build()
        .also {
            it.inject(this)
        }

}