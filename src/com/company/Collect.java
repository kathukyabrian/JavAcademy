package com.company;

import java.util.HashSet;

public class Collect {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        System.out.println(cars);
    }
}
