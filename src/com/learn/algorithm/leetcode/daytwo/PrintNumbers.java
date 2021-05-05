package com.learn.algorithm.leetcode.daytwo;

import java.util.Arrays;

/**
 * create by shuaizhimin
 * create on 2021/5/3 14:04
 * <p>
 * 打印从1 到最大得n位数
 * <p>
 * 1:1-9
 * 2:1-99
 * 3:1-999
 * 返回整个列表打印
 */
public class PrintNumbers {
    public static void main(String args[]) {
        System.out.println("排序之后:" + Arrays.toString(printNumbers(2)));
    }

    /**
     * 多次循环*10 打印
     * @param n
     * @return
     */
    public static int[] printNumbers(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= 10;
        }
        System.out.println(" " + sum);
        int a[] = new int[sum - 1];
        for (int j = 0; j < sum - 1; j++) {
            a[j] = j + 1;
        }
        return a;
    }
}
