package com.softserve.academy.edu12;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "Ja" + "va";
        System.out.println(System.identityHashCode(str3));
        System.out.println(str1 == str3);

        String str4 = "Ja".concat("va").intern();
        System.out.println(System.identityHashCode(str4));
        System.out.println(str1 == str4);

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(str1.equals(sb));
        System.out.println(str1.contentEquals(sb));
        System.out.println(toTitleCase("OLHA"));

    }

    public static String toTitleCase(String s) {
        return Character.toTitleCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
}
