package com.shuai.java.algorithm;

import java.util.Arrays;

/**
 * 作者: shuaizhimin
 * 描述: 冒泡排序
 * 日期: 2017-10-26
 * 时间: 14:11
 * 版本:
 */
public class BubbleSort {
    private static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    public static void main(String args[]) {
        bubbleSort(a);
    }


    public static void bubbleSort(int a[]) {
        System.out.println("排序之前:" + Arrays.toString(a) + " length:" + a.length);
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            //这里-i主要是每遍历一次都把最大的i个数沉到最底下去了，没有必要再替换了
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("排序之后:" + Arrays.toString(a) + " length:" + a.length);
    }

}
