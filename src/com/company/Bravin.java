package com.company;

public class Bravin {
    int length;
    int width;

    public Bravin(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int findArea(){
        return this.length * this.width;
    }

    public static void main(String[] args) {
        Bravin bravin = new Bravin(20,15);
        System.out.println(bravin.findArea());
    }
}
