package com.srikandi

import android.content.Context
import com.srikandi.di.HomeModule
import com.srikandi.mymodule.di.MymoduleModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        MainModule::class,
        HomeModule::class,
        MymoduleModule::class
    ]
)
interface MainComponent : AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationContext(applicationContext: Context): Builder

        fun build(): MainComponent
    }

    fun inject(app: MainApplication)

    override fun inject(instance: DaggerApplication?)
}