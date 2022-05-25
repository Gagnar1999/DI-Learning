package com.example.daggerlearning;

import dagger.Binds;
import dagger.Module;

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}

