package com.shuai.java.training;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 作者: shuaizhimin
 * 描述:
 * 两个有序数组合并成一个数组并保证顺序
 * 日期: 2017-10-31
 * 时间: 18:32
 * 版本:
 */
public class ArrayMerge {

    public static void main(String args[]) {
        int[] arrA = {1, 3, 5, 7, 8, 9, 11, 12};
        int[] arrB = {2, 4, 6, 8, 10, 12, 13};

        ArrayList<Integer> arrList = mergeArrays(arrA, arrB);
        for (Integer intItem : arrList) {
            System.out.println(intItem);
        }
    }


    /**
     * 数组组合
     *
     * @param a
     * @param b
     */
    public static ArrayList<Integer> mergeArrays(int a[], int b[]) {
        int aLength = a.length;
        int bLength = b.length;
        ArrayList<Integer> resultArray = new ArrayList<>();
        int i = 0, j = 0;
        while (i < aLength || j < bLength) {
            if (i == aLength && j < bLength) {
                resultArray.add(b[j]);
                j++;
            } else if (i < aLength && j == bLength) {
                resultArray.add(a[i]);
                i++;
            } else {
                if (a[i] <= b[j]) {
                    resultArray.add(a[i]);
                    i++;
                } else if (a[i] > b[j]) {
                    resultArray.add(b[j]);
                    j++;
                }
            }
        }
        return resultArray;
    }

}
