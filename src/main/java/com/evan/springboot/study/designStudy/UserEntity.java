package com.evan.springboot.study.designStudy;

import com.alibaba.fastjson.JSONObject;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/20 15:01
 */
public class UserEntity {
    private String name;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> forName = Class.forName("com.evan.springboot.study.designStudy.UserEntity");
        UserEntity o = (UserEntity) forName.newInstance();
        o.name="测试反射";
        System.out.println(JSONObject.toJSONString(o));
    }
}
