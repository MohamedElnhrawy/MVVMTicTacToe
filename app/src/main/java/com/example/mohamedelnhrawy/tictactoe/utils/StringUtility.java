package com.example.mohamedelnhrawy.tictactoe.utils;

/**
 * Created by mohamedelnhrawy on 9/28/18.
 */

public class StringUtility {
    public static String stringFromNumbers(int... numbers) {
        StringBuilder sNumbers = new StringBuilder();
        for (int number : numbers)
            sNumbers.append(number);
        return sNumbers.toString();
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.length() == 0;
    }
}
