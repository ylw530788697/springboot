package com.evan.springboot.study.designStudy.FacadeDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 09:47
 */
public class AliSmsServiceImpl implements AliSmsService {
    @Override
    public void sendSms() {
        System.out.println("阿里发送信息");
    }
}
