package com.learn.algorithm.utils;

/**
 * create by shuaizhimin
 * create on 2021/5/3 16:58
 */
public class ListUtils {
    /**
     * 交换数组中两个数字的位置
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int n = arr[i];
        arr[i] = arr[j];
        arr[j] = n;
    }
}
