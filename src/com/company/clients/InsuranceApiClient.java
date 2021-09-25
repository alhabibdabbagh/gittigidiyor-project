package com.company.clients;

import com.company.controller.StudentController;
import com.company.models.*;
import utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

/**
 * @author habib
 * @on 16.08.2021 08:06
 */
public class InsuranceApiClient {
    public static void main(String[] args) {
      //  saveTestData();
        StudentController studentController=new StudentController();
        Student student2 = new Student(2,"Mahmut", Gender.Male, "istanbul", LocalDate.of(1997, 1, 4));
        //studentController.saveStudent(student2);
        studentController.updateStudent(student2);
        List<Student> students=studentController.findAllStudents();//students.iter (forech)
        for (Student student : students) {
            System.out.println(student.toString());
        }
        //studentController.DeleteStudent(5);
    }

    private static void saveTestData() {
        //String name, Gender gender, String address, LocalDate birthday
        Student student = new Student(1,"habib", Gender.Male, "istanbul", LocalDate.of(1997, 1, 4));
        Student student2 = new Student(2,"ahmet", Gender.Female, "bursa", LocalDate.of(8000, 9, 4));
        Student student3 = new Student(3,"hasan", Gender.Male, "istanbul", LocalDate.of(2000, 1, 9));


        Courses courses = new Courses("Java", "01", 200);
        Courses courses2 = new Courses("python", "08", 500);
        Courses courses3 = new Courses("c#", "11", 600);


        Instructors instructors = new Permanent("habibHoca", "istanbul", "5346006130", 225.3);
        Instructors instructors2 = new VisitingResearcher("fatmaHoca", "istanbul", "53666", 300.5);
        Instructors instructors3 = new Permanent("ssHoca", "bursa", "58555", 255.7);

        courses.setInstructors(instructors);
        courses2.setInstructors(instructors2);
        courses3.setInstructors(instructors3);

        student.getCourses().add(courses);
        student2.getCourses().add(courses2);
        student3.getCourses().add(courses3);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();

            em.persist(student);
            em.persist(student2);
            em.persist(student3);
            em.persist(courses);
            em.persist(courses2);

            em.persist(courses3);
            em.persist(instructors);
            em.persist(instructors2);

            em.persist(instructors3);


            em.getTransaction().commit();

            System.out.println("All data persisted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }


    }


}
