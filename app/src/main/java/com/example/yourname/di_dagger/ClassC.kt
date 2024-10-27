package com.example.yourname.di_dagger

import android.util.Log
import javax.inject.Inject


// Manual Constructor Injection
class ClassC @Inject constructor(private val classA: ClassA,private val classB: ClassB) {

    // for Without DI
    /*private val classA = ClassA()
    private val classB = ClassB()*/

    // for Manual DI
    /*lateinit var classA: ClassA
    lateinit var classB: ClassB*/

    // for Everything fun is required
    fun startClassC() {
        classA.startClassA()
        classB.startClassB()

        Log.i("TAG", "ClassC is created")
    }

}