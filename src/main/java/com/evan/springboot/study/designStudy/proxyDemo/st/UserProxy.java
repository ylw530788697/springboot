package com.evan.springboot.study.designStudy.proxyDemo.st;

import com.evan.springboot.study.designStudy.proxyDemo.UserService;
import com.evan.springboot.study.designStudy.proxyDemo.UserServiceImpl;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/29 上午 10:45
 */
public class UserProxy implements UserService {
    private UserService userService;

    public UserProxy(UserService userService){
        this.userService=userService;
    }

    @Override
    public void save() {
        System.out.println("开启事务");
        userService.save();
        System.out.println("事务执行");
    }


    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserProxy userProxy = new UserProxy(userService);
        userProxy.save();
    }
}
