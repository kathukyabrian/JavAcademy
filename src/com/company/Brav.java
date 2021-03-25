package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Brav {

    public static void main(String[] args) {

        // create an array with 10 elements

        String [] names = new String[10];

        for(int i=0;i< names.length;i++){
            System.out.println("Entry : "+i);
            Scanner input = new Scanner(System.in);
            names[i] = input.next();
        }

        // print the array
        System.out.println(Arrays.toString(names));

    }
}
