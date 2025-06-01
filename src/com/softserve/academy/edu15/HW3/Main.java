package softserve.academy.edu15.HW3;

//3. Create a thread «one», which would start the thread «two», which has to output its
//number («Thread number two») 3 times and create thread «three», which would to
//output message «Thread number three» 5 times

public class Main {
    public static void main(String[] args) {
        Thread three = new Thread(() -> {
            int count = 5;
            for (int i = 0; i < count; i++) {
                System.out.println("Thread number three");
            }
            System.out.println("===".repeat(20));
        });

        Thread two = new Thread(() -> {
            int count = 3;
            for (int i = 0; i < count; i++) {
                System.out.println("Thread number two");
            }
            System.out.println("===".repeat(20));
            three.start();
        });

        Thread one = new Thread(two::start);

        one.start();

    }
}
