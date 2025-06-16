package com.softserve.academy.edu1.Hw10.hw1;

public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.feelList();
        collection.printList();

        System.out.println("=-".repeat(12));

        collection.swapList();//Перше завдання (Swap)
        collection.printList();

        System.out.println("=-".repeat(12));

        collection.firstNegativeElement();//заміна на трьох значне
        collection.printList();

        System.out.println("=-".repeat(12));
        collection.cloneK_Elements(4);
        collection.printList1();
        System.out.println("=-".repeat(12));
        collection.printList2();

        System.out.println("=-".repeat(12));
        collection.removeLastEvenElement();
        collection.printList();

        System.out.println("=-".repeat(12));
        collection.removeFirstMinElement();
        collection.printList();
    }
}
