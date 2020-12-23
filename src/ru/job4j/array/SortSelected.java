package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {

            //{3, 4, 1, 2, 5}

            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);

            data[index] = data[i];
            data[i] = min;

        }
        return data;
    }
}