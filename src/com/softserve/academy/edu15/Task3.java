package com.softserve.academy.edu15;

public class Task3 {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            System.out.println("Thread one has started");

            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread two has started");
                }

                Thread three = new Thread(() -> {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("Thread three has started");
                    }
                });
                three.start();
            });
            two.start();
        });
        one.start();
    }
}