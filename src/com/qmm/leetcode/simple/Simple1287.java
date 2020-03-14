package com.qmm.leetcode.simple;

import java.sql.SQLOutput;

/**
 * 1287. 有序数组中出现次数超过25%的元素
 * 给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。
 *
 * 请你找到并返回这个整数
 *
 *
 *
 * 示例：
 *
 * 输入：arr = [1,2,2,6,6,6,6,7,10]
 * 输出：6
 *
 *
 * 提示：
 *
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^5
 */
public class Simple1287 {

    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,3,3};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int tempCount = 1;
        int index = 0;
        int maxCount = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                tempCount++;
                if(tempCount>maxCount){
                    maxCount = tempCount;
                    index = i;
                }
            }else {
                tempCount = 1;
            }
        }
        return arr[index];
    }
}
