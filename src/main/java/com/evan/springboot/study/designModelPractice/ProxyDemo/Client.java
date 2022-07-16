package com.evan.springboot.study.designModelPractice.ProxyDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/21/2019 10:57
 */
public class Client {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();
    }
}
