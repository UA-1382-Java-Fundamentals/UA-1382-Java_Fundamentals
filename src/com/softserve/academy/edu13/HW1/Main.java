package softserve.academy.edu13.HW1;

//1. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//Method encrypt should take a string and return coded string where every letter is moved
//on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
//return decoded value

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        String message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

        BiFunction<String, Integer, String> encrypt = (s, n) -> {
            char[] chars = s.toCharArray();
            StringBuilder cypher = new StringBuilder();
            for (char c : chars) {
                if (Character.isLetterOrDigit(c)) {
                    c = (char) (c + n);
                }
                cypher.append(c);
            }
            return cypher.toString();
        };

        String cypher = encrypt.apply(message, 1);

        BiFunction<String, Integer, String> decrypt = (s, n) -> {
            char[] chars = s.toCharArray();
            StringBuilder decipher = new StringBuilder();
            for (char c : chars) {
                if (Character.isLetterOrDigit(c)) {
                    c = (char) (c - n);
                }
                decipher.append(c);
            }
            return decipher.toString();
        };

        String decipher = decrypt.apply(cypher, 1);

        System.out.println("Original message: ");
        System.out.println(message);
        System.out.println("===".repeat(15));

        System.out.println("Encrypted message: ");
        System.out.println(cypher);
        System.out.println("===".repeat(15));

        System.out.println("Decrypted message: ");
        System.out.println(decipher);
        System.out.println("===".repeat(15));

        System.out.println("equals() result: " + decipher.equals(message));
    }
}
