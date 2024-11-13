package org.emsspring.emsmansys.Service;

import org.emsspring.emsmansys.Entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDept();
    Department getDeptById(int roleId);
    Department addDept(Department dept);
    Department updateDept(Department dept);
    String deleteDept(int deptId);
}
