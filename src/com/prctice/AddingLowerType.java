package com.prctice;

public class AddingLowerType {
    public static void main(String[] args) {
        byte a =20;
        byte b= 30;
//        byte c = a+b; compile time error because a+b is int type
        byte c = (byte)(a+b);
        System.out.println(c);

    }
}
