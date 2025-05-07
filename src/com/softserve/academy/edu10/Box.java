package com.softserve.academy.edu10;

public class Box<T> {
    private T t;

    public T getObject() {
        return t;
    }
    public void setObject(T t) {
        this.t = t;
    }
    //Compile error
//    public T createObject(T t) {
//        return new T();
//    }
}
