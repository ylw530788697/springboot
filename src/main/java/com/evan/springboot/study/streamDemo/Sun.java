package com.evan.springboot.study.streamDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2022/07/05 14:51
 */
public class Sun extends Fater {
    @Override
    public void demo(){
        super.demo();
        System.out.println("this is sun demo");
    }

    public static void main(String[] args) {
        Sun sun = new Sun();
        sun.demo();
    }
}
