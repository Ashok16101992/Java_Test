package com.prctice;

public class EvenNumbers {

    public static void main(String[] args) {
        int evenNumber =0;

        for (int i=0; i<=200;i++){
            if(i%2==0){
                System.out.println(i+": is Even Number");
                evenNumber++;
            }
        }
        System.out.println("Even numer count is :"+evenNumber);
    }
}
