package com.zhukova.animals

import android.util.Log

class Dog : Animal() {
    override fun doVoice() {
        Log.d("DZ", "Гав-Гав")
    }

    fun doBite() {
        Log.d("DZ", "Кус-Кус")
    }
}