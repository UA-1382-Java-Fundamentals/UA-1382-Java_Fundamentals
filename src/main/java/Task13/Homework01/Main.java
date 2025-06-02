package Task13.Homework01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sentence = "";
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Hello.Write a sentence please : ");
            sentence = sc.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("No sentence");
        }

        String encrypt = Encrypt_Deskrypt.encryptString(sentence);
        String descrypt  = Encrypt_Deskrypt.decryptString(encrypt);

        System.out.println("Sentence : " + sentence);
        System.out.println("Encrypted : " + encrypt);
        System.out.println("Descrypted : " + descrypt);
    }
}
