package com.encapsulation;

public class Test_Employee {
    public static void main(String[] args) {
        Employee x=new Employee("Ashok", (byte) 30,560335,"ashokreddy.kondasani@gmail.com",50000.95);
        Employee y=new Employee("Vasu", (byte) 27,560885,"kalyanreddy.mule@gmail.com",80000.05);
        Employee z=new Employee("", (byte) 25,560332,"swathi.reddy@gmail.com",60000.85);

        Address address=new Address("2-91, Polepalle","Durgi Mandal, Palnadu District","Andhrapradesh","522612","9676963112");
        Address address1=new Address("1-2-92/B, KPHB 2nd Road","Hyderabad","Telangana","500072","9849012345");
        Address address2=new Address("2-1/ABC, LB Nagar","Hyderabad","Telangana","50092","9121586386");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(address);





    }
}
