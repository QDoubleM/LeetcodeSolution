package com.qmm.leetcode.second;

import java.util.Arrays;

/**
 * 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
 *
 * 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
 *
 * 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
 *
 * 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
 *
 * 示例：
 *
 * 输入: words = ["time", "me", "bell"]
 * 输出: 10
 * 说明: S = "time#bell#" ， indexes = [0, 2, 5] 。
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/short-encoding-of-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Second820 {

    public static void main(String[] args){

        String[] words = new String[]{"time", "me", "bell"};
        //String[] words = new String[]{"me", "time"};
        int a = minimumLengthEncoding(words);
        System.out.println(a);
    }

    public static int minimumLengthEncoding(String[] words) {
        String s = "";
        Arrays.sort(words, (a, b) -> (a.length() == b.length() ? 0 : (a.length() <= b.length() ? 1 : -1)) );
        for(int i=0;i<words.length; i++){
            if(!s.contains(words[i]+"#")){
                s = s+words[i]+"#";
            }
        }
        return s.length();
    }
}
