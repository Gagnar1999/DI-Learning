package com.example.daggerlearning;

import javax.inject.Inject;

public class Car {
    @Inject
     Engine engine;
    private Body body;

    @Inject
    public Car(Engine engine, Body body) {
        this.body = body;
    }

    public void driving(){
        System.out.println("CAR IS DRIVING");
    }

    @Inject
     void setRemote(Remote remote){
        remote.setListener(this);
    }
}

