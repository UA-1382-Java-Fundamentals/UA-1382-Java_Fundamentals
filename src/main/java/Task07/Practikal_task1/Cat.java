package Task07.Practikal_task1;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void voise(){
        System.out.println("CAT " + name + " say MIY-MIY");
    }

    public  void feed(){
        System.out.println("CAT " + name + " eat a 'Citty-cat'");
    }


}
