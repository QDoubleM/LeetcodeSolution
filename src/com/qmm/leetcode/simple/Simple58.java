package com.qmm.leetcode.simple;

/**
 * 58. 最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 *
 *
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 */
public class Simple58 {

    public static void main(String[] args){
        String s = "   a  as ";
        lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {

        int length = 0;
        //s = s.trim();

       /* for(int i = 0;i<s.length();i++){
            String temp = String.valueOf(s.charAt(i));
            if(" ".equals(temp)){

                length = 0;
            }else {
                length++;

            }
        }*/
       for(int i=s.length()-1;i>=0;i--){
           String temp = String.valueOf(s.charAt(i));
           if(" ".equals(temp) && length>0){
               break;
           }
           if(" ".equals(temp)){
               continue;
           }else {
               length++;
           }
       }
       return length;
    }
}
