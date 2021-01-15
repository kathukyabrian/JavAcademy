package com.company;

import java.util.HashMap;
import java.util.Map;

public class Mapper {
    public static void mapTest(){
        Map<String, String> test = new HashMap<>();
        test.put("name","Brian");
        test.put("age","20");
        test.put("gender","Male");
        System.out.println(test);
    }

    public static void main(String[] args) {
        mapTest();
    }
}
