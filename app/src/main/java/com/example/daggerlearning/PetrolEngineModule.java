package com.example.daggerlearning;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {
    private int systemCapacity;

    PetrolEngineModule(int systemCapacity) {
        this.systemCapacity = systemCapacity;
    }

    @Provides
    int provideSystemCapacity() {
        return systemCapacity;
    }

    @Provides
    Engine providePetrolEngine(PetrolEngine petrolEngine) {
        return petrolEngine;
    }

}

