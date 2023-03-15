package com.prctice;

public class NestedIfStatement {
    public static void main(String[] args) {
        String  address="  USA";

        if(address.contains("india")){
        if (address.endsWith("kerala")){
            System.out.println("your are living in Kerala :"+address);
        } else if (address.contains("Telangana")) {
            System.out.println(" You are living in Telangana :"+address);
        }else {
            System.out.println(address.split(",")[1]);
        }
    }else{
            System.out.println("you are not living in india : "+address);
        }

    }

}
