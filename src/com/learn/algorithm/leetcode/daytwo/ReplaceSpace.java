package com.learn.algorithm.leetcode.daytwo;

/**
 * create by shuaizhimin
 * create on 2021/5/2 13:47
 * 把字符串 s 中的每个空格替换成"%20"
 */
public class ReplaceSpace {
    public static String s = "We are happy.";
    public static String c = "我 是 happy.";

    public static void main(String args[]) {
        System.out.println("排序之后:" + replaceSpace(s));
        System.out.println("排序之后:" + replaceSpace(c));
    }


    public static String replaceSpace(String s) {
        int length = s.length();
        char[] a = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                a[size++] = '%';
                a[size++] = '2';
                a[size++] = '0';
            } else {
                a[size++] = c;
            }
        }
        String newStr = new String(a, 0, size);
        return newStr;
    }
}
