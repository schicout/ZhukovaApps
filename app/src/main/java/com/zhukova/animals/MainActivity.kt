package com.zhukova.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog: Animal? = Dog()
        val cat: Animal? = Cat()

        dog.doVoice()
        if (dog is Dog) {
            dog.doBite()
        }

        cat.doVoice()
        if (cat is Cat) {
            cat.doScratch()
        }

    }
}