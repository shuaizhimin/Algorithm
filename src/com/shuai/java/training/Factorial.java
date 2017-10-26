package com.shuai.java.training;

/**
 * 作者: shuaizhimin
 * 描述: n的阶乘 使用递归实现
 * 日期: 2017-10-26
 * 时间: 16:39
 * 版本:
 */
public class Factorial {
    public static void main(String args[]) {
        System.out.println("Factorial:" + factorial(5));
    }


    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
