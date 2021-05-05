package com.learn.algorithm.practice;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * create by shuaizhimin
 * create on 2021/5/5 20:18
 * 查找不重复子串
 */
public class DelectNotRepeat {
    public static String str="abcabcbb";
    public static void main(String args[]) {

    }


    /**
     * 查找不重复子串
     * @param str
     * @return
     */
    public static int delectNotRepeat(String str){
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < str.length(); j++) {
            int i = dic.getOrDefault(str.charAt(j), -1);
            dic.put(str.charAt(j),j);
            tmp = tmp < j - i ? tmp + 1 : j - i;
            res = Math.max(res, tmp);
        }
        return res;
    }
}
