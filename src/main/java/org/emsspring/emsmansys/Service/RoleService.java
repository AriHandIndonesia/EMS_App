package org.emsspring.emsmansys.Service;

import org.emsspring.emsmansys.Entity.Role;


import java.util.List;


public interface RoleService {
    List<Role> getAllRole();
    Role getRoleById(int roleId);
    Role addRole(Role role);
    Role updateRole(Role role);
    String deleteRole(int roleId);
}
