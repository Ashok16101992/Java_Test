package com.while_practice;

public class Count10 {
    public static void main(String[] args) {
        int j=1;
        int count10=0;

        while (j<=200){
            if (j%10==0){
                System.out.println("Count5 nos are :"+j);
                count10++;
            }
            j++;
        }
        System.out.println("Total count10 nos are :"+count10);
    }
}
