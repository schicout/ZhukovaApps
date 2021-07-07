package com.zhukova.animals

import android.util.Log

class Cat : Animal() {
    override fun doVoice() {
        Log.d("DZ", "Мяу-Мррр")
    }

    fun doScratch() {
        Log.d("DZ", "Цап-царап")
    }
}