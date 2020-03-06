package com.evan.springboot.study.basic.objectDemo;

import lombok.Data;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/20/2019 11:46
 */
@Data
public class Persion {
    private String name;
    private Integer age;

    public Persion(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Persion() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persion persion = (Persion) o;

        if (name != null ? !name.equals(persion.name) : persion.name != null) return false;
        return age != null ? age.equals(persion.age) : persion.age == null;
    }

}
