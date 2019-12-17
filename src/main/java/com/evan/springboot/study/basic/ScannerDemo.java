package com.evan.springboot.study.basic;

import java.util.Scanner;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/06/2019 15:34
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String next1 = scanner.next();
        System.out.println((Integer.valueOf(next) + Integer.valueOf(next1)));
    }
}
