package com.while_practice;

public class Odd_Numbers {

    public static void main(String[] args) {
        int j=1;
        int count=0;

        while (j<=200){
            if (j%2!=0){
                System.out.println(j+": is Odd Number");
                count++;
            }
            j++;
        }
        System.out.println("The total count of odd nos is :"+count);
    }
}
