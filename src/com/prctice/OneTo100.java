package com.prctice;

import java.util.Scanner;

public class OneTo100 {
    public static void main(String[] args) {
        int i =0;
        int n;
        int count =0;
        System.out.println("Enter the Input No :");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
//        System.out.println("Enter the Input No :"+n);

        for (i=0;i<n; i++){
            System.out.println(" 1 to 100 no of : "+i);
            count++;
        }
        System.out.println("Enter the Input No : "+n);
        System.out.println("count of 100 is : "+count);
    }
}
