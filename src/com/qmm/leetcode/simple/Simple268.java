package com.qmm.leetcode.simple;


import java.util.ArrayList;
import java.util.List;

/**
 * 268. 缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 */
public class Simple268 {

    public static void main(String[] args){

        //[9,6,4,2,3,5,7,0,1]
        int[] nums = {9,6,4,2,3,5,7,0,1};
        missingNumber(nums);
    }

    public static int missingNumber(int[] nums) {
        int res = -1;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<=nums.length;i++){
            list.add(null);
        }
        for(int i = 0;i<nums.length;i++){
            list.set(nums[i],nums[i]);
        }
        for(int i = 0;i<list.size();i++){
            if(list.get(i) == null){
                res = i;
                break;
            }
        }

        return res;
    }
}
