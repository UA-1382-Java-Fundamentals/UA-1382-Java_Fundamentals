package com.softserve.academy.edu1.Multithreading;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                System.out.println("Thread 1 - message " + (i + 1));
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                System.out.println("Thread 2 - message " + (i + 1));
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                System.out.println("Thread 3 - message " + (i + 1));
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();
        t3.start();
    }
}