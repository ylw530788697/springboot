package com.evan.springboot.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author evanYang
 * @version 1.0
 * @date 11/14/2019 11:48
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 6356570699765511585L;
    private Integer id;
    private String name;
    private Integer age;

}
