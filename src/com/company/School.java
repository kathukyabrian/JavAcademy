package com.company;

public class School {

    static  String countryName;

    //static initialization block
    static{
        countryName = "Kenya";
    }

    String name;

    String startYear;

    int studentNumber;

    public School(String name, String startYear, int studentNumber) {
        this.name = name;
        this.startYear = startYear;
        this.studentNumber = studentNumber;
    }

    void open(){
        System.out.println("School was opened");
    }

    void close(){
        System.out.println("School was closed");
    }

    void info(){
        System.out.println("My school "+name+","+countryName+" started in "+startYear+" and has "+studentNumber+" students.");
    }

    static void decorate(){
        System.out.println("================================");
    }
}
