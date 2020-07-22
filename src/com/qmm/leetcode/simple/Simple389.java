package com.qmm.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 */
public class Simple389 {

    public static void main(String[] args){
        System.out.println(findTheDifference("abcd","abcde"));
    }

    public static char findTheDifference(String s, String t) {
        char res = t.charAt(t.length()-1);
//        for(int i=0; i<s.length(); i++){
//            res ^= s.charAt(i);
//            res ^= t.charAt(i);
//        }

        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(String.valueOf(t.charAt(i)))){
                map.put(String.valueOf(t.charAt(i)),map.get(String.valueOf(t.charAt(i)))+1);
            }else {
                map.put(String.valueOf(t.charAt(i)),1);
            }
        }
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(String.valueOf(s.charAt(i)))){
                map.put(String.valueOf(s.charAt(i)),map.get(String.valueOf(s.charAt(i)))-1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>0){
                return entry.getKey().charAt(0);
            }
        }
        return res;
    }
}
