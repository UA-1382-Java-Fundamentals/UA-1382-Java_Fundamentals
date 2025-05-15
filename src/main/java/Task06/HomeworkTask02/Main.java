package Task06.HomeworkTask02;

public class Main {

    public static void main (String[] args){

        Employee[] workerList = {
                new Employee("Bogdan",34,14550.5),
                new Employee("Taras",29,12850.8),
                new Developer("Artem",45,16200.0,"Admin"),
                new Developer("Andriy",38,10500.0,"Security")
        };

        for (int i = 0; i<= workerList.length-1; i++){
            System.out.println(workerList[i].report());
        }



    }
}
