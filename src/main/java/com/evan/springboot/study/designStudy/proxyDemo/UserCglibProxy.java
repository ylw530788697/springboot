package com.evan.springboot.study.designStudy.proxyDemo;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/4/29 上午 11:31
 */
public class UserCglibProxy implements MethodInterceptor {
    private Object object;
    public Object getInstance(Object object){
        this.object=object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        Object o = enhancer.create();
        return o;

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib 动态代理事务开始");
        Object invoke = methodProxy.invoke(object, objects);
        System.out.println("Cglib 动态代理事务结束");
        return invoke;
    }
}
