package com.smelk.sort.typesOfSort;

public class InsertionSort {

    public static int[] insertionSort(int[] arrayForSort) {
        int key;
        for (int i = 1; i < arrayForSort.length; i++) {
            key = arrayForSort[i];
            int j = i - 1;
            while (j >= 0 && arrayForSort[j] < key) {
                arrayForSort[j + 1] = arrayForSort[j];
                j = j - 1;
            }
            arrayForSort[j + 1] = key;
        }
        return arrayForSort;
    }
}