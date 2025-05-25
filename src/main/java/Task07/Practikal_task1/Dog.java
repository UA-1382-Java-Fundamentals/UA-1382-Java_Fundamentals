package Task07.Practikal_task1;

public class Dog implements Animal{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voise(){
        System.out.println("DOG " + name + " say GAV-GAV");
    }

    public  void feed(){
        System.out.println("DOG " + name + " eat a meat");
    }
}
