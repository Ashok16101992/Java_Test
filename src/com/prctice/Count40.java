package com.prctice;

public class Count40 {

    public static void main(String[] args) {
        int count40=0;

        for(int i=40; i<=200; i++){
            if(i%40==0){
                System.out.println("Count40 number is :"+i);
                count40++;
            }
        }
        System.out.println("Count40 number count is :"+count40);
    }
}
