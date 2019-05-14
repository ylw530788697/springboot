package com.evan.springboot.study.proxy;

public class UserDao implements IUserDao {
    @Override
    public void sava() {
        System.out.println("已经保存数据");
    }
}
