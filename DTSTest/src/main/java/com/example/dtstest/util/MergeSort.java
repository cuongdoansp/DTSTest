package com.example.dtstest.util;

public class MergeSort {

    public static void mergeSort(String[] strings, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        // sort the first and the second half
        mergeSort(strings, from, mid);
        mergeSort(strings, mid + 1, to);
        merge(strings, from, mid, to);
    }// end mergeSort
//work

    public static void merge(String[] strings, int from, int mid, int to) {
        int n = to - from + 1;
        String[] b = new String[n];
        int i1 = from;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= to) {
            if (strings[i1].compareTo(strings[i2]) < 0) {
                b[j] = strings[i1];
                i1++;
            } else {
                b[j] = strings[i2];
                i2++;
            }
            j++;
        }
        while (i1 <= mid) {
            b[j] = strings[i1];
            i1++;
            j++;
        }

        while (i2 <= to) {
            b[j] = strings[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            strings[from + j] = b[j];
        }
    }

}

