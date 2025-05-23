package Task11.Homework01;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet set1 = new HashSet<>();
        HashSet set2 = new HashSet<>();

        set1.add("Petro");
        set1.add("Pavlo");
        set1.add("Ivan");
        set1.add("Taras");
        set1.add("Igor");
        System.out.println("Set1 = " + set1);

        set2.add("Petro");
        set2.add("Igor");
        set2.add("Nadia");
        set2.add("Olena");
        set2.add("Sofia");
        System.out.println("Set2 = " + set2);

        SetAction sA = new SetAction();

        sA.intersect(set1, set2);
        sA.union(set1, set2);


    }
}
