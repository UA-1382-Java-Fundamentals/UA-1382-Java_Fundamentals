package com.softserve.academy.edu16;

import java.io.*;

public class DemoSerialization {
    public static void main(String[] args) {
        Student student = new Student("ComputerScience", 1, "Shevchenko", "12345");
        System.out.println(student);     // save object in file
        File fw = new File("demo.cer");
        try {
            ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
            ostream.writeObject(student);
            ostream.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        File fr = new File("demo.cer");
        try {
            ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
            Student unknown = (Student) istream.readObject();
            istream.close();
            System.out.println(unknown);
        } catch (ClassNotFoundException | IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
