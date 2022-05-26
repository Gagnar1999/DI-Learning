package com.example.daggerlearning;


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder systemCapacity(@Named("system capacity") int systemCapacity);

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        CarComponent build();
    }
}
