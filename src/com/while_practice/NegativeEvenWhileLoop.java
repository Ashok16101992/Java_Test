package com.while_practice;

public class NegativeEvenWhileLoop {

    public static void main(String[] args) {
        int num = -200;
        int count = 0;
        while (num <= 0) {
            if (num % 2 == 0) {
                System.out.println("Even no :" + num);
                count++;
            }
            num++;
        }
        System.out.println("Count of negative even nos are :"+count);
    }
}
