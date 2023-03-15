package com.while_practice;
import java.util.ArrayList;
import java.util.List;

public class WhileLoopExample {
    public static void main(String[] args) {
        int evenCount=0;
        int oddCount=0;
        int num=1;
        int evenCount1=0;
        int oddCount1=0;
        List<Integer>evenList=new ArrayList<>();
        List<Integer>oddList=new ArrayList<>();

        while (num<=200){
            if (num%2==0){
                System.out.println("Even no"+num);
                evenList.add(num);
                evenCount1++;
            } else if (num%2!=0) {
                System.out.println("odd no"+num);
                oddList.add(num);
                oddCount1++;
            }
            num++;
        }
        System.out.println("Even list is : "+evenList);
        System.out.println("Odd list is :"+oddList);
        System.out.println(evenCount1+": is Even no count");
        System.out.println(oddCount1+": is odd no count");
    }
}
