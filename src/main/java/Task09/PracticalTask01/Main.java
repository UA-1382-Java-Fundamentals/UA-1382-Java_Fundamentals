package Task09.PracticalTask01;

public class Main {

    public static void main(String[] args){
        Department dep1 = new Department("Centr");
        Department.Addres adres1 =dep1.new Addres("Warszawa","Pruszkowska",123);

        try {
         Department.Addres copyAdres1 = (Department.Addres) adres1.clone();
            System.out.println("Before changes");
            System.out.println(adres1.toString());
            System.out.println(copyAdres1.toString());

            copyAdres1.setBuilding(666);
            copyAdres1.setCity("Krakow");

            System.out.println("=*=".repeat(15));
            System.out.println(adres1.toString());
            System.out.println(copyAdres1.toString());
        } catch (CloneNotSupportedException e) {
           throw new RuntimeException(e);
        }
    }
}
