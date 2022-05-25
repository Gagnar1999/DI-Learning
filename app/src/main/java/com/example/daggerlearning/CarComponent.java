package com.example.daggerlearning;


import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder systemCapacity(int systemCapacity);

        CarComponent build();
    }
}
