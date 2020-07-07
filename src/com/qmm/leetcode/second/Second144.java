package com.qmm.leetcode.second;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 *  示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 */
public class Second144 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        /*if (root != null) {
            list.add(root.val);
            if (root.left != null) {
                preorderTraversal(root.left);
            }
            if (root.right != null) {
                preorderTraversal(root.right);
            }
        }
        return list;*/
        List<Integer> res = new ArrayList<>();
        // 判断非空
        if(null == root){
            return res;
        }
        // 使用双端队列
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.removeLast();
            res.add(node.val);
            // 要先加右孩子、再加左孩子
            if(null != node.right){
                stack.add(node.right);
            }
            if(null != node.left){
                stack.add(node.left);
            }
        }
        return res;
    }
}
