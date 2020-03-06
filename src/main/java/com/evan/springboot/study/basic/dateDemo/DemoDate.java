package com.evan.springboot.study.basic.dateDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author evanYang
 * @version 1.0
 * @date 12/20/2019 14:17
 */
public class DemoDate {
    public static void main(String[] args) {
       /* System.out.println(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        System.out.println(date);*/

       /* Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));*/
        long l = System.currentTimeMillis();
        for (int i = 0; i < 9000; i++) {
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
