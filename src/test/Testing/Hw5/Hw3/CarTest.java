//package Hw5.Hw3;
//
//import com.softserve.academy.edu1.Hw5.Hw3.Car;
//import org.junit.jupiter.api.Test;
//import java.util.ArrayList;
//import java.util.Collections;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CarTest {
//
//    @Test
//    void testListSortingByYear(){
//        Car car = new Car("B", 2005, 920);
//        Car car2 = new Car("B", 2025, 420);
//        Car car3 = new Car("D", 2024, 490);
//
//        ArrayList<Car> list = new ArrayList<>();
//        list.add(car);
//        list.add(car2);
//        list.add(car3);
//
//        Collections.sort(list, (first, second) ->
//                Integer.compare(first.getYearOfProduction(), second.getYearOfProduction()));
//
//        assertEquals(car, list.get(0));
//        assertEquals(car3, list.get(1));
//        assertEquals(car2, list.get(2));
//    }
//}
