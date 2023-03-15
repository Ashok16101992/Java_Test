package com.prctice;

public class Count30 {

    public static void main(String[] args) {
        int count30=0;

        for(int i=30; i<=200; i++){
            if(i%30==0){
                System.out.println("Count30 number is :"+i);
                count30++;
            }
        }
        System.out.println("Count30 number count is :"+count30);
    }
}
