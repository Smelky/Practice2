package com.smelk.sort.typesOfSort;

public class BubbleSort {

    public static int[] bubblesort(int[] arrayForSort) {
        for (int i = 0; i < arrayForSort.length - 1; i++)
            for (int j = 0; j < arrayForSort.length - i - 1; j++)
                if (arrayForSort[j] > arrayForSort[j + 1]) {
                    int temp = arrayForSort[j];
                    arrayForSort[j] = arrayForSort[j + 1];
                    arrayForSort[j + 1] = temp;
                }
        return arrayForSort;
    }
}