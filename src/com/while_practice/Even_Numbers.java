package com.while_practice;

public class Even_Numbers {

    public static void main(String[] args) {
        int j=1;
        int evenCount=0;

        while (j<=200){
            if (j%2==0){
                System.out.println(j+": is even number");
                evenCount++;
            }
            j++;
        }
        System.out.println("Total count of even nos are :"+evenCount);
    }
}
