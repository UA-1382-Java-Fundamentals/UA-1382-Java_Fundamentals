package com.softserve.academy.edu1.Functional_interfaces;

public class CaesarCipher {

    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + n) % 26 + base);
            }
            result.append(c);
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 26 - (n % 26));
    }
}