package com.example.daggerlearning

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    companion object{
        @Provides
        fun providesRim() = Rims()

        @Provides
        fun providesTires() = Tires()

        @Provides
        fun providesWheels(rim: Rims, tires: Tires): Wheels {
            tires.inflate()
            return Wheels(rim, tires)
        }

    }

}