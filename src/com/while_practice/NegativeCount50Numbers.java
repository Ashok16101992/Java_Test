package com.while_practice;

public class NegativeCount50Numbers {
    public static void main(String[] args) {
        int count=0;
        int num=1;
        for (num=-200; num<=0;num++){
            if (num%50==0){
                System.out.println("Count 50 numbers"+num);
                count++;
            }
        }
        System.out.println("Count 50 nos up to 200 :"+count);

    }
}
