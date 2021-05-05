package com.learn.algorithm.leetcode.dayone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * create by shuaizhimin
 * create on 2021/4/29 15:28
 */
public class FindRepeatNumber {
    private static int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};

    public static void main(String args[]) {
        System.out.println("排序之前:" + Arrays.toString(a));
        int b = findRepeatNumber(a);
        System.out.println("排序之后:" + b);
        int c=findRepeatNumber1(a);
        System.out.println("排序之后:" + c);
    }


    /**
     * 使用Set不重复特性
     * 时间复杂度O(n)
     * 空间复杂度O(n) 每个数字都可能存入
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }


    /**
     * 值->索引    索引:值  1:多
     * 如果a[i]=i,正好索引位置 无需交换
     * 如果a[a[i]]=a[i] 证明是重复的
     * 否则交换i和a[i]的位置
     *
     * @param nums
     * @return
     */
    public static int findRepeatNumber1(int[] nums) {
        int i = 0;
        while (i < nums.length-1) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if(nums[i]==nums[nums[i]])
                return nums[i];
            int temp=nums[i];
            nums[i]=nums[temp];
            nums[temp]=temp;
        }
        return -1;
    }

}
