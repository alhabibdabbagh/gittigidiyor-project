package homework22.gittigidiyor.dao;


import java.util.List;

public interface BaseDAO<T> {

    List<T> findAll();
    T findById(int id);
    void save(T object);
    void deleteById(int id );
}

