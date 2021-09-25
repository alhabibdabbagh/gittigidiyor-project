package com.company.controller;

import com.company.models.Courses;
import com.company.models.Student;
import com.company.service.StudentService;

import java.util.List;

/**
 * @author habib
 * @on 21.08.2021 14:26
 */
public class StudentController {
    StudentService studentService = new StudentService();

    public Student findById(long id) {
        return studentService.findById(id);

    }

    public List<Student> findAllStudents() {

        return studentService.findAll();
    }

    public void saveStudent(Student student) {
        studentService.saveToDataBase(student);
    }
    public void DeleteStudent(int id){
        studentService.deleteFromDataBase(id);
    }
    public void updateStudent(Student student){
        studentService.updateOnDataBase(student);
    }

    public List<Courses> findCoursesOFstudent(long ssid) {
        return null;
    }
}
