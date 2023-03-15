package com.prctice;

public class OddNumbers {

    public static void main(String[] args) {
        int oddNumber =0;
         for(int i=0; i<=200; i++){
             if(i%2!=0){
                 System.out.println(i+": is odd number");
                 oddNumber++;
             }
         }
         System.out.println("Count of Odd Number is:"+oddNumber);
    }
}
