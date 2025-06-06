package com.softserve.academy.edu15;

public class Task2 {
    private static final Object LOCK_X = new Object();
    private static final Object LOCK_Y = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Worker1(), "Worker1");
        Thread t2 = new Thread(new Worker2(), "Worker2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    public static class Worker1 implements Runnable {
        @Override
        public void run() {
            synchronized (LOCK_X) {
                sleepQuiet(100);
                synchronized (LOCK_Y) { }
                }
            }
        }

        public static class Worker2 implements Runnable {
            @Override
            public void run() {
                synchronized (LOCK_Y) {
                    sleepQuiet(100);
                    synchronized (LOCK_X) { }
                    }
                }
            }

            private static void sleepQuiet(long millisecs) {
                try {
                    Thread.sleep(millisecs);
                } catch (InterruptedException ignored) {
                }
            }
        }