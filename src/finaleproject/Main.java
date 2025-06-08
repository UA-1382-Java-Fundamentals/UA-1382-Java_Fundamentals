package finaleproject;

public class Main {
    public static void main(String[] args) {
        SimpleBot bot = new SimpleBot("Sonic", 2025);

        bot.greet();
        String userName = bot.remindName();
        System.out.println("What a great name you have, " + userName + "!");
        bot.guessAge();
        bot.count();
        bot.test();
    }
}
