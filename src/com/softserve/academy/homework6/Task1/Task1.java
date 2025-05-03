package softserve.academy.homework6.Task1;

public class Task1 {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };
        for (Bird bird : birds){
            bird.printInfo();
            bird.fly();
            System.out.println();
        }
    }


}
