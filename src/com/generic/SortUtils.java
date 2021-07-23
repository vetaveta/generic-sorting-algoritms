package com.generic;

class SortUtils {
    private SortUtils() {
    }

    public static void insertionSort(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            Comparable  current = array[i];
            int j = i;
            while (j > 0 && current.compareTo(array[j - 1])>0) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }

    public static void quickSort(Comparable[] arr, int first, int last) {
        if (first < last) {
            int dividerIndex = partition(arr, first, last);
            quickSort(arr, first, dividerIndex - 1);
            quickSort(arr, dividerIndex, last);
        }
    }

    private static int partition(Comparable[] arr, int first, int last) {
        int rightIndex = last;
        int leftIndex = first;
        Comparable pivot = arr[first];
        while (leftIndex <= rightIndex) {
            while (arr[leftIndex].compareTo(pivot)<0) {
                leftIndex++;
            }
            while (arr[rightIndex].compareTo(pivot)>0) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(Comparable[] arr, int left, int right) {
        Comparable temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void quickSort(Comparable[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

}
