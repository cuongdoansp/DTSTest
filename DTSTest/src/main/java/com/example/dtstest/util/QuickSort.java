package com.example.dtstest.util;

import java.util.List;

public class QuickSort {

    private String[] strings;

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    private int length;

    public void sort(String[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        this.strings = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.strings[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.strings[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.strings[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.strings[i];
        this.strings[i] = this.strings[j];
        this.strings[j] = temp;
    }
}
