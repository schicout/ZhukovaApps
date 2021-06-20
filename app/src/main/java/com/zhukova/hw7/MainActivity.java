package com.zhukova.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List units = new ArrayList();
        units.add("один");
        units.add("два");
        units.add("три");
        units.add("четыре");
        units.add("пять");
        units.add("шесть");
        units.add("семь");
        units.add("восемь");
        units.add("девять");

        printArray(units);
    }

void printArray(List units){
    Log.d("DZ7", "print Array:");
    for (Object s: units)
    Log.d("DZ7",  "" + s);
    }

    List dozens = new ArrayList();

    Arrays.asList("десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")

    List  hundreds = new ArrayList();
    
    Arrays.asList("сто", "двести", "триста", "четыреста", "пятьсот")

    List declensionOfRuble = new ArrayList();


    int minValue = 1;
    int maxValue = 599;

    int number = (int) (Math.random() * maxValue) + minValue;

        Log.d("HW7", "" + number);

    }
