package com.prctice;

public class ElseIfStatement {
    public static void main(String[] args) {
        String city="Hyderabad";

        if (city=="Banglore"){
            System.out.println("City is Banglore");
        } else if (city=="Kerala") {
            System.out.println("City is Kerala");
        } else if (city=="Guntur") {
            System.out.println("City is Guntur");
        } else if (city=="vijayawada") {
            System.out.println("City is Vijayawada");
        }else {
            System.out.println("City is : "+city);
        }
    }
}
