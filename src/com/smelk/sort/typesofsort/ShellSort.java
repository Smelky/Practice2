package com.smelk.sort.typesofsort;

public class ShellSort {

    public static int[] shellSort(int[] array) {
        int[] arrayForSort;
        arrayForSort = new int[array.length];
        System.arraycopy(array, 0, arrayForSort, 0, array.length);

        int h = 1;
        int n = arrayForSort.length;
        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < arrayForSort.length; i++) {
                for (int j = i; j >= h && arrayForSort[j] > arrayForSort[j - h]; j -= h) {
                    UtilSort.sort(arrayForSort, j, j - h);
                }
            }
            h = h / 3;
        }
        return arrayForSort;
    }
}