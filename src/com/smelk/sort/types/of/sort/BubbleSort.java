package com.smelk.sort.types.of.sort;

public class BubbleSort {

    public static int[] bubblesort(int[] array) {
        int[] arrayForSort = new int[array.length];
        System.arraycopy(array, 0, arrayForSort, 0, array.length);
        for (int i = 0; i < arrayForSort.length - 1; i++)
            for (int j = 0; j < arrayForSort.length - i - 1; j++)
                if (arrayForSort[j] > arrayForSort[j + 1]) {
                    UtilSort.swap(arrayForSort, j, j + 1);
                }
        return arrayForSort;
    }
}