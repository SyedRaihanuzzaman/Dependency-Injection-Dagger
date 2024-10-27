package com.example.yourname.di_dagger

import dagger.Module
import dagger.Provides


@Module
object ClassABModule {

    @Provides
    fun classClassA():ClassA{
        return ClassA()
    }


    @Provides
    fun classClassB():ClassB{
        return ClassB()
    }
}