package com.learn.algorithm.niuke;

/**
 * create by shuaizhimin
 * create on 2021/5/5 2:05
 * 求两个数的最小公倍数
 */
public class MinGongbei {
    public static int a = 8;
    public static int b = 10;

    public static void main(String args[]) {
        System.out.println("排序之后:" + minGongbei(a,b));
    }


    /**
     * 两个数a,b的最小公倍数是a*b/gcd(a,b)
     * 两个数的乘积除以最大公约数
     * @param a
     * @param b
     * @return
     */
    public static int minGongbei(int a,int b){
        return a*b/maxGongyue(a,b);
    }

    /**
     * 求最大公约数：辗转相除法
     * 1. a/b，令r为所得余数（0≤r<b） 若r=0，算法结束，a即为答案
     * 2. 互换：置 a←b，b←r，并返回第一步
     * @param a
     * @param b
     * @return
     */
    public static int maxGongyue(int a,int b){
        System.out.println("maxGongyue a:"+a+" b:"+b);
        if(b==0) return a;
        return maxGongyue(b,a%b);
    }
}
