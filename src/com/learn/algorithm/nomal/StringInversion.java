package com.learn.algorithm.nomal;

import java.util.Arrays;
import java.util.Stack;

/**
 * create by shuaizhimin
 * create on 2021/4/20 15:41
 * 字符串反转
 *
 */
public class StringInversion {


    public static void main(String args[]) {
        String s="android";
        System.out.println("反转之前:" + s);
        //String res=stringInversion(s);
        String res=reverse2(s);
        System.out.println("反转之后:" + res);
    }

    public static String stringInversion(String s){
       return new StringBuffer(s).reverse().toString();
    }


    //利用栈 后进先出
    public static String reverse2(String s){
        StringBuffer sb = new StringBuffer();
        Stack st=new Stack();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            sb.append(st.pop());
        }
        return sb.toString();
    }

}

