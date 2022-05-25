package com.example.daggerlearning;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "CAR";
    private int horsePower;

    @Inject
    DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "HORSE POWER"+horsePower);
        Log.d(TAG, "DIESEL ENGINE STARTED !!!!");
    }
}
