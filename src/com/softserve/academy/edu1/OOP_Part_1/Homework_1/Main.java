package com.softserve.academy.edu1.OOP_Part_1.Homework_1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            System.out.println("---------------------------");
            System.out.println("Feathers: " + bird.getFeathers());
            System.out.println("Lays Eggs: " + bird.isLayEggs());
            bird.fly();
        }
    }
}
