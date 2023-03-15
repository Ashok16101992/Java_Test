package com.while_practice;

public class Count30 {
    public static void main(String[] args) {
        int j=1;
        int count30=0;

        while (j<=200){
            if (j%30==0){
                System.out.println("Count30 nos are :"+j);
                count30++;
            }
            j++;
        }
        System.out.println("Total count30 nos are :"+count30);
    }
}
