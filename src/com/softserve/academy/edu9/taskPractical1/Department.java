package softserve.academy.edu9.taskPractical1;

public class Department implements Cloneable {
    protected String name;
    protected Address address;

    public Department(String name, String street, String city, int building) {
        this.name = name;
        this.address = new Address(street, city, building);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.address.setCity(city);
    }

    public void setStreet(String street) {
        this.address.setStreet(street);
    }

    public void setBuilding(int building) {
        this.address.setBuilding(building);
    }

    @Override
    public String toString() {
        return name + " | " + address.toString();
    }

    @Override
    public Department clone() {
        try {
            Department newClone = (Department)super.clone();
            newClone.address = this.address.clone();
            return newClone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private class Address implements Cloneable {
        private String street;
        private String city;
        private int building;

        public Address(String street, String city, int building) {
            this.street = street;
            this.city = city;
            this.building = building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return city + ", " + street + ", " + building;
        }

        @Override
        public Address clone() throws CloneNotSupportedException {
            return (Address)super.clone();
        }
    }
}
