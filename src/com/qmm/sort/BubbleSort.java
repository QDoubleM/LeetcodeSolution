package com.qmm.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {

    }

    public void bubbleSort(int[] a) {
        int length = a.length;
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
