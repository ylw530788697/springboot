package com.evan.springboot.designModel.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMeiPo implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(".......媒婆。。。。。。");
        System.out.println("给你寻找合适的美眉");
        System.out.println();
        methodProxy.invokeSuper(o,objects);
        System.out.println("谈的怎么样");
        return null;
    }

    public Object getInstance(Class clazz) throws Exception{

        Enhancer enhancer=new Enhancer();
        //把父类设置为堆
        //这一步就是告诉cglib，生成的子类需要继承哪个类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);

        //第一步生成源代码
        //第二部 编译成class文件
        //第三步 加载到jvm种，并返回被代理对象
        return enhancer.create();

    }
}
