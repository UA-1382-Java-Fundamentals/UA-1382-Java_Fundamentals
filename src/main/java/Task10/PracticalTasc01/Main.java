package Task10.PracticalTasc01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<HeavyBox> fruitList = new ArrayList<>();
        fruitList.add(new HeavyBox(12,"Orange"));
        fruitList.add(new HeavyBox(18,"Banana"));
        fruitList.add(new HeavyBox(22,"Ananas"));
        fruitList.add(new HeavyBox(7,"Kiwi"));
        fruitList.add(new HeavyBox(10,"Lemon"));

        for(HeavyBox h : fruitList){
            System.out.println(h.toString());
        }

        fruitList.set(0,new HeavyBox(11,"Orange"));
        fruitList.remove(fruitList.size()-1);

        System.out.println("*=*".repeat(20));

        for(HeavyBox h : fruitList){
            System.out.println(h.toString());
        }
    }
}
