package org.emsspring.emsmansys.Mapper;

import org.emsspring.emsmansys.Entity.Department;

import java.util.List;

public interface DepartmentMapper {

    List<Department> getAllDept();
    Department getDeptById(int id);
    void addDept(Department department);
    void updateDept(Department department);
    void deleteDept(int id);
}
