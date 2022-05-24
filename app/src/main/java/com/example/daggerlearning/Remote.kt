package com.example.daggerlearning

import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car){
        println("SETTING LISTENER ON REMOTE OBJECT")
    }
}