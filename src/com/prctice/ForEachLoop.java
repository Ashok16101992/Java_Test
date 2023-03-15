package com.prctice;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] names={"Java","C","C++","Python","Selenium"};
        System.out.println("Printing the conetent of the array");
        for (String name:names){
            System.out.println(name);
        }
    }
}
