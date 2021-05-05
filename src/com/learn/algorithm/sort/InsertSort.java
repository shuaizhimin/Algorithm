package com.learn.algorithm.sort;

import java.util.Arrays;

/**
 * create by shuaizhimin
 * create on 2021/4/20 3:34
 * 插入排序
 * 将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，
 * 直至整个序列有序为止。
 * 要点：设立哨兵，作为临时存储和判断数组边界之用
 */
public class InsertSort {
    private static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    public static void main(String args[]) {
        System.out.println("排序之前:" + Arrays.toString(a));
        insertSort(a);
        System.out.println("排序之后:" + Arrays.toString(a));
    }
    public static void insertSort(int a[]){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
    public static void sort(int[] a) {

    }
}
