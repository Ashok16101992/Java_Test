package com.prctice;

public class Count5 {
    public static void main(String[] args) {
        int count5 = 0;

        for (int i = 5; i <= 200; i++) {
            if (i % 5 == 0) {
                System.out.println("Count5 Number is :" + i);
                count5++;
            }
        }
        System.out.println("Count5 Number Count is :" + count5);
    }
}
