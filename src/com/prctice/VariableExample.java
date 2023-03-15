package com.prctice;

public class VariableExample {

//    A variable that is declared as static is called a static variable. It cannot be local.
//    You can create a single copy of the static variable and share it among all the instances of the class.
//    Memory allocation for static variables happens only once when the class is loaded in the memory.
    static int a =1000;// static variable
    void method (){
//      A variable declared inside the body of the method is called local variable.
        int n=90; //local variable
    }


    public static void main(String[] args) {
//        A variable declared inside the class but outside the body of the method, is called an instance variable.
//        It is not declared as static.
         int i =1000; // Instance variable
    }
}
