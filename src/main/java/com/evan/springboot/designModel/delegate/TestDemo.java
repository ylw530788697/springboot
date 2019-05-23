package com.evan.springboot.designModel.delegate;

public class TestDemo {
    public static void main(String[] args) {
        Dispatcher dispatcher=new Dispatcher( new ExectorA());
        dispatcher.doing();
    }
}
