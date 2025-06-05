package com.softserve.academy.edu16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExample {
    public static void main(String[] args) {
        byte[] bytes = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};

        String fileName = "src/com/softserve/academy/edu16/numbers.txt";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            System.out.println("Writing bytes to file: " + fileName);
            fos.write(bytes);
            System.out.println("Bytes written successfully.");
            System.out.println("Size of the file: " + bytes.length + " bytes");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}