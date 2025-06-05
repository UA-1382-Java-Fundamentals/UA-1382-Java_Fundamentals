package com.softserve.academy.edu16;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src", "com", "softserve", "academy", "edu16", "text.txt");
        Path filePath2 = Paths.get("src/com/softserve/academy/edu16", "text.txt");
        Path filePath3 = Paths.get("src", "com", "softserve", "academy", "edu16", "text.txt").toAbsolutePath();

        System.out.println("File Path: " + filePath3);
        Path target = Paths.get("src", "text2.txt");
        Files.copy(filePath3, target);


    }
}
