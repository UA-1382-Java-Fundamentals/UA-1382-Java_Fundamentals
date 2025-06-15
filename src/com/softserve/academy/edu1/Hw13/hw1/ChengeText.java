package com.softserve.academy.edu1.Hw13.hw1;

public class ChengeText {
    public static String encrypt(String slovo, int n) {
        String result = "";
        for (int i = 0; i < slovo.length(); i++) {
            char simvol = slovo.charAt(i);
            if (simvol >= 'a' && simvol <= 'z') {
                char shifted = (char) (simvol + n);
                if (shifted > 'z') {
                    shifted -= 26;
                }
                result += shifted;
            } else {
                result += simvol; //Пробіл
            }
        }
        return result;
    }

    public static String decrypt(String slovo, int n) {
        String result = "";
        for (int i = 0; i < slovo.length(); i++) {
            char simvol = slovo.charAt(i);
            if (simvol >= 'a' && simvol <= 'z') {
                char shifted = (char) (simvol - n);
                if (shifted < 'a') {
                    shifted += 26; // повертаємося в кінець алфавіту
                }
                result += shifted;
            } else {
                result += simvol;
            }
        }
        return result;
    }
}
