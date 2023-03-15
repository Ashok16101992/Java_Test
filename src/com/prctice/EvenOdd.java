package com.prctice;

public class EvenOdd {

    public void evencount() {

    }

    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int count5 = 5;

        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println("Even No :" + i);
                evenCount++;
            } else if (i % 2 != 0) {
                System.out.println("Odd No :" + i);
                oddCount++;
            }
            if (i % 5 == 0) {
                System.out.println("Count5 No is:" + i);
                count5++;
            }
        }
        System.out.println("Even Count :" + evenCount);
        System.out.println("Odd Count :" + oddCount);
        System.out.println("Count5 :" + count5);
    }
}
