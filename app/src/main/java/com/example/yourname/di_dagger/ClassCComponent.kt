package com.example.yourname.di_dagger

import dagger.Component


@Component(modules = [ClassABModule::class])
interface ClassCComponent {

    fun getClassCInstance(): ClassC


}