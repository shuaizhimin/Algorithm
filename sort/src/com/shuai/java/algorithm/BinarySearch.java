package com.shuai.java.algorithm;

/**
 * 作者: shuaizhimin
 * 描述: 二分查找算法
 * 日期: 2017-10-27
 * 时间: 10:29
 * 版本:
 */
public class BinarySearch {
    static int[] arr={0,1,3,5,6,7,8,8,9};
    public static void main(String args[]) {
        System.out.println("resultPosition="+rank(3,arr,0,8));
    }




    public static int rank(int key,int[] arr,int start,int end){
        if(start >end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(key<arr[mid]){
            return rank(key,arr,start,mid-1);
        }else if(key>arr[mid]){
            return rank(key,arr,mid+1,end);
        }else{
            return mid;
        }
    }

    public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){
        int midIndex = (beginIndex+endIndex)/2;
        if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
            return -1;
        }
        if(data <dataset[midIndex]){
            return binarySearch(dataset,data,beginIndex,midIndex-1);
        }else if(data>dataset[midIndex]){
            return binarySearch(dataset,data,midIndex+1,endIndex);
        }else {
            return midIndex;
        }
    }


}

