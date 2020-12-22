package com.company;

public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        String names[] = {"Peter","Michael","Judy","Brian"};

        for(int i=0; i< names.length;i++){
            Thread.sleep(4000);
            System.out.println(names[i]);
        }
    }
}
