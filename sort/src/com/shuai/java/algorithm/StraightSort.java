package com.shuai.java.algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 作者: shuaizhimin
 * 描述: 直接插入排序
 * <p>
 * 将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，
 * 直至整个序列有序为止。
 * 要点：设立哨兵，作为临时存储和判断数组边界之用
 * <p>
 * 日期: 2017-10-26
 * 时间: 00:19
 * 版本:
 */
public class StraightSort {
    private static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};


    public static void main(String args[]) {
        straightSort(a);
    }

    /**
     * 从第一个元素开始,该元素可以认为已经被排序
     * 取出下一个元素,在已经排序的元素序列从后向前扫描
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 将新元素插入到该位置中
     * 重复步骤2
     * @param a 待排序的数组
     */
    public static void straightSort(int[] a) {
        System.out.println("排序之前:" + Arrays.toString(a)+" length:"+a.length);
        //待插入的元素
        int temp;
        int size=a.length;
        int j;
        for(int i=0;i<size;i++){
            temp=a[i];
            for(j=i;j>0;j--){
                if(temp<a[j-1]){
                    a[j]=a[j-1];
                }else {
                    break;
                }
            }
            a[j]=temp;
        }
        System.out.println("排序之后:" + Arrays.toString(a)+" length:"+a.length);
    }


}
