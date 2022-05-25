package com.example.daggerlearning;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private int systemCapacity;


    @Inject
    PetrolEngine(int systemCapacity) {
        this.systemCapacity = systemCapacity;
    }

    @Override
    public void start() {
        Log.d("TAG", "PETROL ENGINE STARTED ___)(_(_(_"+systemCapacity);
    }
}
