package com.xfactor.lably.entity;


import javax.persistence.*;

@Entity
@Table(name = "Tbl_Admin")
public class admin {

    private String name;
    private String user;

    @Column(name = "PSWD")
    private String password;

    @Id
    @GeneratedValue
    private long Id;
    
    public String getName() {
        return name;
    }
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    

    
}
