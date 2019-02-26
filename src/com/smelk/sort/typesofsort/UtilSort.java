package com.smelk.sort.typesofsort;

public class UtilSort {

    public static void sort(int[] arrayForSort, int firstIndex, int secondIndex) {
        int temp = arrayForSort[firstIndex];
        arrayForSort[firstIndex] = arrayForSort[secondIndex];
        arrayForSort[secondIndex] = temp;
    }
}