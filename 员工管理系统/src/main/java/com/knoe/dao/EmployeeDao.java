package com.knoe.dao;

import com.knoe.pojo.Department;
import com.knoe.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KNOE
 * @date 2020-10-24 11:18
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();

        employees.put(1001,
                new Employee(1001, "AA", "azhe@qq.com", 1, new Department(101, "后勤")));
        employees.put(1002,
                new Employee(1002, "BB", "bzhe@qq.com", 0, new Department(102, "市场")));
        employees.put(1003,
                new Employee(1003, "CC", "czhe@qq.com", 1, new Department(103, "调研")));
    }

    //pk auto increment
    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }

        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    //query
    public Collection<Employee> getAll() {
        return employees.values();
    }

    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    public void delete(Integer id) {
        employees.remove(id);
    }
}

