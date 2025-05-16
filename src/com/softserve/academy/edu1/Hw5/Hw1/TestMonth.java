package com.softserve.academy.edu1.Hw5.Hw1;

import org.junit.Test;

import java.time.Month;

import static org.junit.Assert.assertEquals;

public class TestMonth {

    //private final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    @Test
    public void Monthtest() {
        MonthDays moth = new MonthDays();

        int numofmonth= moth.getDays(4);
        assertEquals(30,numofmonth);
    }

    @Test
    public void processArray(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        ArrayProc proc = new ArrayProc();
       int result= proc.processArray(array);
       assertEquals(15,result);
    }

}
