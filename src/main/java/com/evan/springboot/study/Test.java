package com.evan.springboot.study;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import sun.misc.PostVMInitHook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        System.out.println(stringDemo2());
    }

    public static String stringDemo2(){
        String resutlt=null;
        int[] a={1,3,4,5};
        for (int i = 0; i < a.length; i++) {
            if (i==0){
                resutlt="["+i+"#";
            }else if (i==a.length-1){
                resutlt=resutlt+i+"]";
            }else {
                resutlt=resutlt+i+"#";
            }
        }
        //Arrays.
        return resutlt;
    }
    public static void StringDemo(){
        String str1="Hello";
        String st="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);
    }

    public static void StringDemo1(){
        String str1="Hello";
        String str2="Hello";
        //char[] charArray={'H','e','l','l','o'};
        //String str3=new String(charArray);

    }
    public static void scannerDemo(){

    }
    public static void demo5(){
        Random random = new Random();
    }

    public static void arrayDemo(){
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings);
    }
    public static  void arrayRevert(){
        int[] a={1,2,3,12,15,20,30};
        for (int i = 0; i < (a.length-1)/2; i++) {
            int b=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=b;
        }
        System.out.println(JSONObject.toJSONString(a));
    }
    public static void arrayDemo4(){
        int[] array={5,15,20,30,10000};
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
    public static  void arrayDemo3(){
        int[] array1={15,20,30,45};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
    public static void arrayDemo2(){
        int[] a=new int[3];
        System.out.println(JSONObject.toJSONString(a));
        a[2]=20;
        a[1]=30;
        System.out.println(JSONObject.toJSONString(a));
    }
    public static  void demo1(){
        //动态初始化
        int[] arrayA=new int[30];
        double[] arrayB=new double[10];
        String[] arrayC=new String[5];

        //静态初始化
        int[] arrayStatic=new int[]{1,3,4};
        String[] arrayString={"q","b","c"};
        System.out.println(JSONObject.toJSONString(arrayString));

    }
    public static  int sum(int a,int b){
        return a+b;

    }
    public static int sum(){
        int result=0;
        for (int i = 1; i < 101; i++) {
            result=result+i;
        }
        return result;
    }

    public static boolean isSam(int a ,int b){
        if (a==b){
            return true;
        }else {
            return false;
        }

    }
    public static int sumOne(int count) {
        int sum = 0;
        for (int j = 1; j < 101; j++) {
            if (j % 2 == 0) {
                sum = sum + j;
            }
        }
        return sum;
    }

    public static void doWhileDemo() {
        int i = 1;
        do {
            System.out.println("i'm sorry " + i);
            i++;
        } while (i < 101);
    }

    public static void whileDemo() {
        int i = 1;
        while (i < 101) {
            System.out.println("i'm sorry " + i);
            i++;
        }
    }

    public static void forDemo() {
        for (int i = 1; i < 101; i++) {
            System.out.println("我错了" + i);
        }
    }

    public static void switchDemo(int score) {
        switch (score) {
            case 90:
                System.out.println("优秀");
                break;
            case 80:
                System.out.println("良好");
                break;
            case 70:
                System.out.println("种");
                break;
            case 60:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (stack.size() == 0) {
                stack.push(aChar);
            } else if (isSym(stack.peek(), aChar)) {
                stack.pop();
            } else {
                stack.push(aChar);
            }
        }
        return stack.size() == 0;
    }

    private boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }
}
