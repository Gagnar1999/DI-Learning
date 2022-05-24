package com.example.daggerlearning

import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindsDieselEngine(engine: DieselEngine): Engine
}