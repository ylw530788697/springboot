package com.evan.springboot.study.designStudy.FacadeDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 09:43
 */
public class EmailServiceImpl implements EmailSmaService {
    @Override
    public void sendSms() {
        System.out.println("136邮箱发送邮件");
    }
}
