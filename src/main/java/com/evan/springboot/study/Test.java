package com.evan.springboot.study;

public class Test {
    public static void main(String[] args) {
        int size=10;
        double[] mylist=new double[size];
        mylist[0]=5.6;
        mylist[1]=1.2;
        double total=0;
        for (int i = 0; i < mylist.length; i++) {
            total+=mylist[i];
        }
        System.out.println(total);
    }
}
