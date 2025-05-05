package com.softserve.academy.edu09.worker;

/**
 * Worker interface defines the basic actions that a worker can perform.
 * This interface is used to demonstrate anonymous class implementation.
 */
public interface Worker {
    /**
     * Defines the work action for a worker.
     */
    void doWork();

    /**
     * Defines the break action for a worker.
     */
    void takeBreak();
}

class WorkerDemo {

    public static void main(String[] args) {
        Worker worker = new Worker() {
            /**
             * Implementation of the doWork method.
             * Prints a message indicating that work is being done.
             */
            @Override
            public void doWork() {
                System.out.println("Doing work...");
            }

            /**
             * Implementation of the takeBreak method.
             * Prints a message indicating that a break is being taken.
             */
            @Override
            public void takeBreak() {
                System.out.println("Taking a break...");
            }
        };

        worker.doWork();
        worker.takeBreak();
    }
}
