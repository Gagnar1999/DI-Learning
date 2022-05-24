package com.example.daggerlearning;

import javax.inject.Inject;

public class Car {
    @Inject
     Engine engine;
    private Body body;
    private Wheels wheel;

    @Inject
    public Car(Engine engine, Wheels wheel) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void driving(){
        engine.start();
        System.out.println("CAR IS DRIVING");
    }

    @Inject
     void setRemote(Remote remote){
        remote.setListener(this);
    }
}

