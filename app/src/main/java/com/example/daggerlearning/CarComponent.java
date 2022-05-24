package com.example.daggerlearning;


import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
