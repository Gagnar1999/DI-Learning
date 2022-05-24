package com.example.daggerlearning;

import javax.inject.Inject;

public class Car {
    @Inject
     Engine engine;
    private Body body;
    private Wheels wheel;

    @Inject
    public Car(Engine engine, Wheels wheel) {
        this.body = body;
        this.wheel = wheel;
    }

    public void driving(){
        System.out.println("CAR IS DRIVING");
    }

    @Inject
     void setRemote(Remote remote){
        remote.setListener(this);
    }
}

