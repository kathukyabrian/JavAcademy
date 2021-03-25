package com.company;

public class ConcurrencyTwo extends Thread{
    public void run(){
        System.out.println("Hello from another thread");
    }

    public static void main(String[] args) {
        (new ConcurrencyTwo()).start();
    }
}
