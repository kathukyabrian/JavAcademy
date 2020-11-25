package com.company;

import java.lang.annotation.Documented;

public class Annotate extends AnnotateParent {
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

    @Override()
    public void sayHi(String message){
        System.out.println("Greeting is " +message);
    }
}
