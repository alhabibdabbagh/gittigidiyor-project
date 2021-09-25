package com.company.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author habib
 * @on 14.08.2021 01:16
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Instructors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    String name;
    String address;
    String phoneNumber;

    public Instructors() {
    }

    public Instructors(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    @OneToMany(mappedBy ="instructors" ) // oneToMany
    List<Courses> courses=new ArrayList<>();

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
