package com.evan.springboot.study;

import com.alibaba.fastjson.JSON;

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
        int[] nums ={2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums,target);
        System.out.println(JSON.toJSONString(ints));
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
