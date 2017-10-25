package com.shuai.java.algorithm;

import java.util.Arrays;

/**
 * 作者: shuaizhimin
 * 描述: 快速排序
 * <p>
 * 先从数列中取出一个数作为key值；
 * 将比这个数小的数全部放在它的左边，大于或等于它的数全部放在它的右边；
 * 对左右两个小数列重复第二步，直至各区间只有1个数。
 * <p>
 * 日期: 2017-10-26
 * 时间: 01:38
 * 版本:
 */
public class QuickSort {
    private static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};


    public static void main(String args[]) {
        quickSort(a);
    }

    /**
     * @param a 待排序的数组
     */
    public static void quickSort(int[] a) {
        System.out.println("排序之前:" + Arrays.toString(a) + " length:" + a.length);

        System.out.println("排序之后:" + Arrays.toString(a)+" length:"+a.length);
    }


}
