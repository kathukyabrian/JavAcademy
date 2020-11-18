package com.company;

public class Annotate {
    // testing deprecated methods
    @Deprecated
    public static void printUser(String name){
        System.out.println(name);
    }

    // suppressing warnings for deprecated methods
    @SuppressWarnings("deprecation")
    public static void runDeprecated(String name){
        printUser(name);
    }
}
