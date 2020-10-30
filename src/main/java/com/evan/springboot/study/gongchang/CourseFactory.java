package com.evan.springboot.study.gongchang;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/10/30 14:28
 */
public class CourseFactory {
    public ICourse create(String course){
        if (course.equals("java")){
            return new JavaCourse();
        }else{
            return  null;
        }
    }
}
