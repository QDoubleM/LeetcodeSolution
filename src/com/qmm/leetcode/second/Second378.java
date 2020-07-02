package com.qmm.leetcode.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * 378. 有序矩阵中第K小的元素
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 *
 *
 *
 * 示例：
 *
 * matrix = [
 *    [ 1,  5,  9],
 *    [10, 11, 13],
 *    [12, 13, 15]
 * ],
 * k = 8,
 *
 * 返回 13。
 */
public class Second378 {

    public static void main(String[] args){
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        kthSmallest(matrix,8);
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int res = matrix[0][0];
        if(k == 1){
            return res;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        res = list.get(k-1);
        return res;
    }
}
