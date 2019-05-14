package com.evan.springboot.designModel.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Object tagerObject;
    public Object getInstance(Object tagerObject){
        this.tagerObject=tagerObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(tagerObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事物");
        Object result = methodProxy.invoke(tagerObject, objects);
        System.out.println("关闭事物");
        return result;
    }

    public static void main(String[] args) {
        CglibProxy cglibProxy=new CglibProxy();
        UserDao userDao = (UserDao) cglibProxy.getInstance(new UserDao());
        userDao.sava();
    }
}
