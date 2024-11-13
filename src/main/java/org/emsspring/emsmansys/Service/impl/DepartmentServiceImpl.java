package org.emsspring.emsmansys.Service.impl;

import org.emsspring.emsmansys.Entity.Department;
import org.emsspring.emsmansys.Mapper.DepartmentMapper;
import org.emsspring.emsmansys.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper deptMapper;

    @Override
    public List<Department> getAllDept() {
        return deptMapper.getAllDept();
    }

    @Override
    public Department getDeptById(int deptId) {
        return deptMapper.getDeptById(deptId);
    }

    @Override
    public Department addDept(Department dept) {
        deptMapper.addDept(dept);
        return this.getDeptById(dept.getDepartmentId());
    }

    @Override
    public Department updateDept(Department dept) {
        deptMapper.updateDept(dept);
        return this.getDeptById(dept.getDepartmentId());
    }

    @Override
    public String deleteDept(int deptId) {
        deptMapper.deleteDept(deptId);
        return "Deleted";
    }
}
