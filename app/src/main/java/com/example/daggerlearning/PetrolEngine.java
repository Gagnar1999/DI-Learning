package com.example.daggerlearning;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private int systemCapacity;
    private int horsePower;

    @Inject
    PetrolEngine(@Named("system capacity") int systemCapacity, @Named("horse power") int horsePower) {
        this.systemCapacity = systemCapacity;
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d("TAG", "PETROL ENGINE STARTED ___)(_(_(_" + "\nSystemCapacity" + systemCapacity + "\nHorsePower" + horsePower);
    }
}
