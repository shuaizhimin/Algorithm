package com.learn.algorithm.sort;

import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * create by shuaizhimin
 * create on 2021/4/18 23:50
 * <p>
 * 快速排序
 * <p>
 * 先从数列中取出一个数作为key值；
 * 将比这个数小的数全部放在它的左边，大于或等于它的数全部放在它的右边；
 * 对左右两个小数列重复第二步，直至各区间只有1个数。
 * </p>
 */
public class QuickSort {
    private static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    public static void main(String args[]) {
        quickSort(a);
    }

    public static void quickSort(int[] a) {
        System.out.println("排序之前:" + Arrays.toString(a));
        sort(a, 0, a.length - 1);
        System.out.println("排序之后:" + Arrays.toString(a));
    }





    public static void sort(int a[], int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];

        while (end > start) {
            //从后半部分向前扫描 后面的大于low下标值 low下标前移
            //后面的值大于key 往前移动high下标
            while (end > start && a[end] > key) {
                end--;
            }
            //后面的值小于key 交换位置
            if (a[end] < key) {
                swap(a, end, start);
            }
            //从前半部分向后扫描 后面的大于start下标值 start下表后移
            //后面的值大于key 往后移动start下标
            while (end > start && a[start] <= key) {
                start++;
            }
            if (a[start] > key) {
                swap(a, start, end);
            }
        }
        //左边序列 第一个索引位置到关键值索引-1
        if (start > low) {
            sort(a, low, start - 1);
        }
        //右边序列 从关键值索引+1到最后一个
        if (end < high) {
            sort(a, end + 1, high);
        }

    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int n = arr[i];
        arr[i] = arr[j];
        arr[j] = n;
    }
}
