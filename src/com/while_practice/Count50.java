package com.while_practice;

public class Count50 {
    public static void main(String[] args) {
        int j=1;
        int count50=0;

        while (j<=200){
            if (j%50==0){
                System.out.println("Count50 nos are :"+j);
                count50++;
            }
            j++;
        }
        System.out.println("Total count50 nos are :"+count50);
    }
}
