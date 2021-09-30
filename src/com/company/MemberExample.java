package com.company;

public class MemberExample extends Inheritance{

    int i;
    String name;

    MemberExample(int i){
        super(i);
        this.i = i;
    }

    MemberExample(int i, String name){
        this(i);
        this.name=name;
        this.printName();
    }


    void printName(){
        System.out.println("Name is : "+name);
    }

}

class Inheritance{
    int j=10;
    static {
        System.out.println("Static inheritance");
    }

    Inheritance(int j){
        this.j = j;
        System.out.println("argumented constructor");
    }

    Inheritance(){
        System.out.println("no-arg constructor");
    }

}

class SuperClass extends Inheritance{


}


class Subclass extends SuperClass{

}
