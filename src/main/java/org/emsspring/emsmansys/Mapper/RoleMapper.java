package org.emsspring.emsmansys.Mapper;

import org.emsspring.emsmansys.Entity.Role;

import java.util.List;

public interface RoleMapper {

    List<Role> getAllRole();
    Role getRoleById(int id);
    void addRole(Role role);
    void updateRole(Role role);
    void deleteRole(int id);

}
