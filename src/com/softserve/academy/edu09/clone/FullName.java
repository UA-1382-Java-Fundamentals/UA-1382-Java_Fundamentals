package com.softserve.academy.edu09.clone;

/**
 * FullName class represents a person's full name with first and last name components.
 * This class implements the Cloneable interface to support object cloning.
 */
public class FullName implements Cloneable {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public FullName clone() {
        try {
            return (FullName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\''
                ;
    }
}
