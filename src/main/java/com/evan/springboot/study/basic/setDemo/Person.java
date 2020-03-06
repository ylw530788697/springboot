package com.evan.springboot.study.basic.setDemo;

import com.evan.springboot.study.basic.objectDemo.Persion;
import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/27/2019 15:22
 */
@Data
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person o) { //0 认为两个人的年龄是相同的
        return  this.getAge()-o.getAge();
    }
}
