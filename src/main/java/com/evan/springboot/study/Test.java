package com.evan.springboot.study;

import com.alibaba.fastjson.JSON;
import sun.misc.PostVMInitHook;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
       /* int size=10;
        double[] mylist=new double[size];
        mylist[0]=5.6;
        mylist[1]=1.2;
        double total=0;
        for (int i = 0; i < mylist.length; i++) {
            total+=mylist[i];
        }
        System.out.println(total);*/
       /* int[] nums ={2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums,target);
        System.out.println(JSON.toJSONString(ints));*/
        //switchDemo(80);
        //forDemo();
        //whileDemo();
        // doWhileDemo();
        //System.out.println(sumOne(100));
        //switchDemo(80);
        //System.out.println(isSam(2, 2));
        //System.out.println(sum());
        System.out.println(sum(2, 3));
        System.out.println(sum());

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
