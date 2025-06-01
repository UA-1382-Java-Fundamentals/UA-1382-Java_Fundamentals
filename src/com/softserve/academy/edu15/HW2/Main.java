package softserve.academy.edu15.HW2;

//2. Cause a deadlock. Organize the expectations of ending a thread in main(), and make
//the end of the method main() in this thread.

public class Main {
    static final Object lockRight = new Object();
    static final Object lockLeft = new Object();

    public static void main(String[] args) throws InterruptedException {
        int count = 100;
        for (int i = 0; i < count; i++) {
            leftRight();
        }
        System.out.println("This is the end.");
    }

    private static void leftRight() throws InterruptedException {
        Thread left = new Thread(() -> {
            synchronized (lockLeft) {
                synchronized (lockRight) {
                    System.out.println("Go Left!");
                }
            }
        });

        Thread right = new Thread(() -> {
            synchronized (lockRight) {
                synchronized (lockLeft) {
                    System.out.println("Look Left!");
                }
            }
        });

        left.start();
        right.start();
        Thread.sleep(10);
        System.out.println(left.getState());
        System.out.println(right.getState());
        System.out.println("===".repeat(20));
    }
}
