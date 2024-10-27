package com.example.yourname.di_dagger

import android.util.Log
import javax.inject.Inject

class ClassA @Inject constructor(){

    fun startClassA(){
        Log.i("TAG", "ClassA is created")
    }
}