package com.softserve.academy.edu6;

public class Task1 {
        abstract static class Bird {
            boolean feathers;
            boolean layEggs;

            Bird(boolean feathers, boolean layEggs) {
                this.feathers = feathers;
                this.layEggs = layEggs;
            }

            abstract void fly();

            void displayInfo() {
                System.out.println("Feathers: " + feathers + ", Lays Eggs: " + layEggs);
            }
        }

        static abstract class FlyingBird extends Bird {
            FlyingBird() {
                super(true, true);
            }
        }

        static abstract class NonFlyingBird extends Bird {
            NonFlyingBird() {
                super(true, true);
            }
        }

        static class Eagle extends FlyingBird {
            public void fly() {
                System.out.println("Eagle is flying high up in the sky");
            }
        }

        static class Swallow extends FlyingBird {
            public void fly() {
                System.out.println("Swallow eats flies in the air");
            }
        }

        static class Penguin extends NonFlyingBird {
            public void fly() {
                System.out.println("Penguin cannot fly");
            }
        }

        static class Kiwi extends NonFlyingBird {
            public void fly() {
                System.out.println("Kiwi cannot fly");
            }
        }

        public static void main(String[] args) {
            Bird[] birds = {
                    new Eagle(),
                    new Swallow(),
                    new Penguin(),
                    new Kiwi()
            };

            for (Bird bird : birds) {
                bird.fly();
                bird.displayInfo();
                System.out.println();
            }
        }
    }

