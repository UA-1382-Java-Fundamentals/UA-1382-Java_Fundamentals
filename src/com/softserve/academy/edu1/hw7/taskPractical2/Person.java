package softserve.academy.edu1.hw7.taskPractical2;

// In class Staff
//declare abstract method salary(). In each concrete
//class create constant TYPE_PERSON. Output type of
//person in each constructors.
//
// In main() method
//create an array of Person and add some Teachers,
//Cleaners and Students. Call method print() for all of
//it. Call method salary() for all Teachers and Cleaners

abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void print();
    
}
