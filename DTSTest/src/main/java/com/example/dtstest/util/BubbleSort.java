package com.example.dtstest.util;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static List bubbleSort(List list) {
        String[] strings = (String[]) list.stream().toArray(String[]::new);
        String temp;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j].compareTo(strings[i]) < 0){
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        List<String> stringList = Arrays.asList(strings);
        return stringList;
    }
}
