package com.evan.springboot.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/**
 * @author evanYang
 * @version 1.0
 * @date 04/14/2020 11:36
 */
public class TestJVM{
    public static void main(String[] args) throws InterruptedException {
        System.out.print(System.getProperty("test.demo"));
        List<Object> list = new ArrayList<>();
        while (true){
            int anInt = new Random().nextInt(100);
            if (System.currentTimeMillis()%2==0){
                list.clear();
            }else{
                for (int i = 0; i < 1000; i++) {
                    Properties properties = new Properties();
                    properties.put("key_"+i,"value_"+ System.currentTimeMillis()+i);
                    list.add(properties);
                    //System.out.println(list);
                }
                //System.gc();
            }
            Thread.sleep(anInt);
        }

    }
}



