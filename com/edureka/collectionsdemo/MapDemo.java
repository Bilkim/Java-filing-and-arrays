package com.edureka.com.edureka.collectionsdemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        MapDemo demo = new MapDemo();
        demo.printMap(demo.createHashMap());
        demo.printMap(demo.createLinkedHashMap());
        demo.printMap(demo.createTreeMap());

    }

    private Map<Integer,String> createHashMap() {
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"X");
        employeeMap.put(2,"Y");
        employeeMap.put(223,"U");
        employeeMap.put(2432,"B");
        employeeMap.put(100,"A");
        return employeeMap;
    }

    private Map<Integer,String> createLinkedHashMap() {
        Map<Integer,String> employeeMap = new LinkedHashMap<>();
        employeeMap.put(1,"X");
        employeeMap.put(2,"Y");
        employeeMap.put(223,"U");
        employeeMap.put(2432,"B");
        employeeMap.put(100,"A");
        return employeeMap;
    }

    private Map<Integer,String> createTreeMap() {
        Map<Integer,String> employeeMap = new TreeMap<>();
        employeeMap.put(1,"X");
        employeeMap.put(2,"Y");
        employeeMap.put(223,"U");
        employeeMap.put(2432,"B");
        employeeMap.put(100,"A");
        return employeeMap;
    }

    private void printMap(Map<Integer,String> mapToPrint){
        Set keys = mapToPrint.keySet();
        System.out.println(mapToPrint);
    }
}
