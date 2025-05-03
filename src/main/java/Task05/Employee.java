package Task05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {

       private String name;
       private int departmentNumber;
       private int salary;

       public int getDepartmentNumber() {
              return departmentNumber;
       }

       public Employee() {
       }

       @Override
       public String toString() {
              return "Name='" + name + '\'' +
                      ", departmentNumber=" + departmentNumber +
                      ", salary=" + salary;
       }

       public Employee(String name, int departmentNumber, int salary) {
              this.name = name;
              this.departmentNumber = departmentNumber;
              this.salary = salary;
       }

       public static void main(String[] args){

              Employee work = new Employee();

              Employee worker1 = new Employee("Artur", 1,4300);
              Employee worker2 = new Employee("Piotr", 3,5230);
              Employee worker3 = new Employee("Sara", 1,3950);
              Employee worker4 = new Employee("Sara", 2,4070);
              Employee worker5 = new Employee("Bogdan", 5,6300);

              Employee[] workerList = {worker1,worker2,worker3,worker4,worker5};
              int count = 0;

              Scanner sc = new Scanner(System.in);
              System.out.print("Choise a department from '1' to '5': ");
              int choiseDepart = sc.nextInt();

              for (Employee i : workerList ){
                     if(workerList[count].getDepartmentNumber() == choiseDepart){
                            System.out.println(workerList[count].toString());
                     }
                     count++;
              }

              Arrays.sort(workerList, new Comparator<Employee>() {
                     @Override
                     public int compare(Employee o1, Employee o2) {
                            return Integer.compare(o1.salary, o2.salary);
                     }
              }
              );
              for (int i = workerList.length-1; i >=0 ; i--){
                     System.out.println(workerList[i].toString());
              }
       }
}
