package com.encapsulation;

public class Employee {
    private String name;
    private byte age;
    private int id;
    private String email_Id;
    private float salary;

    public Employee(String name, byte age,int id,String email_Id,double salary){
        this.name=name;
        this.age=age;
        this.id=id;
        this.email_Id=email_Id;
        this.salary= (float) salary;

        if (this.name.length()<=1){
            System.err.println("Name should be more than 1 Character for emp id : "+id);
            this.name=name;
        }
    }
//    public void setName(String name){
//        if (name.length()<=1){
//            System.out.println(name);
//        }else {
//            System.err.println("Name should be more than 1 Character"+name);
//        }
//
//    }

    @Override
    public String toString() {
        return "Name : "+name+ ", Age : "+age+ ",Id : "+id+ ", Email Id : "+email_Id+", Salary : "+salary;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getEmail_Id() {
        return email_Id;
    }

    public double getSalary() {
        return salary;
    }
}
