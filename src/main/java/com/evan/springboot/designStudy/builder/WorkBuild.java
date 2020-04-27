package com.evan.springboot.designStudy.builder;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/04/27 20:06
 */
public class WorkBuild implements HourseBuilder {
    Hourse hourse;
    public WorkBuild(Hourse hourse){
        this.hourse = hourse;
    }
    @Override
    public void buildDiJi() {
        hourse.setDiJi("混凝土到地下5米");
    }

    @Override
    public void buildDesign() {
        hourse.setDesign("三室两厅");
    }

    @Override
    public void buildZhuangXiu() {
        hourse.setZhuangXiu("豪华装修");
    }

    @Override
    public Hourse buildHourse() {
        return hourse;
    }
}
