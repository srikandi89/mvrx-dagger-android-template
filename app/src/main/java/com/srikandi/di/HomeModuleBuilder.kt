package com.srikandi.di

import com.srikandi.screen.AppActivity
import com.srikandi.screen.login.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeModuleBuilder {
    @ContributesAndroidInjector
    abstract fun bindHomeActivity() : AppActivity

    @ContributesAndroidInjector
    abstract fun bindHomeFragment(): LoginFragment
}