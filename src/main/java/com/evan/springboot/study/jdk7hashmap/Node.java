package com.evan.springboot.study.jdk7hashmap;

public class Node {
    private Object item;
    private Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public static void main(String[] args) {
        //Node header = new Node(new Object(), null);
        //        //header = new Node(new Object(), header);
        int[] nums={3,3};
        int target=6;
        int[] ints = twoSum(nums, target);
        System.out.println(ints.toString());
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target==(nums[i]+nums[j])){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return  result;
    }
}
