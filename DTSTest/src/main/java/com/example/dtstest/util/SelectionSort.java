package com.example.dtstest.util;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static List selectionSort(List list)
    {
        String[] strings = (String[]) list.stream().toArray(String[]::new);

        int n = strings.length;
        for(int i = 0; i < n - 1; i++)
        {

            int minIndex = i;
            String minStr = strings[i];
            for(int j = i + 1; j < n; j++)
            {
                if(strings[j].compareTo(minStr) < 0)
                {
                    minStr = strings[j];
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                String temp = strings[minIndex];
                strings[minIndex] = strings[i];
                strings[i] = temp;
            }
        }

        List<String> stringList = Arrays.asList(strings);
        return stringList;
    }
}
