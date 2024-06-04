package com.spring;

public class Address {
    private int rno;
    private String city;
    private long pincode;

    public Address(){
        super();
    }
    public Address(int rno,String city,long pincode){
        super();
        this.rno=rno;
        this.city=city;
        this.pincode=pincode;
    }
    public int getRno(){
        return rno;
    }
    public void setRno(int rno){
        this.rno=rno;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public long getPincode(){
        return pincode;
    }
    public void setPincode(long pincode){
        this.pincode=pincode;
    }
    public String toString(){
        return "Rollno  " + rno + "City " + city + "Pincode " + pincode ;
    }

}
