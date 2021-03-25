package com.company;

public class Sleep {
    public static void main(String[] args){
        String names[] = {"Peter","Michael","Judy","Brian"};

        for(int i=0; i< names.length;i++){
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                System.out.println(e);
                return;
            }
            System.out.println(names[i]);
        }
    }
}
