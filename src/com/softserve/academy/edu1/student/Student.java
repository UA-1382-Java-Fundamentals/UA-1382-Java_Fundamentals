package com.softserve.academy.edu1.student;

public record Student (String name, int age) implements Comparable {
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student other) {
            int nameCompare = this.name.compareTo(other.name);
            return (nameCompare != 0) ? nameCompare : Integer.compare(this.age, other.age);
        }
        throw new IllegalArgumentException("Cannot compare Student with " + o.getClass());
    }

    @Override
    public String toString() {
        return "Student{name='%s', age=%d}".formatted(name, age);
    }
}
