package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;

        boolean el = data[0];

        for (boolean index : data) {
            if (el != index) {
                result = false;
                break;
            }
        }

        return result;
    }
}