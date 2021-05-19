package com.xfactor.lably.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tbl_Lab")
public class Lab
{

    @Id
    @GeneratedValue
    private long Id;
    private String name;
    private String address;
    private String pincode;
    private String phone;
    


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAddress() {
        return address;
    }

    public String address()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

}