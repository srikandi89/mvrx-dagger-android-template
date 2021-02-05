package com.srikandi.mymodule.di

import com.srikandi.mymodule.MymoduleActivity
import com.srikandi.mymodule.screen.BookFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MymoduleModuleBuilder {
    @ContributesAndroidInjector
    abstract fun getMymoduleActivity(): MymoduleActivity

    @ContributesAndroidInjector
    abstract fun getBookFragment(): BookFragment
}