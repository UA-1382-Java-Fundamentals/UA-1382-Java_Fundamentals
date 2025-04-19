package Task_3_OOP.Example.Example.PracticalTask;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(){
    }

    public double getSalary(double rate, int hours){
       double salary = rate * hours;
       return salary;
    }

    public double getBonuses(double salary){
        double bonuse = salary * 0.1;
        return bonuse;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}' + "have total salary : ";
    }

    public double getTotal(Employee worker){
        totalSum = getSalary(worker.getRate(),worker.getHours()) + getBonuses(getSalary(worker.getRate(),worker.getHours()));
        return totalSum;
    }



    public static void main (String[] args){

        Employee worker1 = new Employee("Vasyl", 75,160);
        Employee worker2 = new Employee("Ivan", 79,164);
        Employee worker3 = new Employee("Petro", 68,156);



        System.out.println(worker1.toString() + worker1.getTotal(worker1));
        System.out.println(worker2.toString() + worker2.getTotal(worker2));
        System.out.println(worker3.toString() + worker3.getTotal(worker3));
    }
}
