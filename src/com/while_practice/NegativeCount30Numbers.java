package com.while_practice;

public class NegativeCount30Numbers {
    public static void main(String[] args) {
        int count=0;
        int num=0;
        for (num=-200; num<=0;num++){
            if (num%30==0){
                System.out.println("Count 30 numbers"+num);
                count++;
            }
        }
        System.out.println("Count 30 nos up to 200 :"+count);

    }
}
