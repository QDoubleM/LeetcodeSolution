package com.qmm.leetcode.simple;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

public class Simple9 {

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int x1 = x;
        int x2 = 0;

        while(x1 != 0){
            x2 = x2*10 + x1%10;
            x1 = x1/10;
        }
        return x==x2;
    }
}
