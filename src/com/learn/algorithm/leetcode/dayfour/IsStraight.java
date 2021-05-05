package com.learn.algorithm.leetcode.dayfour;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

/**
 * create by shuaizhimin
 * create on 2021/5/4 23:04
 * 扑克牌中的顺子
 */
public class IsStraight {
    public static int[] a={1,2,3,4,5};
    public static int[] b={3,1,6,7,5};
    public static int[] c={1,2,3,4,6};

    public static void main(String args[]) {
        System.out.println(""+isStraight(a));
        System.out.println(""+isStraight(b));
        System.out.println(""+isStraight(c));
    }

    /**
     * 遍历
     * @param nums
     * @return
     */
    public static boolean isStraight(int[] nums) {
       for(int i=0;i< nums.length-1;i++){
           if(nums[i+1]-nums[i]!=1){
               return false;
           }
       }
       return true;
    }

}
