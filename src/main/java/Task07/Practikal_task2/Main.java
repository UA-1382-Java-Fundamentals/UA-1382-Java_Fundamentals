package Task07.Practikal_task2;

public class Main {

    public static void main (String[] args){

        Person[] personList = {
                new Teacher("Olha",14500),
                new Teacher("Ivan",16000),
                new Cleaner("Julia",12300),
                new Cleaner("Serhii",12000),
                new Student("Petro"),
                new Student("Lidia")
        };

        for (Person p : personList){
            p.print();
            if (p.getClass().equals(Teacher.class) ){
                ((Teacher) p).salary();
            }
            if(p instanceof Cleaner){
                ((Cleaner) p).salary();
            }
        }
    }
}
