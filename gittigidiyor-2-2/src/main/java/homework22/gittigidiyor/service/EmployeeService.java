package homework22.gittigidiyor.service;

import homework22.gittigidiyor.dao.EmployeeDAOJPAImpl;
import homework22.gittigidiyor.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Habib
 * @on 9/24/21 - 8:42 AM
 */
@Service
public class EmployeeService implements BaseService<Employee> {

private EmployeeDAOJPAImpl employeeDAOJPA;

@Autowired
    public EmployeeService(EmployeeDAOJPAImpl employeeDAOJPA) {
        this.employeeDAOJPA = employeeDAOJPA;
    }

    @Override
    public List<Employee> findAll() {
        return null;
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
