package com.softserve.academy.edu10;

public class App {
    public static void main(String[] args) {
//        String text = "Hello, World!";
//
//        //Box box = new Box();
//        WrapperBox box = new WrapperBox();
//        box.setObject(text);
//
//      //  Integer numb = (Integer) box.getObject();
//        String message = box.getObject();
//        System.out.println(message);

        Box<String> boxString = new Box<>();
        boxString.setObject("Hello, World!");
       // boxString.setObject(String.valueOf(42));
       // boxString.setObject(true);//Compile error
        String message = boxString.getObject();
        System.out.println(message);

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setObject(42);
        Integer number = boxInteger.getObject();
        System.out.println(number);

        Box<Double> boxDouble = new Box<>();
        boxDouble.setObject(3.14);
        Double pi = boxDouble.getObject();
        System.out.println(pi);

        Box<Number> boxNumber = new Box<>();
        boxNumber.setObject(42);
        //boxNumber.setObject("Hello, World!"); // Compile error
        //boxNumber.setObject(true); // Compile error
        boxNumber.setObject(3.14); // Compile error



        //Box<Object> boxObject = new Box<>();
        //boxObject.setObject("Hello, World!");
        //boxObject.setObject(42);
        //boxObject.setObject(true); // Compile error

    }
}
