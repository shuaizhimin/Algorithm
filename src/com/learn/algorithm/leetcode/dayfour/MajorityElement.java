package com.learn.algorithm.leetcode.dayfour;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * create by shuaizhimin
 * create on 2021/5/4 16:49
 * 数组中出现次数超过一半的数字
 */
public class MajorityElement {


    public static int[] a = {1, 2, 3, 2, 2, 2, 5, 4, 2};

    public static void main(String args[]) {
        System.out.println("" + majorityElement(a));
        System.out.println("" + majorityElement1(a));
        System.out.println("" + majorityElement2(a));
    }

    public static int majorityElement2(int[] nums) {
        int x = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) x = num;
            if (num == x) {
                votes++;
            } else {
                votes--;
            }
        }
        return x;
    }

    public static int majorityElement1(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == res) {
                count++;
            } else {
                count--;
            }
            if (count <= 0) {
                res = nums[i + 1];
                count = 0;
            }
        }
        return res;
    }

    /**
     * HashMap
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                //如果已经存在key，将值+1
                int temp = map.get(nums[i]);
                map.put(nums[i], temp + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) * 2 > nums.length) {
                return i;
            }
        }
        return -1;
    }

}
