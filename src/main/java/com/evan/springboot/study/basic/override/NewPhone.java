package com.evan.springboot.study.basic.override;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/17/2019 16:49
 */
public class NewPhone extends Phone {
    public void show(){
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
