package com.srikandi.mymodule.di

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module

@AssistedModule
@Module(includes = [AssistedInject_MymoduleAssistedModule::class])
abstract class MymoduleAssistedModule