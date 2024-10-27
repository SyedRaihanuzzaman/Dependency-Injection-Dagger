package com.example.yourname.di_dagger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // for without DI
        /*val classC = ClassC()
        classC.startClassC()*/

        // for Manual DI
        /*val classC = ClassC()
        classC.classA = ClassA()
        classC.classB = ClassB()
        classC.startClassC()*/

        // for Manual constructor Injection

       /* val classA = ClassA()
        val classB = ClassB()
        val classC = ClassC(classA, classB)
        classC.startClassC()*/

        DaggerClassCComponent.create().getClassCInstance().startClassC()


    }
}