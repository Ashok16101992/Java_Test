package com.encapsulation;

public class TestDogClass {
    public static void main(String[] args) {
        Dog a=new Dog("Jack Russell Terriers", (byte) 12,"Terriles");
        Dog b=new Dog("golden retriever", (byte) 10,"retriever");
        Dog c=new Dog("German Shepherd", (byte)15,"Shepherd");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
