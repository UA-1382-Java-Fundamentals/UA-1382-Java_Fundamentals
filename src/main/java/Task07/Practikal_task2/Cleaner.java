package Task07.Practikal_task2;

public class Cleaner extends Staff {

    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
    }

    public Cleaner(String name, int salar) {
        super.setName(name);
        super.setSalar(salar);
    }

    public void salary(){
        System.out.println(TYPE_PERSON + " salary is " + getSalar());
    }

    public  void print(){
        System.out.println("I am a ..." + TYPE_PERSON);
    }
}

