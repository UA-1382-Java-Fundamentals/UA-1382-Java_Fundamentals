package softserve.academy.edu15.HW1;

//1. Run three threads and output there different messages for 5 times. The third thread
//supposed to start after finishing working of the two previous threads.

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        Thread lorem = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                System.out.println("Lorem");
            }
        });

        Thread ipsum = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                System.out.println("ipsum");
            }
        });

        Thread dolor = new Thread(() -> {
            for (int i = 0; i < count; i++) {
                System.out.println("dolor");
            }
        });

        lorem.start();
        ipsum.start();

        lorem.join();
        ipsum.join();

        dolor.start();
    }
}
