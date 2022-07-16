package com.evan.springboot.study.designStudy.cloneableDemo;

import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/7/13 14:03
 */
@Data
public class Citation implements Cloneable {
    String name;
    String info;
    String colleage;

    public Citation(String name, String info, String colleage) {
        this.name = name;
        this.info = info;
        this.colleage = colleage;
        System.out.println("奖章创建成功");
    }

    void display() {
        System.out.println(name + info + colleage);
    }

    public Object clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("evan", "在2020年第一学期获得三好学生奖章", "南山必胜客");
        citation.display();
        Citation clone = (Citation)citation.clone();
        clone.setName("vale");
        clone.display();
    }
}
