package com.company.service;

import com.company.controller.StudentController;
import com.company.models.Gender;
import com.company.models.Student;
import com.company.repository.CrudRepository;
import com.company.repository.StudentRepository;
import com.fasterxml.classmate.AnnotationOverrides;
import utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author habib
 * @on 21.08.2021 14:27
 */
public class StudentService implements CrudRepository, StudentRepository<Student> {
    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
    //JPA java persistence Language

    @Override
    public List<Student> findAll() {
        // eğer hepsi almak istiyorsanız query olarak yazmamız lazım
        List<Student> students = em.createQuery("select s from Student s ", Student.class).getResultList();
        return students;
    }

    @Override
    public Student findById(long id) {
        Student student = em.find(Student.class, id);
        return student;
    }

    @Override
    public void saveToDataBase(Student student) {
        try {

            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();

        } catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            EntityManagerUtils.closeEntityManager(em);
        }

    }

    @Override
    public void deleteFromDataBase(int id) {
        try {

            em.getTransaction().begin();
            Student student= em.createQuery("select s from Student  s where s.id=:id",Student.class).setParameter("id",id).getSingleResult();
            em.remove(student);
            em.getTransaction().commit();

        } catch (Exception e){
          //  em.getTransaction().rollback();
            e.printStackTrace();
        }

    }

    @Override
    public void findCoursesOfstudent(Student student,int ssid) {
    Student student1=em.find(Student.class,ssid);
    long id =student1.getSsid();


    }



    @Override
    public void updateOnDataBase(Student object) {
    Student student=em.createQuery("select s from Student s where s.ssid=:ssid",Student.class)
            .setParameter("ssid",object.getSsid()).getSingleResult();
   try {
       em.getTransaction().begin();
       student.setName("değiştirildi");
       student.setGender(Gender.Female);
       student.setAddress("değiştirildi");
       em.persist(student);
       em.getTransaction().commit();
   }catch (Exception e){
       em.getTransaction().rollback();
   }
    }
}
