package com.company;

public class Excepts {
    public static Integer value;

    public static void main(String[] args) {
        String val;
        try{
            val = value.toString();
            System.out.println(val);
        }catch (Exception e){
            // since value is null, this exception is thrown
            System.out.println("Encountered error "+e);
        }
    }
}
