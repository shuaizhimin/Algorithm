package com.learn.algorithm.leetcode.dayfour;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * create by shuaizhimin
 * create on 2021/5/4 21:15
 */
public class GetLeastNumbers {


    /**
     * 时间复杂度O(nlogn)
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] vec = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            vec[i] = arr[i];
        }
        return vec;
    }

    /**
     * 堆
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers1(int[] arr, int k) {
        int[] vec = new int[k];
        if (k == 0) { // 排除 0 的情况
            return vec;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });

        for (int i = 0; i < k; ++i) {
            queue.offer(arr[i]);
        }

        for (int i = k; i < arr.length; ++i) {
            if (queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; ++i) {
            vec[i] = queue.poll();
        }
        return vec;

    }

}
