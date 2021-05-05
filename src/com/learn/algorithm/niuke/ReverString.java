package com.learn.algorithm.niuke;

import java.util.Stack;

/**
 * create by shuaizhimin
 * create on 2021/5/5 2:24
 *
 * 反转字符串
 *
 *
 */
public class ReverString {
    public static String a = "I am a student";

    public static void main(String args[]) {
        System.out.println("排序之后:" + reverString(a));
        System.out.println("排序之后:" + reverString1(a));
    }

    public static String reverString(String a){
        char[] chars=a.toCharArray();
        StringBuilder builder=new StringBuilder();
        for(int i=chars.length-1;i>=0;i--){
            char c=chars[i];
            builder.append(c);
        }
        return builder.toString();
    }

    /**
     * 使用
     * @param a
     * @return
     */
    public static String reverString1(String a){
        Stack stack=new Stack();
        char[] chars=a.toCharArray();
        StringBuilder builder=new StringBuilder();
        for(char c:chars){
            stack.push(c);
        }
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }
        return builder.toString();
    }


}
