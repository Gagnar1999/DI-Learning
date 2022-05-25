package com.example.daggerlearning

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class DieselEngineModule @Inject constructor(var horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int = horsePower

    @Provides
    fun provideDieselEngine(engine: DieselEngine): Engine {
        return engine
    }
}