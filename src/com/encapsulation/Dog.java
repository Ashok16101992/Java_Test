package com.encapsulation;

public class Dog {
    private String name;
    private byte age;
    private String breed;

    public Dog(String name,byte age,String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
    }
    public String getName(){
        return name;
    }

    public byte getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Name : "+name+", Age : "+age+", Breed : "+breed;
    }
}
