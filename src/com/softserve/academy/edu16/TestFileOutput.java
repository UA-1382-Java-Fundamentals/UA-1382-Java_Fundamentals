package com.softserve.academy.edu16;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.stream.IntStream;

public class TestFileOutput {
    public static void main(String[] args) {
        String fileName = "src/com/softserve/academy/edu16/numbers.txt";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("Reading bytes from file: " + fileName);
            int bytesAvailable = fis.available();
            byte[] bytes = new byte[bytesAvailable];
            int count = fis.read(bytes, 0, bytesAvailable);
            System.out.println("Bytes read successfully: " + count);
            IntStream.range(0, bytes.length)
                    .map(i -> bytes[i])
                    .forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
