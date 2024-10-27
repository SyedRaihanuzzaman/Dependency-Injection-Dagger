package com.example.yourname.di_dagger

import android.util.Log
import javax.inject.Inject

class ClassB @Inject constructor() {

    fun startClassB(){
        Log.i("TAG", "ClassB is created")
    }
}