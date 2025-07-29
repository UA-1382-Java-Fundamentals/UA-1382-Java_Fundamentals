package com.softserve.academy.homework13.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter text");
        var scanner = new Scanner(System.in);
        var text = scanner.nextLine();
        System.out.println("Enter key");
        var key = scanner.nextInt();
        String encryptedText = encrypt(text,key);
        System.out.println("Encrypted text: " + encryptedText);
        String decryptedText = decrypt(encryptedText,key);
        System.out.println("Decrypted text: " +decryptedText);
    }
    static String encrypt(String text,int key){
        char[] chars = text.toCharArray();
         for(int i = 0; i < chars.length; i++){
             chars[i] = (char) (chars[i] + key);
         }
         return new String(chars);
    }

    static String decrypt(String text,int key){
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - key);
        }
        return new String(chars);
    }
}
