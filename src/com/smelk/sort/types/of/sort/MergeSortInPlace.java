package com.smelk.sort.types.of.sort;

import java.util.Arrays;

public class MergeSortInPlace {

    private static void merge(int arr[], int start, int mid, int end) {

        int start2 = mid + 1;

        if (arr[mid] <= arr[start2]) {
            return;
        }

        while (start <= mid && start2 <= end) {

            if (arr[start] <= arr[start2]) {
                start++;
            } else {
                int value = arr[start2];
                int index = start2;

                while (index != start) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[start] = value;

                start++;
                mid++;
                start2++;
            }
        }
    }

    public static void copyOfArrayForMergeSort(int[] array) {
        int[] arr = new int[array.length];
        System.arraycopy(array, 0, arr, 0, array.length);
        System.out.println("Merge Sort In Place: " + Arrays.toString(mergeSort(arr, 0, array.length - 1)));
    }

    public static int[] mergeSort(int arr[], int l, int r) {

        if (l < r) {

            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
        return arr;
    }
}