package com.while_practice;

public class NegativeCount10WhileLoop {
    public static void main(String[] args) {
        int num = -200;
        int count = 0;
        while (num <= 0) {
            if (num % 10 == 0) {
                System.out.println("Count10 no :" + num);
                count++;
            }
            num++;
        }
        System.out.println("Count10 of negative odd nos up to 200 is :"+count);
    }
}
