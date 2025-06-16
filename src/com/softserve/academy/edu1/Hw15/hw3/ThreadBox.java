package com.softserve.academy.edu1.Hw15.hw3;

public class ThreadBox implements Runnable {
private String threadName;

ThreadBox(String threadName) {
    this.threadName = threadName;
}

    public void run() {

            System.out.println(Thread.currentThread().getName() + ": " + threadName);

    }
}
