package com.learn.algorithm.sort;

import java.util.Arrays;

/**
 * create by shuaizhimin
 * create on 2021/4/19 3:51
 * 简单选择排序
 * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；
 * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，
 * 依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止
 */
public class SimpleSelectSort {
    private static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    public static void main(String args[]) {
        System.out.println("排序之前:" + Arrays.toString(a));
        simpleSelectSort(a);
        System.out.println("排序之后:" + Arrays.toString(a));
    }

    public static void simpleSelectSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int n = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    n = j;
                }
            }
            //当前的数值赋予最小的位置上
            a[n] = a[i];
            //最小的数值赋予当前位置上
            a[i] = min;
        }

    }
}
