package com.softserve.academy.edu1.Multithreading;

public class Task2 {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock2.");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                synchronized (lock1) {
                    System.out.println("Thread 2: Acquired lock1.");
                }
            }
        });

        t1.start();
        t2.start();
    }
}