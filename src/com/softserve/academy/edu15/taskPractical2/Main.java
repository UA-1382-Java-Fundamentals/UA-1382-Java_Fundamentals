package softserve.academy.edu15.taskPractical2;

//2. Output two messages «Hello, world» and «Peace in the peace» 5 times each with the
//intervals of 2 seconds, and the second - 3 seconds. After printing messages, print the
//text «My name is …»

public class Main {
    public static void main(String[] args) {
        Thread hello = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Hello, world!");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("My name is: " + Thread.currentThread().getName());
        });

        Thread plane = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Russian plane go funk yourself");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("My name is: " + Thread.currentThread().getName());
        });

        hello.start();
        plane.start();
    }
}
