package com.smelk.sort.types.of.sort;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        int[] arrayForSort = new int[array.length];
        System.arraycopy(array, 0, arrayForSort, 0, array.length);
        int key;
        for (int i = 1; i < arrayForSort.length; i++) {
            key = arrayForSort[i];
            int j = i - 1;
            while (j >= 0 && arrayForSort[j] < key) {
                arrayForSort[j + 1] = arrayForSort[j];
                j--;
            }
            arrayForSort[j + 1] = key;
        }
        return arrayForSort;
    }
}