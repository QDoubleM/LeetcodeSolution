package com.qmm.leetcode.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 示例:
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 输出:
 * [5,6]
 */
public class Simple448 {

    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>(nums.length);
        for(int i = 0;i<nums.length;i++){
            res.add(null);
        }
        for(int i = 0;i<nums.length;i++){
            if(res.get(nums[i]-1) == null){
                res.set(nums[i]-1,nums[i]);
            }else {
                continue;
            }
        }
        for(int i = 0;i<res.size();i++){
            if(res.get(i) == null){
                res.set(i,i+1);
            }else {
                res.set(i,null);
            }
        }
        Iterator<Integer> i = res.iterator();
        while (i.hasNext() ) {
            Integer item = i.next();
            if (item == null) {
                //这里调用迭代器的rermove方法而不是集合的remove方法
                i.remove();
            }
        }
        return res;

    }
}
