package com.qmm.leetcode.simple;

/**
 * 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 *
 *
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 */
public class Simple543 {

    public static void main(String[] args){

    }

    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        getLength(root);
        return max;
    }

    public int getLength(TreeNode root){
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 0;
        }else {
            int leftSize = root.left == null? 0: getLength(root.left) + 1;
            int rightSize = root.right == null? 0: getLength(root.right) + 1;
            max = Math.max(max, leftSize + rightSize);
            return Math.max(leftSize, rightSize);
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

}
