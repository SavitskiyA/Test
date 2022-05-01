package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class A@Inject
constructor() {


    val a = "a"
    val b = false

    @Inject
    fun aa():String = ""
}

class B {
    @Inject
    lateinit var a: A

    init {
        DaggerAppComponent.create().inject(this)
    }
}