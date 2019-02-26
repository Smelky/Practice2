package com.smelk.sort.types.of.sort;

public class UtilSort {

    public static void swap(int[] arrayForSort, int firstIndex, int secondIndex) {
        int temp = arrayForSort[firstIndex];
        arrayForSort[firstIndex] = arrayForSort[secondIndex];
        arrayForSort[secondIndex] = temp;
    }
}