package com.evan.springboot.study.designStudy.FacadeDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/03 09:45
 */
public class WechatSmsServiceImpl implements WechatSmsService {
    @Override
    public void sendSms() {
        System.out.println("微信发送消息");
    }
}
