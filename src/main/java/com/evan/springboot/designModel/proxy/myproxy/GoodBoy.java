package com.evan.springboot.designModel.proxy.myproxy;

public class GoodBoy implements  Person {
    //帅小伙择偶的条件
    @Override
    public void findLove() {
        System.out.println("高富美");
        System.out.println("好看的皮囊千遍一律，有趣的灵魂万里挑一");
    }
}
