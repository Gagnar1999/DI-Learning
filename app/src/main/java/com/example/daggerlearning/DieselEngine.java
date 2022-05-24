package com.example.daggerlearning;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine{
    private static final String TAG = "CAR";

    @Inject
    DieselEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "DIESEL ENGINE STARTED !!!!");
    }
}
