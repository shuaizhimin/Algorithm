package com.learn.algorithm.niuke;

import java.util.Arrays;

/**
 * create by shuaizhimin
 * create on 2021/5/5 1:49
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数
 */
public class FindOne {
    //11
    public static int a = 11;

    public static void main(String args[]) {

        System.out.println("排序之后:" + findOne(a));
    }

    public static int findOne(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >>> 1;
        }

        return count;
    }
}
