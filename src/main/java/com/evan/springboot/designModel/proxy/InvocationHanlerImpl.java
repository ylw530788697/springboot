package com.evan.springboot.designModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHanlerImpl implements InvocationHandler {
    private Object target;
    public InvocationHanlerImpl(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        System.out.println("动态代理类开始");
        result=method.invoke(target,args);
        System.out.println("动态代理调用结束处理");
        return result;
    }

    public static void main(String[] args) {
        IUserDao userDao=new UserDao();
        InvocationHanlerImpl invocationHanler = new InvocationHanlerImpl(userDao);
        ClassLoader loader = userDao.getClass().getClassLoader();
        Class<?>[] interfaces = userDao.getClass().getInterfaces();

        IUserDao newProxyInstance = (IUserDao) Proxy.newProxyInstance(loader, interfaces, invocationHanler);
        newProxyInstance.sava();
    }
}
