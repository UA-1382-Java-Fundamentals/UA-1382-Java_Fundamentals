package com.softserve.academy.edu1.Hw15.hw3;

public class MainThread {
    public static void main(String[] args) {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread number one");

                Thread two = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        for (int i=0; i<3; i++){
                        System.out.println("Thread number two");}

                        Thread three = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int i=0; i<5; i++){
                                    System.out.println("Thread number three");
                                }
                            }

                        }); three.start();
                        try {
                            three.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                } );  two.start();
                try {
                    two.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

        }
        }); one.start();




    }
}
