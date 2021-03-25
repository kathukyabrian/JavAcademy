package com.company;

import java.util.LinkedList;
import java.util.List;

public class Genss {
    public static void main(String[] args) {
//        List intList = new LinkedList<>();
        // we redo the list in the next line
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(new Integer(0));
//        Integer x = (Integer) intList.iterator().next();
        // we remove the clutter code since we already expect an integer
        Integer x = intList.iterator().next();
        System.out.println(x);
    }
}
