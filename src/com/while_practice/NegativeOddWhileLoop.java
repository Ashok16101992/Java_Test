package com.while_practice;

public class NegativeOddWhileLoop {
    public static void main(String[] args) {
        int num = -200;
        int count = 0;
        while (num <= 0) {
            if (num % 2 != 0) {
                System.out.println("Odd no :" + num);
                count++;
            }
            num++;
        }
        System.out.println("Count of negative odd nos are :"+count);
    }
}
