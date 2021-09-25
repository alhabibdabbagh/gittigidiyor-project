package com.company.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author habib
 * @on 14.08.2021 01:15
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    long ssid;
    Gender gender;
    String address;
    LocalDate birthday;
    String name;

    public Student() {

    }

    public Student(String name, Gender gender, String address, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
    }

    public Student(long ssid,String name, Gender gender, String address, LocalDate birthday) {
        this.ssid = ssid;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
    }

    @ManyToMany
    List<Courses> courses = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<Courses> getCourses() {
        return courses;
    }
    public long getSsid() {
        return ssid;
    }

    public void setSsid(long ssid) {
        this.ssid = ssid;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ssid=" + ssid +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
