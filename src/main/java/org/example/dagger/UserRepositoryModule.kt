package org.example.dagger

import dagger.Binds
import  dagger.Module
import dagger.Provides


@Module
abstract class UserRepositoryModule(private val data : String) {

    /*
        Binds annotation used here because dagger can create SQLRepository Object by own because it has @Inject Annotations
        While Using Binds annotations we make it abstract because all methods annotated with Binds are by default abstract
     */

    @Binds
     abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}