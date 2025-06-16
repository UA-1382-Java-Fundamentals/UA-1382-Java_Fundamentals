package com.softserve.academy.edu1.Hw15.hw2;

public class Main {
    public static void main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread-1: holding lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (lock2) {
                    System.out.println("Thread-1: acquired lock2!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread-2: holding lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                synchronized (lock1) {
                    System.out.println("Thread-2: acquired lock1!");
                }
            }
        });

        t1.start();
        t2.start();

        //Мають вони зависнути через deadlock
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ends (не буде виконано через deadlock)");
    }
}
