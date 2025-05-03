package Task05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysSortTest {

    String[] stringArray = {"DD","BB","AA","CC"};
    int[] intList = {1,2,3,4,5};

    ArraysSort list = new ArraysSort();

    @Test
    void sortedStringArray() {
        String[] expectList = {"AA","BB","CC","DD"};

        assertArrayEquals(expectList,list.sortedStringArray(stringArray));
    }

    @Test
    void averageValue() {
        assertEquals(3,list.averageValue(intList));
    }

    @Test
    void isContain() {

        assertTrue(list.isContain(stringArray,"AA"));

        assertFalse(list.isContain(stringArray,"FF"));
    }
}