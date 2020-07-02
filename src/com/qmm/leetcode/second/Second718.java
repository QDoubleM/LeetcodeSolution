package com.qmm.leetcode.second;

import java.util.ArrayList;
import java.util.List;

/**
 * 718. 最长重复子数组
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 *
 *
 *
 * 示例：
 *
 * 输入：
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出：3
 * 解释：
 */
public class Second718 {

    public static void main(String[] args){
        //[0,0,0,0,0,0,1,0,0,0]
        //[0,0,0,0,0,0,0,1,0,0]
        int[] A = {0,0,0,0,0,0,1,0,0,0};
        int[] B = {0,0,0,0,0,0,0,1,0,0};
        findLength(A,B);

    }

    public static int findLength(int[] A, int[] B) {
        int max = 0;
        if(A.length == 0 || B.length == 0){
            return 0;
        }
        int[][] res = new int[A.length+1][B.length+1];
        for(int i = 1; i <= A.length; i++) {
            for(int j = 1; j <= B.length; j++) {
                if(A[i-1] == B[j-1]) {
                    res[i][j] = res[i-1][j-1]+1;
                    max = Math.max(max, res[i][j]);
                }
            }
        }
        return max;
    }

}
