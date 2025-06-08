package softserve.academy.edu15.taskPractical1;

//1. Output text «I study Java» 10 times with the intervals of one second
//(Thread.sleep(1000);).

public class Main {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.start();
    }
}
