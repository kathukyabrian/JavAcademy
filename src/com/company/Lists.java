package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void constructList(){
        List names = Arrays.asList("","Brian","Peter");
        System.out.println(names);
        ArrayList names1 = new ArrayList(names);
        names1.add("Mike");
        System.out.println(names1);
    }

    public static void emptyList(){
        String [] haha = {"Yoo","Bro"};
        List names = new ArrayList<String>(Arrays.asList(haha));
        System.out.println(names);
    }

    public static void main(String[] args) {
        emptyList();
    }
}
