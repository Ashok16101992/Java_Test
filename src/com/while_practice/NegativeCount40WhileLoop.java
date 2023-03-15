package com.while_practice;

public class NegativeCount40WhileLoop {
    public static void main(String[] args) {
        int num = -200;
        int count = 0;
        while (num <= 0) {
            if (num % 40 == 0) {
                System.out.println("Count40 no :" + num);
                count++;
            }
            num++;
        }
        System.out.println("Count40 of negative odd nos up to 200 is :"+count);
    }
}
