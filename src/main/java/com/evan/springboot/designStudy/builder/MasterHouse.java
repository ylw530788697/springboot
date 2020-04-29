package com.evan.springboot.designStudy.builder;

import com.alibaba.fastjson.JSONObject;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/27 20:09
 */
public class MasterHouse {

    public Hourse createHouse(HourseBuilder hourseBuilder) {
        hourseBuilder.buildDiJi();
        hourseBuilder.buildDesign();
        hourseBuilder.buildZhuangXiu();
        return hourseBuilder.buildHourse();
    }

    public static void main(String[] args) {
        Hourse hourse = new Hourse();
        MasterHouse masterHouse = new MasterHouse();
        hourse = masterHouse.createHouse(new WorkBuild(hourse));
        System.out.println(JSONObject.toJSONString(hourse));
    }
}
