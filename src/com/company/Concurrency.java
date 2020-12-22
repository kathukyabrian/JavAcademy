package com.company;

public class Concurrency implements Runnable{
    public void run(){
        System.out.println("Hello from a thread");
    }

    public static void main(String[] args) {
        (new Thread(new Concurrency())).start();
    }
}
