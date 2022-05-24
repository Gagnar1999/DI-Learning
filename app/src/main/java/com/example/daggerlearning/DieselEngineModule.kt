package com.example.daggerlearning

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {
    @Provides
    fun provideDieselEngine(engine: DieselEngine): Engine {
        return engine
    }
}