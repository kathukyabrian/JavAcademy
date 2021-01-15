package com.company;

public class SimpleThreads {
    // displays threadName:message
    static void threadMessage(String message){
        String threadName = Thread.currentThread().getName();
        System.out.format("%s:%s%n",threadName,message);
    }

    // create a new thread from Runnable object
    private static class MessageLoop implements Runnable{
        public void run(){
            String names[] = {"Peter","Michael","Judy","Brian"};
            try{
                for(int i=0; i<names.length;i++){
                    Thread.sleep(3000);
                    threadMessage(names[i]);
                }
            }catch(InterruptedException e){
                threadMessage("I was not done");
            }
        }
    }

    private static class CounterLoop implements Runnable{
        public int c;

        @Override
        public void run() {
            try {
                for(int i=0;i<10;i++){
                    increment();
                    Thread.sleep(2000);
                    threadMessage(String.valueOf(getC()));
                }
            }catch (InterruptedException e){
                threadMessage("I did not finish");
            }

        }

        public synchronized void increment(){
            c++;
        }

        public synchronized void decrement(){
            c--;
        }

        public synchronized int getC(){
            return c;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        long patience = 100*60*60;
        threadMessage("Starting Message Loop Thread");
        long startTime = System.currentTimeMillis();
        // create a thread from MessageLoop
        Thread t = new Thread(new MessageLoop());
        t.start();
        threadMessage("Waiting for MessageLoop thread to finish");
        while(t.isAlive()){
            threadMessage("Still waiting....");
            // wait max 1 second for the MessageLoop Thread to finish
            t.join(1000);
            if(((System.currentTimeMillis() - startTime)>patience) && t.isAlive()){
                threadMessage("Tired of waiting");
                t.interrupt();
                t.join();
            }
        }
        threadMessage("Finally");
    }
}
