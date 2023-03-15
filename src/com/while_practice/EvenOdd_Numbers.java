package com.while_practice;

public class EvenOdd_Numbers {

    public static void main(String[] args) {
        int j=1;
        int count =0;
        int count1=0;

        while(j<=200 ){
            if(j%2==0){
                System.out.println("Even nos up to 200 is :"+j);
                count++;
            } else if (j%2!=0) {
                System.out.println(j+": is odd number");
                count1++;
            }
            j++;
        }
        System.out.println("Count of Even nos is : "+count);
        System.out.println("Count of odd nos is : "+count1);
    }
}
