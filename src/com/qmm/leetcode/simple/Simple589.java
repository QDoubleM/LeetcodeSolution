package com.qmm.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 *          1

 *    3     2     4
 *
 *  5   6
 *
 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
public class Simple589 {

    private class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args){

    }

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.add(root.val);
        addVal(list,root);
        return list;
    }

    private static void addVal(List<Integer> list,Node root){
        if(root.children == null || root.children.size() == 0){
            return;
        }else {
            for(int i = 0;i<root.children.size();i++){
                list.add(root.children.get(i).val);
                addVal(list,root.children.get(i));
            }
        }
    }
}
