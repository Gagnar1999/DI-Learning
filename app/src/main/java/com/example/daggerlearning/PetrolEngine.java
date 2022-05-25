package com.example.daggerlearning;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private int systemCapacity;


    @Inject
    PetrolEngine(int systemCapacity) {
        this.systemCapacity = systemCapacity;
    }

    @Override
    public void start() {

    }
}
