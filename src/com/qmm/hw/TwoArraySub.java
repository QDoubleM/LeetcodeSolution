package com.qmm.hw;

/**
 * 两个数组分别求和，返回两个和相减的绝对值；两个数组值可以交换
 */
public class TwoArraySub {
    public static void main(String[] args) {
        int[] aa = {2, 5, 4, 3, 1, 0};
        int[] bb = {7, 9, 8, 10, 6, 11};
        exchange(aa, bb);

    }

    static void exchange(int[] a, int[] b) {

        int n = a.length;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            diff += a[i] - b[i];//计算两组数的差
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tp = a[i] - b[j];//计算两组数中单个元素的差值
                int t = tp - diff;//单个元素差值和数组的差值比较
                if (t * tp < 0) {    //以此条件判断是否需要交换
                    int ex = a[i];
                    a[i] = b[j];
                    b[j] = ex;
                    diff -= 2 * tp;//计算数据交换后两个数组的差值
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " " + b[i]);
        }

    }
}