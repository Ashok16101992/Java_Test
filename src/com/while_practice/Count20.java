package com.while_practice;

public class Count20 {
    public static void main(String[] args) {
        int j=1;
        int count20=0;

        while (j<=200){
            if (j%20==0){
                System.out.println("Count20 nos are :"+j);
                count20++;
            }
            j++;
        }
        System.out.println("Total count20 nos are :"+count20);
    }
}
