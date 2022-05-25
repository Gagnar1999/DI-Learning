package com.example.daggerlearning;


import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
