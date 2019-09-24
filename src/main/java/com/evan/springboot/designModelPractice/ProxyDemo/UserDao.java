package com.evan.springboot.designModelPractice.ProxyDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/21/2019 10:51
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("userDao 保存数据数据成功");
    }
}
