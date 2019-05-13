package com.evan.springboot.designModel.adapterFactory;

public class JP110VInterfaceImpl implements JP110VInterface {
    @Override
    public void connect() {
        System.out.println("小日本110v，接通电源，开始工作....");
    }
}
