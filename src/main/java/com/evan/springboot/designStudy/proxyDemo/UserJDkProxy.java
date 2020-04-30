package com.evan.springboot.designStudy.proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/29 上午 10:57
 */
public class UserJDkProxy implements InvocationHandler {
    private UserService userService;
    public UserJDkProxy(UserService userService){
        this.userService=userService;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk 动态代理开始");
        Object invoke = method.invoke(userService, args);
        System.out.println("Jdk 动态代理结束");
        return invoke;
    }
}
