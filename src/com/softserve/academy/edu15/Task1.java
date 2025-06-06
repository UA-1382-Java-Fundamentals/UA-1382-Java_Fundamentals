package com.softserve.academy.edu15;

public class Task1 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: Message1" + (i + 1));
                sleep(1000);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: Message2" + (i + 1));
                sleep(1000);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 3: Message3" + (i + 1));
                sleep(1000);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
         thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
    }
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
