package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int size = 0;
        int rightIndex = 0;
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = rightIndex; j < right.length; j++) {
                if (left[i] > right[rightIndex]) {
                    rsl[size] = right[rightIndex];
                    size++;
                    rightIndex++;
                }
            }
            rsl[size] = left[i];
            size++;
        }

        for (int j = rightIndex; j < right.length; j++) {
            rsl[size] = right[j];
            size++;
        }
        return rsl;
    }
}