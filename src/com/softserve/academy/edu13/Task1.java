package com.softserve.academy.edu13;


public class Task1 {
    //Encrypt and decrypt each letter on n positions
    public static String encrypt(String s, int n) {
        return shift(s, n);
    }

    public static String decrypt(String s, int n) {
        return shift(s, -n);
    }

    private static String shift(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int shifted = (c - base + n + 26) % 26 + base;
                result.append((char) shifted);
            } else {
                result.append(c);//Keep other symbols unchanged
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String original = "abc 123";
        int shift = 3;

        String encrypted = encrypt(original, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}