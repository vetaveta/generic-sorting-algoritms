package com.generic;

import java.util.List;

class SortUtils {
    private SortUtils() {
    }

    public static <T extends Comparable> void insertionSort(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
           T  current = (T) list.get(i);
            int j = i;
            while (j > 0 && current.compareTo(list.get(j-1))>0) {
                Comparable set = list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, current);
        }
    }

    public static <T extends Comparable> void quickSort(List<T> list, int first, int last) {
        if (first < last) {
            int dividerIndex = partition(list, first, last);
            quickSort(list, first, dividerIndex - 1);
            quickSort(list, dividerIndex, last);
        }
    }

    private static <T extends Comparable> int partition(List<T> list, int first, int last) {
        int rightIndex = last;
        int leftIndex = first;
        T pivot = (T) list.get(first);
        while (leftIndex <= rightIndex) {
            while (list.get(leftIndex).compareTo(pivot)<0) {
                leftIndex++;
            }
            while (list.get(rightIndex).compareTo(pivot)>0) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(list, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static <T extends Comparable> void swap(List<T> list, int left, int right) {
          T temp = (T) list.get(left);
        list.set(left, list.get(right));
        list.set(right, (T) temp);
    }
    public static  <T extends Comparable> void quickSort(List<T> list) {
        quickSort(list, 0, list.size() - 1);
    }

}
