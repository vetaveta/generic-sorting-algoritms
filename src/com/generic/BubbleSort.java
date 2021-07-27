package com.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort{
    public static void bubbleSort(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j].compareTo(array[j+1])>0) {
                    Comparable temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static <T extends Comparable> void bubbleSort(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if (list.get(j).compareTo(list.get(j+1))>0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j,list.get(j+1));
                    list.set(j + 1, temp);
                    list.set(j+1,temp);
                }
            }
        }
    }
}
