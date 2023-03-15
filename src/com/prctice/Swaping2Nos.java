package com.prctice;

import java.util.Scanner;

public class Swaping2Nos {
    public static void main(String[] args) {
        int a;
        int b;
        int temp;
        System.out.println("Enter input a & b nos :");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swap : "+a +b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap : "+a +b);

    }
}
