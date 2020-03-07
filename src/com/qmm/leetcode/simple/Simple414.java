package com.qmm.leetcode.simple;

/**
 * 414. 第三大的数
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 *
 * 示例 1:
 *
 * 输入: [3, 2, 1]
 *
 * 输出: 1
 *
 * 解释: 第三大的数是 1.
 * 示例 2:
 *
 * 输入: [1, 2]
 *
 * 输出: 2
 *
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 *
 * 输入: [2, 2, 3, 1]
 *
 * 输出: 1
 *
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
public class Simple414 {

    public static void main(String[] args){
        int[] nums = {1,-2147483648,2};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return nums[0]>=nums[1]?nums[0]:nums[1];
        }
        int max = nums[0];
        int secondMax = nums[0];
        int thirdMax = nums[0];
        boolean hasGetScond = false;
        boolean hasGetThird = false;
        for(int i = 1;i<nums.length;i++){
            int temp = nums[i];

            if(!hasGetScond){
                if(temp == max){
                    continue;
                }else {
                    hasGetScond = true;
                    if(temp>max){
                        secondMax = max;
                        max = temp;
                    }else {
                        secondMax = temp;
                    }
                }
            }else {
                if(!hasGetThird){
                    if(temp == max || temp == secondMax){
                        continue;
                    }
                    if(temp>max){
                        thirdMax = secondMax;
                        secondMax = max;
                        max = temp;
                        hasGetThird = true;
                    }else if(temp>secondMax){
                        thirdMax = secondMax;
                        secondMax = temp;
                        hasGetThird = true;
                    }else {
                        thirdMax = temp;
                        hasGetThird = true;
                    }
                }else {
                    if(temp == max || temp == secondMax || temp == thirdMax){
                        continue;
                    }
                    if(temp>max){
                        thirdMax = secondMax;
                        secondMax = max;
                        max = temp;
                    }else if(temp>secondMax){
                        thirdMax = secondMax;
                        secondMax = temp;
                    }else if(temp>thirdMax && temp !=  thirdMax){
                        thirdMax = temp;
                    }else {
                        continue;
                    }
                }
            }


        }
        return hasGetThird?thirdMax:max;
    }
}
