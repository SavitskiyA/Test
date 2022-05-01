package com.example.test.di

import com.example.test.B
import dagger.Component

@Component
interface AppComponent {
    fun inject(b: B)
}