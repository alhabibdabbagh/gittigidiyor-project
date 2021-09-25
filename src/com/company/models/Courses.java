package com.company.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author habib
 * @on 14.08.2021 01:15
 */
@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    String nameCourse;
    String courseCode;
    int crediScore;

    public Courses() {
    }

    public Courses(String nameCourse, String courseCode, int crediScore) {
        this.nameCourse = nameCourse;
        this.courseCode = courseCode;
        this.crediScore = crediScore;
    }
    @ManyToOne
    private Instructors instructors;

    @ManyToMany(mappedBy = "courses")
    List<Student> students=new ArrayList<>();

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCrediScore() {
        return crediScore;
    }

    public void setCrediScore(int crediScore) {
        this.crediScore = crediScore;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courses courses = (Courses) o;
        return Objects.equals(courseCode, courses.courseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseCode);
    }

    @Override
    public String toString() {
        return "Courses{" +
                "nameCourse='" + nameCourse + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", crediScore=" + crediScore +
                '}';
    }
}
