package com.learn.algorithm.leetcode;

import java.util.Arrays;

/**
 * create by shuaizhimin
 * create on 2021/4/27 17:08
 * 整数反转
 */
public class IntegerCov {
    private static int a = 692812;

    public static void main(String args[]) {
        System.out.println("排序之后:" + reverseSelf(a));
    }

    public static int reverseSelf(int x) {
        int res = 0;
        while (x != 0) {
            //每次取出末尾数字
            int tmp = x % 10;
            //判断是否 大于 最大32位整数
            if (res > Integer.MAX_VALUE || (res == Integer.MAX_VALUE && tmp > 7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res < Integer.MIN_VALUE || (res == Integer.MIN_VALUE && tmp < -8)) {
                return 0;
            }
            //反转的数字
            res = res * 10 + tmp;
            //左移x
            x /= 10;
        }
        return res;
    }


    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            //每次取末尾数字
            int tmp = x % 10;
            //判断是否 大于 最大32位整数
            if (res > 214748364 || (res == 214748364 && tmp > 7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res < -214748364 || (res == -214748364 && tmp < -8)) {
                return 0;
            }
            //获取最终数据*10+末尾数字
            res = res * 10 + tmp;
            //反转每次x/10
            x /= 10;
        }
        return res;
    }


}
