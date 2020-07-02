package com.qmm.leetcode.simple;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class Simple14 {

    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        String res = "";
        if(strs.length == 0){
            return res;
        }
        int minLength = strs[0].length();

        if(minLength == 0){
            return res;
        }
        String minStr = strs[0];

        char c = minStr.charAt(0);
        for(int i = 1;i<strs.length;i++){
            String subString = strs[i];

            if (subString.length() < minLength) {
                minStr = strs[i];
                minLength = minStr.length();
            }
            if (minLength == 0) {
                return res;
            }
            if(c != subString.charAt(0)){
                return res;
            }
        }

        for(int i = minLength;i>0;i--){
            for(int j= 0;j<strs.length;j++){
                String temp = strs[j].substring(0,i);
                res = minStr.substring(0,i);
                if(!temp.equals(res)){
                    break;
                }
                if(j+1 == strs.length){
                    return res;
                }
            }
        }
        return res;
    }
}
