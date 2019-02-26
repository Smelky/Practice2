package com.smelk.sort.typesOfSort;

public class SelectionSort {

    public static int[] selectionSort(int[] arrayForSort) {
        for (int i = 0; i < arrayForSort.length; i++) {

            int min = arrayForSort[i];
            int min_i = i;

            for (int j = i + 1; j < arrayForSort.length; j++) {

                if (arrayForSort[j] < min) {
                    min = arrayForSort[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arrayForSort[i];
                arrayForSort[i] = arrayForSort[min_i];
                arrayForSort[min_i] = tmp;
            }
        }
        return arrayForSort;
    }
}