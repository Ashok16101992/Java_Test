package com.while_practice;

public class NegativeOddNumbers {
    int count=0;
    public void oddNumbers(){
        int num=0;

        for (num=-200; num<=0; num++){
            if (num%2==0){
                System.out.println("Negative Odd numbers "+num);
                count++;
            }
        }
    }
    public static void main(String[] args) {
        NegativeOddNumbers numbers=new NegativeOddNumbers();
        numbers.oddNumbers();
        System.out.println("Count of Negative odd nos is :"+numbers.count);
    }
}
