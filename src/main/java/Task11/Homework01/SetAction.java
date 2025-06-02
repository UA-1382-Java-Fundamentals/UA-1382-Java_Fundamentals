package Task11.Homework01;

import java.util.HashSet;
import java.util.Set;

public class SetAction {

    public SetAction() {
    }

    public void union(Set<String> s1, Set<String> s2) {
        s1.addAll(s2);
        System.out.println("Union of 2 set = " + s1);
    }

    public void intersect(Set<String> s1, Set<String> s2) {
        Set<String> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("Intersection set is: "
                + intersection);
    }
}
