package com.learn.algorithm.sort;

import java.util.Arrays;

/**
 * create by shuaizhimin
 * create on 2021/4/18 23:09
 * <p>
 * 冒泡排序
 * 遍历沉底
 */
public class BubbleSort {
    private static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    public static void main(String args[]) {
        System.out.println("排序之前:" + Arrays.toString(a));
        bubbleSort(a);
        System.out.println("排序之后:" + Arrays.toString(a));
    }

    public static void bubbleSort(int a[]) {

        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("i:" + i);
            //跟后面数字比较
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    //交换位置
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }

        }


    }
}
