package com.softserve.academy.edu13;
@FunctionalInterface
public interface Creator {
    String create(String name);
}

class CreatorDemo {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Creator interface
        Creator creator = name -> new String(name);
        Creator creator2 = String::new;

        System.out.println(creator.create("Test"));// Method reference
        System.out.println(creator2.create("Java"));// Lambda expression
    }
}
