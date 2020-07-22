package com.qmm.sort;

/**
 * 简单选择排序
 */
public class SelectSort {

    public static void main(String[] args) {

    }

    public void selectSort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {//循环次数
            int key = a[i];
            int position = i;
            for (int j = i + 1; j < length; j++) {//选出最小的值和位置
                if (a[j] < key) {
                    key = a[j];
                    position = j;
                }
            }
            a[position] = a[i];//交换位置
            a[i] = key;
        }
    }
}
