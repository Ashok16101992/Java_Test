package com.encapsulation;

public class StudentReadOnly {
    private String college="JKC";
    public String getCollege(){
        return college;
    }
    public static void main(String[] args) {
        System.out.println("Read Only");
    }
}
