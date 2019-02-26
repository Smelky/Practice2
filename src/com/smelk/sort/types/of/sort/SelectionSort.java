package com.smelk.sort.types.of.sort;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        int[] arrayForSort = new int[array.length];
        System.arraycopy(array, 0, arrayForSort, 0, array.length);

        for (int i = 0; i < arrayForSort.length; i++) {

            int min = arrayForSort[i];
            int minIndex = i;

            for (int j = i + 1; j < arrayForSort.length; j++) {

                if (arrayForSort[j] < min) {
                    min = arrayForSort[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                UtilSort.swap(arrayForSort, i, minIndex);
            }
        }
        return arrayForSort;
    }
}