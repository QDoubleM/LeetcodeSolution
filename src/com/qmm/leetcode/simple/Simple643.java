package com.qmm.leetcode.simple;


/**
 * 643. 子数组最大平均数 I
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 *
 * 示例 1:
 *
 * 输入: [1,12,-5,-6,50,3], k = 4
 * 输出: 12.75
 * 解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 */
public class Simple643 {


    public static void main(String[] args){
        //int[] nums = {1,12,-5,-6,50,3};
        int[] nums = {5};
        findMaxAverage(nums,1);
    }

    public static double findMaxAverage(int[] nums, int k) {
        double avg = 0.0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<=nums.length-k;i++){
            int temp = 0;
            for(int j=i;j<k+i;j++){
                temp = temp+nums[j];
            }
            if(temp>max){
                max = temp;
            }
        }
        avg = (double)max/k;
        return avg;
    }
}
