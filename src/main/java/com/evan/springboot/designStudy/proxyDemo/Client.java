package com.evan.springboot.designStudy.proxyDemo;

import java.lang.reflect.Proxy;

/**
 * @author evanYang
 * @version 1.0
 *
 *
 * @date 2020/4/29 上午 11:06
 */
public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserJDkProxy userJDkProxy = new UserJDkProxy(userService);
        UserService o = (UserService) Proxy.newProxyInstance(userJDkProxy.getClass().getClassLoader(), userService.getClass().getInterfaces(), userJDkProxy);
        o.save();

        UserCglibProxy userCglibProxy = new UserCglibProxy();
        UserService instance = (UserService) userCglibProxy.getInstance(userService);
        instance.save();
    }
}
