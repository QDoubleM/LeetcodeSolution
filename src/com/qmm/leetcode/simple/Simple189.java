package com.qmm.leetcode.simple;

/**
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 */

public class Simple189 {

    public static void rotate(int[] nums, int k) {

        for(int i = 0;i<k;i++){
            int temp = nums[0];
            for(int j = 1;j<nums.length;j++){
                temp = nums[0];
                nums[0] = nums[j];
                nums[j] = temp;
            }
        }
    }

    public static void solution2(int[] nums, int k){
        System.out.println(nums.length/k);

        int index = 0;
        int temp = nums[0];
        for(int i = 0;i<nums.length;i++){
            temp = nums[(index+k)%nums.length];
            nums[(index+k)%nums.length] = nums[0];
            nums[0] = temp;
            index = (index+k)%nums.length;
            if(index == 0){
                break;
            }
        }

    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6};
        //rotate(nums,3);
        solution2(nums,2);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]);
            System.out.print(",");
        }
    }
}
