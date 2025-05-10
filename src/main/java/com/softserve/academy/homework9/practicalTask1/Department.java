package com.softserve.academy.homework9.practicalTask1;


public class Department  implements Cloneable{
    private String name;
    Address address;


    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    static class Address implements Cloneable{
       String city;
       String street;
       int buildingNumber;

       public Address(String city, String street, int buildingNumber) {
           this.city = city;
           this.street = street;
           this.buildingNumber = buildingNumber;
       }

        @Override
        public Address clone() {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }

        @Override
        public String toString() {
            return "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", buildingNumber=" + buildingNumber +
                    '}';
        }
    }

    @Override
    public Department clone() {
        try {
            var res = (Department) super.clone();
            res.address = address.clone();
            return res;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
