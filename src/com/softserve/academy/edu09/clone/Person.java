package com.softserve.academy.edu09.clone;

/**
 * Person class represents a person with a full name and age.
 * This class implements the Cloneable interface to support deep cloning.
 * It demonstrates how to properly implement deep cloning for objects with reference fields.
 */
public class Person implements Cloneable {

    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }

    /**
     * Creates a deep copy of this Person object.
     * This method overrides the clone method to make a deep copy of the object and its reference fields.
     * The method is changed to return a Person object (covariant return type) and has public visibility.
     *
     * @return A deep copy of this Person object
     * @throws AssertionError if cloning is not supported (should not happen as this class implements Cloneable)
     */
    @Override
    public Person clone() {
        try {
            // Create a shallow copy using Object.clone()
            Person cloned = (Person) super.clone();
            // Create a deep copy by cloning the reference field
            cloned.fullName = this.fullName.clone(); // Clone the FullName object
            return cloned;
        } catch (CloneNotSupportedException e) {
            // This should never happen since we implement Cloneable
            throw new AssertionError(); // Can't happen
        }
    }

    public void setFullName(String firstName, String lastName) {
        this.fullName.setFirstName(firstName);
        this.fullName.setLastName(lastName);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
