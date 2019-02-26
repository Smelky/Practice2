package com.smelk.sort.typesOfSort;

public class ShellSort {

    public static int[] shellSort(int[] arrayForSort) {
        int h = 1;
        int n = arrayForSort.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < arrayForSort.length; i++) {
                for (int j = i; j >= h && arrayForSort[j] > arrayForSort[j - h]; j -= h) {
                    int temp = arrayForSort[j];
                    arrayForSort[j] = arrayForSort[j - h];
                    arrayForSort[j - h] = temp;
                }
            }
            h = h / 3;
        }
        return arrayForSort;
    }
}