package com.company;

import java.util.ArrayList;
import java.util.List;

public class Gens {
    static List<String> family = new ArrayList<String>();

    public static void addMember(String name){
        family.add(name);
        System.out.println(family);
    }

    public static void main(String[] args) {
        addMember("Brian");
        addMember("Judy");
        addMember("Michael");
    }

}
