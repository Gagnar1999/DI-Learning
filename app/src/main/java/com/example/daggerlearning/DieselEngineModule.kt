package com.example.daggerlearning

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(var horsePower : Int) {

    @Provides
    fun provideDieselEngine(): Engine{
        return DieselEngine(horsePower)
    }
}