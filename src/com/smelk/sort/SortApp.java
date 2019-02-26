package com.smelk.sort;

import com.smelk.sort.typesOfSort.*;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        int[] arrayForSort = {1, 5, 1, 2, 8, 6, 2};
        System.out.println("Bubble Sort: " + Arrays.toString(BubbleSort.bubblesort(arrayForSort)));
        System.out.println("Insertion Sort: " + Arrays.toString(InsertionSort.insertionSort(arrayForSort)));
        System.out.println("Merge Sort In Place: " + Arrays.toString(MergeSortInPlace.mergeSort(arrayForSort, 0, arrayForSort.length - 1)));
        System.out.println("Selection Sort : " + Arrays.toString(SelectionSort.selectionSort(arrayForSort)));
        System.out.println("Shell Sort: " + Arrays.toString(ShellSort.shellSort(arrayForSort)));

    }
}