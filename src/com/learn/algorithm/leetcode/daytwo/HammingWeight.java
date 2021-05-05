package com.learn.algorithm.leetcode.daytwo;

/**
 * create by shuaizhimin
 * create on 2021/5/3 11:24
 */
public class HammingWeight {
    public static int n = 00000000000000000000000000001011;

    public static void main(String args[]) {
        System.out.println("排序之后:" + hammingWeight(n));
        System.out.println("排序之后:" + hammingWeight1(n));
    }

    /**
     * 时间复杂度：O(log2n)
     * @param n
     * @return
     */
    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static int hammingWeight1(int n) {
        int res = 0;
        while(n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }



}
