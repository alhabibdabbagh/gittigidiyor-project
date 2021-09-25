package com.company.models;

import javax.persistence.Entity;

/**
 * @author habib
 * @on 14.08.2021 02:06
 */
@Entity
public class Permanent extends Instructors {

    double fixedSalary;

    public Permanent() {

    }

    public Permanent(String name, String address, String phoneNumber, double fixedSalary) {
        super(name, address, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "Permanent{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
