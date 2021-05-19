package com.xfactor.lably.entity;


import javax.persistence.*;

@Entity
@Table(name = "Tbl_costumer")
public class costumer {
    private String name;
    private String address;
    private String age;
    private String gender;


    @Id
    @GeneratedValue
    private long Id;
    
    
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    
}
