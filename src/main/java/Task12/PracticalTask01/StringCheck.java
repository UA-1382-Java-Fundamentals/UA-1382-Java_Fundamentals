package Task12.PracticalTask01;

public class StringCheck {

    public StringCheck() {
    }

    public boolean isContent (String s1, String s2){
        if(s1.contains(s2)) {
            System.out.println("S1 content S2");
            return true;
        }
        else{
            System.out.println("S1 DONT CONTENT S2");
            return false;
        }
    }
}
