package com.qmm.leetcode.simple;

/**
 * 434. 字符串中的单词数
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 */
public class Simple434 {

    public static void main(String[] args){
        countSegments("Hello, my name is John");
    }

    public static int countSegments(String s) {
        int res = 0;
        if(s.length() == 0){
            return 0;
        }
        s.trim();
        s = s+" ";
        for(int i = 1;i<s.length();i++){
            if(" ".equals(String.valueOf(s.charAt(i))) && !" ".equals(String.valueOf(s.charAt(i-1))) ){
                res++;
            }
        }
        return res;
    }
}
