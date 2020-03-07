package com.qmm.leetcode.simple;

public class Simple7 {

    public static int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }

    public static void main(String[] args){
        int x = 123;
        int res = reverse(x);
        System.out.println("main:"+x/10);
        System.out.println("main:"+x%10);
        System.out.println("main:"+res);
    }
}
