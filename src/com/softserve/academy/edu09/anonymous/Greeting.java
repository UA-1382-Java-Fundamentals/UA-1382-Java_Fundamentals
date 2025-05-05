package com.softserve.academy.edu09.anonymous;

/**
 * This is an example of an anonymous class in Java.
 * Anonymous classes enable you to make your code more concise and readable.
 * They are often used for event handling, callbacks,
 * or when you need a one-time implementation of an interface or abstract class.
 */
public interface Greeting {
    void sayHello();
}

class App{
    public static void main(String[] args) {
        // Using an anonymous class to implement the Greeting interface.
        // This is a one-time implementation of the sayHello method
        // without creating a separate class.

        Greeting greeting = new Greeting(){
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };

        greeting.sayHello();
    }
}
