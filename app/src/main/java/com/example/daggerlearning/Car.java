package com.example.daggerlearning;

import javax.inject.Inject;

public class Car {
    @Inject
     Engine engine;
    private Body body;
    private Wheels wheel;
    private Driver driver;

    @Inject
    public Car(Engine engine, Wheels wheel, Driver driver) {
        this.wheel = wheel;
        this.driver = driver;
        this.engine = engine;
    }

    public void driving(){
        engine.start();
        System.out.println("CAR IS DRIVING BY DRIVER" + driver);
    }

    @Inject
     void setRemote(Remote remote){
        remote.setListener(this);
    }
}

