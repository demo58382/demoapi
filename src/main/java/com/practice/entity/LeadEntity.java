package com.practice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeadEntity {
    @Id
    private long id;
    private String name;
    private String city;
    private String email;
    private long mobile;

    public LeadEntity(long id, String name, String city, String email, long mobile) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.email = email;
        this.mobile = mobile;
    }

    public LeadEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
