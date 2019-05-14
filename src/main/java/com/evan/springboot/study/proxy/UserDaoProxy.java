package com.evan.springboot.study.proxy;

//静态代理
public class UserDaoProxy implements IUserDao{
    private IUserDao targer;

    public UserDaoProxy(IUserDao iUserDao){
        this.targer=iUserDao;
    }

    @Override
    public void sava() {
        System.out.println("开启事物");
        targer.sava();
        System.out.println("关闭事物");
    }

    public static void main(String[] args) {
        IUserDao  iUserDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(iUserDao);
        userDaoProxy.sava();
    }
}
