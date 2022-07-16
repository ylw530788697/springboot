package com.evan.springboot.study.designModelPractice.ProxyDemo;

/**
 * @author evanYang
 * @version 1.0
 * @date 09/21/2019 10:52
 */
public class UserDaoProxy implements IUserDao {
    @Override
    public void save() {
        System.out.println("开启事务");
        target.save();
        System.out.println("关闭事务");
    }

    private IUserDao target;

    public UserDaoProxy(IUserDao iUserDao){
        this.target=iUserDao;
    }


}
