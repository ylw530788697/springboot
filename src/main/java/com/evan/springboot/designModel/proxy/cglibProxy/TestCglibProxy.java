package com.evan.springboot.designModel.proxy.cglibProxy;

public class TestCglibProxy {
    public static void main(String[] args) throws Exception {
        //jdk的动态代理是通过接口来进行强制转换的
        //生成以后的代理对象，可以强制转换为接口

        //cglib是通过生成一个被代理对象的子类，然后重写父类的方法
        //生成以后的对象，可以强制转换为被代理对象
        DianWeiGe dianWeiGe =(DianWeiGe) new CglibMeiPo().getInstance(DianWeiGe.class);
        dianWeiGe.findLove();
    }
}
