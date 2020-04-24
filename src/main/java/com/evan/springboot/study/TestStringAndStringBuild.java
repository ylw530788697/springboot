package com.evan.springboot.study;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/17 上午 11:15
 */
public class TestStringAndStringBuild {
    public static void main(String[] args) {
        TestStringAndStringBuild ts = new TestStringAndStringBuild();
        ts.m1();
        ts.m2();
        ts.m3();
        ts.m4();
    }

    public void m1(){
        String s1="123";
        String s2="456";
        String s3=s1+s2;
        System.out.println(s3);
    }

    public void m2(){
        String s1="123";
        String s2="456";
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        String S3 = sb.toString();
        System.out.println(S3);
    }

    public void m3(){
        String str="";
        for (int i = 0; i < 5; i++) {
            str=str+i;
        }
        System.out.println(str);
    }

    public void m4(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
