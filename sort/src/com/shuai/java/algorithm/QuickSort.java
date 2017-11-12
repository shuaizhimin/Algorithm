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
        //quickSort(a, 0, a.length - 1);
        sort(a, 0, a.length - 1);
        System.out.println("排序之后:" + Arrays.toString(a) + " length:" + a.length);
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) { //如果不加这个判断递归会无法退出导致堆栈溢出异常
            int middle = getMiddle(a, low, high);
            quickSort(a, 0, middle - 1);
            quickSort(a, middle + 1, high);
        }
    }


    private static int getMiddle(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high) {
            while (low < high && a[high] >= temp)
                high--;
            a[low] = a[high];
            while (low < high && a[low] <= temp)
                low++;
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }


    public static void sort(int a[], int low, int high) {
        int start = low;
        int end = high;
        int tmp = a[low];
        while (end > start) {
            while (end > start && a[end] > tmp)
                end--;
            //当后面的大于start 交换位置
            if (a[end] <= tmp) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }

            while (end > start && a[start] <= tmp)
                start++;
            if (a[start] >= tmp) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        if (start > low) sort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if (end < high) sort(a, end + 1, high);//右边序列。从关键值索引+1到最后一个
    }

    public static void change(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


}
