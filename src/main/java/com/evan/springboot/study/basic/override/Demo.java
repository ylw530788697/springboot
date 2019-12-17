package com.evan.springboot.study.basic.override;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/17/2019 16:50
 */
public class Demo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.show();
        System.out.println("-------------");
        NewPhone newPhone = new NewPhone();
        newPhone.show();
    }
}
