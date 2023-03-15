package com.while_practice;

public class NegativeCount10Numbers {
    public static void main(String[] args) {
        int count=0;
        int num=0;
        for (num=-200; num<=0;num++){
            if (num%10==0){
                System.out.println("Count 10 numbers"+num);
                count++;
            }
        }
        System.out.println("Count 10 nos up to 200 :"+count);

    }
}
