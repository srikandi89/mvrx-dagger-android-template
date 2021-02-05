package com.srikandi.di

import com.srikandi.data.LoginTracker
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [HomeAssistedModule::class, HomeModuleBuilder::class])
class HomeModule {
    @Singleton
    @Provides
    fun getLoginTracker() = LoginTracker()
}