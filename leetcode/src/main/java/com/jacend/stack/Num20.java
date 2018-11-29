package com.jacend.stack;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 *
 * @author fengxf
 * @since 2018-10-17
 */
public class Num20 {

    public boolean isValid(String s) {
        Stack<Character> left = new Stack<>();
        for (char aChar : s.toCharArray()) {
            if (aChar == '(' || aChar == '[' || aChar == '{') {
                left.push(aChar);
                continue;
            }

            if (left.isEmpty()) {
                return false;
            }

            Character matchC = left.peek();
            if ((matchC == '(' && aChar == ')')
                    || (matchC == '[' && aChar == ']')
                    || (matchC == '{' && aChar == '}')) {
                left.pop();
                continue;
            } else {
                return false;
            }
        }

        return left.isEmpty();
    }

    public static void main(String[] args) {
        Num20 num20 = new Num20();
        System.out.println(num20.isValid("[)]"));
    }
}

