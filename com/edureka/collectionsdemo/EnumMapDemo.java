package com.edureka.com.edureka.collectionsdemo;

import java.util.EnumMap;

public class EnumMapDemo {

    enum  Month{
        Jan,Feb,Mar

    }

    public static void main(String[] args) {
        EnumMap<Month,Integer> enumMapCalender = new EnumMap<Month,Integer>(Month.class);
        enumMapCalender.put(Month.Jan, 100);
        enumMapCalender.put(Month.Feb, 200);
        System.out.println(enumMapCalender);


    }
}
