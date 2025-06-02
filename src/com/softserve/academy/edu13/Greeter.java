package com.softserve.academy.edu13;

@FunctionalInterface
public interface Greeter {
    void sayHello(String name);
    default void sayGoodbye(String name) {
        System.out.println("Goodbye, " + name + "!");
    }
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    String toString();
    int hashCode();
    boolean equals(Object obj);
}
class FuncInterfaceDemo{
    public static void main(String[] args) {
        // Using a lambda expression to implement the Greeter interface
        Greeter greeter = name -> System.out.println("Hello, " + name + "!");

        // Calling the method
        greeter.sayHello("John");
        // Calling the default method
        greeter.sayGoodbye("John");
        // Calling the static method
        Greeter.staticMethod();


    }
}