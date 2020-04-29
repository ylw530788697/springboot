package com.evan.springboot.designStudy.template;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/27 20:43
 */
public class GoBank extends BankTemplate {
    @Override
    void tramsact() {
        System.out.println("小明去银行取钱");
    }

    public static void main(String[] args) {
        BankTemplate goBank = new GoBank();
        goBank.process();
    }
}
