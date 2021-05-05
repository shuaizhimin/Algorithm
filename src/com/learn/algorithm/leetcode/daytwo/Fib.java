package com.learn.algorithm.leetcode.daytwo;

/**
 * create by shuaizhimin
 * create on 2021/5/2 23:59
 * 斐波那契数列
 * f(n + 1) = f(n) + f(n - 1)
 */
public class Fib {

    /**
     * 递归法
     * 缺点多次递归
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n) + fib(n - 1);
    }


    public int fib2(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

}
