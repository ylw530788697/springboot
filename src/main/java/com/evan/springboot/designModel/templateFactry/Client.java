package com.evan.springboot.designModel.templateFactry;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bankTemplateMethod=new DrawMoney();
        bankTemplateMethod.process();

        new BankTemplateMethod() {
            @Override
            void transact() {
                System.out.println("我要修改密码");
            }
        }.process();
    }
}
