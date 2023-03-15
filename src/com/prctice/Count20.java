package com.prctice;

public class Count20 {

    public static void main(String[] args) {
        int count20=0;

        for(int i=20; i<=200; i++){
            if(i%20==0){
                System.out.println("Count20 number is :"+i);
                count20++;
            }
        }
        System.out.println("Count20 number count is :"+count20);
    }
}
