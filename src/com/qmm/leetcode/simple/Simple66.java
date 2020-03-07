package com.qmm.leetcode.simple;

/**
 * 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 */

public class Simple66 {
    public static int[] plusOne(int[] digits) {

        boolean needPuls = true;
        for(int i=digits.length-1;i>=0 ; i--){
            if(needPuls ){
                if(digits[i] == 9){
                    //res[i+1] = 0;
                    digits[i] = 0;
                    needPuls = true;
                }else {
                    digits[i] = digits[i]+1;
                    needPuls = false;
                }
            }else {
                break;
            }
        }
        if(digits[0] == 0){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3};
        int[] r = plusOne(a);
        for(int i = 0;i<r.length;i++){
            System.out.print(r[i]);
            System.out.print(",");
        }
    }

}
