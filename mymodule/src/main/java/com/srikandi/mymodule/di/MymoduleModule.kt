package com.srikandi.mymodule.di

import dagger.Module

@Module(includes = [MymoduleAssistedModule::class, MymoduleModuleBuilder::class])
class MymoduleModule {

}