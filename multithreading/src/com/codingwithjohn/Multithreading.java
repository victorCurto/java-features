package com.codingwithjohn;

public class Multithreading{

    /*
    * We have two ways of creat threads
    * 1) extends Thread
    * 2) implements Runnable
    * */
    public static void main(String[] args) {
/*
        MulthithreadThing myThing = new MulthithreadThing(1);
        MulthithreadThing myThing2 = new MulthithreadThing(2);


        myThing.run(); //just run the method, don't launch a new thread
        myThing2.run();
*/

        /*
        // Example with extends
        for(int i =0; i<=3; i++){
            MultithreadExtendingThread myThing = new MultithreadExtendingThread(i);
            myThing.start(); //java will launch new thread
        }

        throw new RuntimeException(); //this exception will only affect the main thread the other threads still running
*/

        // Example with implements
        for(int i =0; i<=3; i++){
            MultithreadImplementsRunnable myThing = new MultithreadImplementsRunnable(i);
            Thread myThread = new Thread(myThing);
            myThread.start(); //java will launch new thread
            //myThread.join(); // join will wait until complete
            myThread.isAlive(); // true/false if is still running
        }

    }
}
