package com.qmm.leetcode.simple;

/**
 * 371. 两整数之和
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 *
 * 示例 1:
 *
 * 输入: a = 1, b = 2
 * 输出: 3
 * 示例 2:
 *
 * 输入: a = -2, b = 3
 * 输出: 1
 * https://leetcode-cn.com/problems/sum-of-two-integers/
 */
public class Simple371 {
    public static void main(String[] args){
        System.out.println(getSum(-2,-3));
    }

    public static int getSum(int a, int b) {
        return b == 0 ? a : getSum(a^b,(a&b)<<1);
    }
}
