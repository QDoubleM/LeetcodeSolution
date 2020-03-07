package com.qmm.leetcode.simple;

/**
 * 输入：
 * ["a","a","b","b","c","c","c"]
 *
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 *
 * 说明：
 * "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-compression
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Simple443 {
    public  static void main(String[] args){

        char[] c = new char[]{'a','a','b','b','c','c','c'};
        compress(c);
    }

    public static int compress(char[] chars) {

        int i = 0,j = 0,len = 0;
        while(j < chars.length){
            if(chars[i] == chars[j]){
                j++;
            }
            if(j == chars.length || chars[i] != chars[j]){
                int count = j - i;
                chars[len++] = chars[i];
                if(count > 1) {// 出现一次以上才会将次数添加进去
                    int div = 1000;// 确认该字母出现次数的数量级
                    while (count / div == 0) {
                        div /= 10;
                    }
                    while (div > 0) {//不能使用 count 作为结束条件，如果 count = 10，就会出错。
                        chars[len++] = (char) (count / div + '0');
                        count = count % div;
                        div /= 10;
                    }
                }
                i = j;
            }
        }
        return len;
    }
}
