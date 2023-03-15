package com.while_practice;

public class Count40 {
    public static void main(String[] args) {
        int j=1;
        int count40=0;

        while (j<=200){
            if (j%40==0){
                System.out.println("Count40 nos are :"+j);
                count40++;
            }
            j++;
        }
        System.out.println("Total count40 nos are :"+count40);
    }
}
