package com.company.models;

import javax.persistence.Entity;

/**
 * @author habib
 * @on 14.08.2021 02:05
 */
@Entity
public class VisitingResearcher extends Instructors {

    double hourlySalary;

    public VisitingResearcher(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
    public VisitingResearcher(){}

    public VisitingResearcher(String name, String address, String phoneNumber, double hourlySalary) {
        super(name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }



    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
