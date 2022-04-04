package com.evan.springboot.study;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/05/19 21:46
 */
@Component
@NoArgsConstructor
public class DependecyA {
    private DependecyB dependecyB;

    @Autowired
    public DependecyA(DependecyB dependecyB){
        this.dependecyB=dependecyB;
    }
}
