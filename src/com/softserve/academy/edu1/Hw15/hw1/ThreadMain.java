package com.softserve.academy.edu1.Hw15.hw1;

public class ThreadMain {
    public static void main(String[] args) {
    Thread thread = new Thread(new MessageWithThread("Hello World1"));
    Thread thread1 = new Thread(new MessageWithThread("Hello World2"));
    thread.start();
    thread1.start();
    Thread thread2 = new Thread(new MessageWithThread("Hello World3"));

    try{
        thread.join();
        thread1.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    thread2.start();

    }
}
