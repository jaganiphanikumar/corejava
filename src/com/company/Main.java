package com.company;


import com.datastructures.DoubleLinkedImpl;

public class Main {


    public static void main(String[] args) {

        DoubleLinkedImpl doubleLinked = new DoubleLinkedImpl();
        doubleLinked.add("phani");
        doubleLinked.add("Sumit");
        doubleLinked.add("arya");

        doubleLinked.printElements();

        System.out.println(doubleLinked.get(1));

    }


}
