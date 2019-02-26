package com.smelk.sort;

import com.smelk.sort.typesofsort.BubbleSort;
import com.smelk.sort.typesofsort.InsertionSort;
import com.smelk.sort.typesofsort.MergeSortInPlace;
import com.smelk.sort.typesofsort.SelectionSort;
import com.smelk.sort.typesofsort.ShellSort;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        int[] arrayForSort = {1, 5, 1, 2, 8, 6, 2};
        System.out.println("Bubble Sort: " + Arrays.toString(BubbleSort.bubblesort(arrayForSort)));
        System.out.println("Insertion Sort: " + Arrays.toString(InsertionSort.insertionSort(arrayForSort)));
        MergeSortInPlace.copyOfArrayForMergeSort(arrayForSort);
        System.out.println("Selection Sort : " + Arrays.toString(SelectionSort.selectionSort(arrayForSort)));
        System.out.println("Shell Sort: " + Arrays.toString(ShellSort.shellSort(arrayForSort)));

    }
}