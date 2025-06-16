package com.softserve.academy.edu1.Hw11.hw2;

import java.util.Map;

public class main {
    public static void main(String[] args) {
        PersonMap map =new PersonMap();
        map.print();
        map.findSameName("Oleh");
        map.remove("Pavlo");
        map.print();
    }
}
