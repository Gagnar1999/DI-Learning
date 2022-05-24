package com.example.daggerlearning;

import javax.inject.Inject;

public class Car {
    private Engine engine;
    private Body body;

    @Inject
    public Car(Engine engine, Body body) {
        this.engine = engine;
        this.body = body;
    }

    public void driving(){
        System.out.println("CAR IS DRIVING");
    }
}

