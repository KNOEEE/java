package com.knoe.dao;

import com.knoe.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KNOE
 * @date 2020-10-24 11:11
 */
@Repository
public class DepartmentDao {
    //如果绑了mybatis就不用dao
    //用mapper

    //模拟数据库中的数据
    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer, Department>();

        departments.put(101, new Department(101, "教学"));
        departments.put(102, new Department(102, "市场"));
        departments.put(103, new Department(103, "调研"));
        departments.put(104, new Department(104, "运营"));
        departments.put(105, new Department(105, "后勤"));
    }

    //获得所有部门信息
    public Collection<Department> getDepartments() {
        return departments.values();
    }

    public Department getDepartmentById(Integer id) {
        return departments.get(id);
    }
}
