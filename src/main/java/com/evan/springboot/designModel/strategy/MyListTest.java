package com.evan.springboot.designModel.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        List<Long> numbers=new ArrayList<Long>(5);
        Collections.sort(numbers, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {

                //中间逻辑不一样的

                return 0;
            }
        });
    }
}

