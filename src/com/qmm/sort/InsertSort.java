package com.qmm.sort;


/**
 * 1.直接插入排序
 */
public class InsertSort {

    public static void main(String[] args){
        int[] a = {32,43,13,2,5};
        insertSort(a);
    }

    public static void insertSort(int[] a){
        int length = a.length;//数组长度，将这个提取出来是为了提高速度。
        int insertNum;//要插入的数

        for (int i = 1; i < length; i++) {
            insertNum = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > insertNum) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = insertNum;
        }
    }

}
