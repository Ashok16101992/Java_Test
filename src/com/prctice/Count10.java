package com.prctice;

public class Count10 {
    public static void main(String[] args) {
        int count10 = 0;

        for (int i = 10; i <= 200; i++) {

            if (i % 10 == 0) {
                System.out.println("Count10 number is :" + i);
                count10++;
            }
        }
        System.out.println("Count10 count is :" + count10);
    }
}
