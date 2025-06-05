package com.softserve.academy.edu16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufReaderExample {
    public static void main(String[] args) {
        String file = "src/com/softserve/academy/edu16/text.txt";

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(file))) {
            System.out.println("Reading  text from file: " + file);
            String str;
            int count = 0;

            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
