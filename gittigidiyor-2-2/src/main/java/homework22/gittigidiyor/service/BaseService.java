package homework22.gittigidiyor.service;

import java.util.List;

/**
 * @author Habib
 * @on 9/24/21 - 8:42 AM
 */
public interface BaseService<T> {
    List<T> findAll();
    T findById(int id);
    void save(T object);
    void deleteById(int id );
}
