package com.qmm.leetcode.simple;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Simple20 {
    public static void main(String[] args){
        String s = "()";
        boolean res = isValid(s);
        System.out.println(res);
    }
    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        if(s.length() == 0){
            return true;
        }
        stack.push(String.valueOf(s.charAt(0)));
        for(int i = 1;i<s.length();i++){
            String input = String.valueOf(s.charAt(i));
            if(stack.isEmpty()){
                stack.push(input);
            }else {
                String target = stack.pop();
                if((input.equals(")")&&target.equals("(") )||(input.equals("}")&&target.equals("{") ) || (input.equals("]")&&target.equals("[") ) ){
                    continue;
                }else {
                    stack.push(target);
                    stack.push(input);
                }
            }

        }

        return stack.isEmpty();
    }
}
