package com.company;

public class PublicSchool extends School {

    // construct same as the School class(parent)
    public PublicSchool(String name, String startYear, int studentNumber) {
        super(name, startYear, studentNumber);
    }

    // override info from parent class.
    void info(){
        System.out.println("My schoool is a public school called "+name+" with a population of "+studentNumber+". It started in "+startYear);
    }

    // replace the static method from parent.
    static void decorate(){
        System.out.println("---------------------------------------------------------");
    }
}
