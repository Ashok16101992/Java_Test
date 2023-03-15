package com.encapsulation;

import com.sun.jdi.StringReference;

public class Address {
    private String houseNo;
    private String city;
    private String state;
    private String pinCode;
    private String phoneNo;

    public Address(String houseNo,String city,String state,String pinCode,String phoneNo){
        this.houseNo=houseNo;
        this.city=city;
        this.state=state;
        this.pinCode=pinCode;
        this.phoneNo=phoneNo;

        if (this.pinCode.length()!=6){
            System.err.println("Pin code should be 6 Digits :"+pinCode);
            this.pinCode=pinCode;
        }
    }
    public String getHouseNo() {
        return houseNo;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getPinCode() {
        return pinCode;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    @Override
    public String toString() {
        return("House No :"+houseNo+", City :"+city+", State :"+state+", Pincode :"+pinCode+", Contact No :"+phoneNo);
    }
}

