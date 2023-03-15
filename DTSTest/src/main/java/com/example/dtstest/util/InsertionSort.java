package com.example.dtstest.util;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static List insertionSort(List list) {
        String[] strings = (String[]) list.stream().toArray(String[]::new);
        int i,j;
        String key;
        for (j = 1; j < strings.length; j++) {
            key = strings[j];
            i = j - 1;
            while (i >= 0) {
                if (key.compareTo(strings[i]) > 0) {//here too
                    break;
                }
                strings[i + 1] = strings[i];
                i--;
            }
            strings[i + 1] = key;
        }

        List<String> stringList = Arrays.asList(strings);
        return stringList;
    }
}
