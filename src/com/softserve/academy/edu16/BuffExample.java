package com.softserve.academy.edu16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffExample {
    public static void main(String[] args) {
        String file = "src/com/softserve/academy/edu16/text.txt";
        String text = "Hello, world! This is a test of buffered I/O in Java.\n" +
                "Buffered streams can improve performance by reducing the number of I/O operations.\n" +
                "This is especially useful when dealing with large files or frequent read/write operations.";
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(file))) {
            System.out.println("Writing text to file: " + file);
            for (int i = (int) (Math.random() * 10); --i >= 0; ) {
                bufferedWriter.write(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}