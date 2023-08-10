package com.zq.study.framework5.nine;

// Java Program to Illustrate Address Class

// Class
public class Address {

    // Class data members
    private String houseNo;

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String pincode;
    private String state;
    private String country;

    // Constructor
    public Address(String houseNo, String pincode,
                   String state, String country)
    {
        super();
        this.houseNo = houseNo;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
    }

    // Method
    // Overriding toString() method
    public String toString()
    {
        return "[" + houseNo + "," + pincode + "," + state
                + "," + country + "]";
    }
}
