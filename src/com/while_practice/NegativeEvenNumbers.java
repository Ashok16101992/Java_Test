package com.while_practice;

public class NegativeEvenNumbers {
    int count = 0;

    public void evennumbers() {
        int num = 0;
        for (num = -200; num <= 0; num++) {
            if (num % 2 == 0) {
                System.out.println("Negative Even Numbers" + num);
                count++;
            }
//            System.out.println("Count of Negative Even nos upto -200 is :"+count);
//            else {
//                System.out.println("Negative Odd Numbers" + num);
            //        }

        }
    }

    public static void main(String[] args) {
        NegativeEvenNumbers numbers = new NegativeEvenNumbers();
        numbers.evennumbers();
        System.out.println("Count of even nos are : " + numbers.count);


    }
}
