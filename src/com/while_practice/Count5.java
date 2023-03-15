package com.while_practice;

public class Count5 {

    public static void main(String[] args) {
        int j=1;
        int count5=0;

        while (j<=200){
            if (j%5==0){
                System.out.println("Count5 nos are :"+j);
                count5++;
            }
            j++;
        }
        System.out.println("Total count5 nos are :"+count5);
    }
}
