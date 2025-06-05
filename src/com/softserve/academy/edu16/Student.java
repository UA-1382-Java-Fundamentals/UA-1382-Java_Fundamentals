package com.softserve.academy.edu16;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String bachelor;
    private int id;
    private String name;
    private transient String password;

    public Student(String bachelor, int id, String name, String password) {
        this.bachelor = bachelor;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return "Fac: " + bachelor + ", name: " + name + ", pas: " + password;
    }
}
