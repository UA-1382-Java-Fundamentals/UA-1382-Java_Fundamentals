package com.softserve.academy.edu1.Hw5.Hw2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaltulatorTest {

    @Test
    public void testCaltulator() {
      double result =  MainHw5_2.sum(2,4);
        assertEquals(result,6.0,0.00001 );
    }
}
