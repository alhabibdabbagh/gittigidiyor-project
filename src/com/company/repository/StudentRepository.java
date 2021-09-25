package com.company.repository;

import java.util.List;
import java.util.Objects;

/**
 * @author habib
 * @on 21.08.2021 16:34
 */
public interface StudentRepository<T> {
  //  void deleteFromDataBase(int ssid);
    void findCoursesOfstudent(T object, int ssid);
    void saveToDataBase(T object);
    void updateOnDataBase(T object);
    List<T> findAll();

    T findById(long id);
}
