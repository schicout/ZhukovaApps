package com.zhukova.hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List <String> units = new ArrayList<>(
        Arrays.asList ("один", "два", "три", "четыре", "пять", "шесть", "семь",
                "восемь", "девять"));

    List <String> dozens = new ArrayList<>(
            Arrays.asList("десять", "двадцать", "тридцать", "сорок", "пятьдесят",
                    "шестьдесят", "семьдесят", "восемьдесят", "девяносто"));

    List <String> hundreds = new ArrayList<>(
            Arrays.asList("сто", "двести", "триста", "четыреста", "пятьсот"));

        Map <Integer, String> declensionOfRuble = new HashMap<>();
        declensionOfRuble.put (1, "рубль");
        declensionOfRuble.put (2, "рубля");
        declensionOfRuble.put (3, "рублей");

StringBuilder result = new StringBuilder();

final int minValue = 1;
final int maxValue = 599;

    int number = (int) (Math.random() * maxValue) + minValue;

        Log.d("HW7", "new number " + number);

        if (number/100 !=0)
            result
                    .append(hundreds.get((number/100)-1));

        if ((number %100)/10 != 0)
            result
                    .append(" ")
                    .append(dozens.get(((number%100)/10)-1));

        if (number %10 !=0)
            result
                    .append(" ")
                    .append(units.get((number %10)-1));

        if (number % 10 == 1)
            result
                    .append(" ")
                    .append(declensionOfRuble.get(1));

        if (number % 10 >= 2 && number <=4)
            result
                    .append(" ")
                    .append(declensionOfRuble.get(2));

        if (number % 10 >= 5 || number == 0) {
        } else {
            result
                    .append(" ")
                    .append(declensionOfRuble.get(3));
        }

        Log.d("HW7", "" + result.toString());


    }
}
