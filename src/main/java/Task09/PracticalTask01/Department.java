package Task09.PracticalTask01;

public class Department implements Cloneable{

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }

    public class Addres implements Cloneable {
       private String city;
       private String street;
       private int building;

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return "Addres{" + "Department ='" + name + '\'' +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public Addres(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;


        }
        public Object clone() throws CloneNotSupportedException{

            return super.clone();
        }
    }
    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }

}
