package com.shuai.java.training;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-11-07
 * 时间: 23:01
 * 版本:
 */
public class HalfFind {
    static int[] arr={0,1,3,5,6,7,8,9,11};
    public static void main(String args[]){
        System.out.println(binarySearch(arr,3));
        System.out.println(binarySearchD(arr,3,0,arr.length-1));
    }

    /**
     * 将数组分为三部分，
     * 依次是中值（所谓的中值就是数组中间位置的那个值）前，中值，
     * 中值后；
     * 将要查找的值和数组的中值进行比较，
     * 若小于中值则在中值前 面找，若大于中值则在中值后面找，
     * 等于中值时直接返回。
     * 然后依次是一个递归过程，将前半部分或者后半部分继续分解为三部分。
     * @param arr
     * @param x
     * @return
     */
    public static int  binarySearch(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int middle=(low+high)/2;
            if(x==arr[middle]){
                return middle;
            }else if(x<arr[middle]){
                high=middle-1;
            }else {
                low=middle+1;
            }
        }
        return -1;
    }

    public static int binarySearchD(int[] arr,int x,int begin,int end){
        int mid=(begin+end)/2;
        if(x==arr[mid]){
            return mid;
        }else if(x<arr[mid]){
            return binarySearchD(arr,x,begin,mid-1);
        }else {
            return binarySearchD(arr,x,mid+1,end);
        }
    }

}
