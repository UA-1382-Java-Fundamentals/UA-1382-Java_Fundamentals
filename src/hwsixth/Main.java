package hwsixth;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();  // Орел
        birds[1] = new Swallow(); // Ластівка
        birds[2] = new Penguin(); // Пінгвін
        birds[3] = new Kiwi();    // Ківі


        for (Bird bird : birds) {
            System.out.print(bird.getClass().getSimpleName() + ": ");
            bird.fly();
        }
    }
}
