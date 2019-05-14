package com.evan.springboot.designModel.templateFactry;

public class DrawMoney extends BankTemplateMethod {
    @Override
    void transact() {
        System.out.println("我要取钱");
    }
}
