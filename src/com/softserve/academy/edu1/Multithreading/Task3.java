package com.softserve.academy.edu1.Multithreading;

public class Task3 {
    public static void main(String[] args) {
        Thread threadThree = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                System.out.println("Thread number three");
        });

        Thread threadTwo = new Thread(() -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Thread number two");

            threadThree.start();
        });

        Thread threadOne = new Thread(() -> {
            threadTwo.start();
            try {
                threadTwo.join();
                threadThree.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadOne.start();
    }
}