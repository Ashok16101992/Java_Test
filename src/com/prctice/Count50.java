package com.prctice;

public class Count50 {

    public static void main(String[] args) {
        int count50=0;

        for(int i=50; i<=200; i++){
            if(i%50==0){
                System.out.println("Count50 number is :"+i);
                count50++;
            }
        }
        System.out.println("Count50 number count is :"+count50);
    }
}
