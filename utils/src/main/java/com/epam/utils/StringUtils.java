package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return !str.contains("-") && !str.equals("0");
    }
}
