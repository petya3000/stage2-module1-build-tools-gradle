package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null) return false;
        return !str.contains("-") && !str.equals("0") && !str.trim().equals("");
    }
}
