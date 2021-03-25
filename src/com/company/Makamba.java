package com.company;

// This is about threads
public class Makamba {
    static int sum = 0;

    private final Runnable add;

    private final Runnable substract;

    public Makamba() {
        add = new Runnable() {
            @Override
            public void run() {
                System.out.println(addOne());
            }
        };

        substract = new Runnable() {
            @Override
            public void run() {
                System.out.println(removeOne());
            }
        };
    }


    public synchronized int addOne(){
        return sum+1;
    }

    public synchronized int removeOne(){
        return sum-1;
    }

    public static void main(String[] args) {
        Makamba makamba = new Makamba();
        new Thread(makamba.add).start();
        new Thread(makamba.substract).start();
    }
}
