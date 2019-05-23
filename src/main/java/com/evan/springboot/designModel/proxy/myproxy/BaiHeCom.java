package com.evan.springboot.designModel.proxy.myproxy;

import java.lang.reflect.Method;

public class BaiHeCom implements MyInvocationHandler{
    private Person target;

    public Object getInstance(Person target)throws Exception{
        this.target=target;
        Class clazz = target.getClass();
        System.out.println("被代理对象的class是:"+clazz);
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("咨询资料，交钱，介绍合适的对象");
        System.out.println("开始介绍");
        method.invoke(this.target,args);
        System.out.println("两人见面细聊");
        return null;
    }

    public static void main(String[] args) throws Exception {
        Person obj = (Person)new BaiHeCom().getInstance(new GoodBoy());
        System.out.println(obj.getClass());
        obj.findLove();
    }
}
