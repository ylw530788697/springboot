package com.evan.springboot.designStudy.proxyDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/29 上午 10:43
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("插入用户成功");
    }
}
