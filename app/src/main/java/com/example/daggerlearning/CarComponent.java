package com.example.daggerlearning;


import dagger.Component;

@Component
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
