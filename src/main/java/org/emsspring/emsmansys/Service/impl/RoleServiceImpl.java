package org.emsspring.emsmansys.Service.impl;

import org.emsspring.emsmansys.Entity.Role;
import org.emsspring.emsmansys.Mapper.RoleMapper;
import org.emsspring.emsmansys.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAllRole() {
        return roleMapper.getAllRole();
    }

    @Override
    public Role getRoleById(int roleId) {
        return roleMapper.getRoleById(roleId);
    }

    @Override
    public Role addRole(Role role) {
        roleMapper.addRole(role);
        return this.getRoleById(role.getRoleId());
    }

    @Override
    public Role updateRole(Role role) {
        roleMapper.updateRole(role);
        return this.getRoleById(role.getRoleId());
    }

    @Override
    public String deleteRole(int roleId) {
        roleMapper.deleteRole(roleId);
        return "Deleted";
    }
}
