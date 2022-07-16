package com.evan.springboot.study.designStudy.FacadeDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 09:47
 */
public class Computer {
    AliSmsService aliSmsService;
    EmailSmaService emailSmaService;
    WechatSmsService wechatSmsService;
    public Computer(){
        aliSmsService=new AliSmsServiceImpl();
        emailSmaService=new EmailServiceImpl();
        wechatSmsService=new WechatSmsServiceImpl();
    }

    public void sendMsg(){
        aliSmsService.sendSms();
        emailSmaService.sendSms();
        wechatSmsService.sendSms();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.sendMsg();
    }
}
