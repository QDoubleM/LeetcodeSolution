package com.qmm.leetcode.simple;

import java.util.Arrays;

/**
 * 108. 将有序数组转换为二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */
public class Simple108 {

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args){

        int[] nums = {-10,-3,0,5,9};
        sortedArrayToBST(nums);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {

        TreeNode treeNode = null;
        if(nums.length == 0){
            return treeNode;
        }
        if(nums.length == 1){
            treeNode = new TreeNode(nums[0]);
            return treeNode;
        }
        int mid = nums.length/2;
        treeNode = new TreeNode(nums[mid]);
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid+1,nums.length);
        treeNode.left = sortedArrayToBST(left);
        treeNode.right = sortedArrayToBST(right);
        return treeNode;
    }

}
