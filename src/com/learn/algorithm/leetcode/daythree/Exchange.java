package com.learn.algorithm.leetcode.daythree;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListUtils;

import java.util.Arrays;

/**
 * create by shuaizhimin
 * create on 2021/5/3 16:53
 * 调整数组顺序使奇数位于偶数前面
 * <p>
 * 奇数 偶数得定义都是%2 是否等于1
 */
public class Exchange {
    private static int[] a = {1, 2, 3, 4};

    public static void main(String args[]) {
        int[] b = exchange(a);
        System.out.println(Arrays.toString(b));
    }

    /**
     * 双指针解法
     *
     * @param nums
     * @return
     */
    public static int[] exchange(int[] nums) {
        int length = nums.length;
        //定义左右两个指针，左边的指向奇数，右边的指向偶数
        int left = 0, right = length - 1;
        while (left < right) {
            //奇数
            if ((nums[left] & 1) != 0) {
                left++;
                continue;
            }
            if ((nums[right] & 1) != 1) {
                right--;
                continue;
            }
            ListUtils.swap(nums, left, right);
        }
        return nums;
    }
}
