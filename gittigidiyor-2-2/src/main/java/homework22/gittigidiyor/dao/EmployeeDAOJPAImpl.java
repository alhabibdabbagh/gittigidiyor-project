package homework22.gittigidiyor.dao;

import homework22.gittigidiyor.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author Habib
 * @on 9/24/21 - 8:54 AM
 */
@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO<Employee> {
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery(" from Employee as  e",Employee.class).getResultList() ; //TODO
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void save(Employee object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
