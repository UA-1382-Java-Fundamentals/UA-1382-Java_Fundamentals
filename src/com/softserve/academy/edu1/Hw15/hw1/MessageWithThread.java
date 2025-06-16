package com.softserve.academy.edu1.Hw15.hw1;

public class MessageWithThread implements Runnable {
    private final String message;
    public MessageWithThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message);

        }
    }
}
