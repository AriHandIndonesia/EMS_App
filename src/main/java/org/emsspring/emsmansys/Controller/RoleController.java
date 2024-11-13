package org.emsspring.emsmansys.Controller;

import org.emsspring.emsmansys.Entity.Role;

import org.emsspring.emsmansys.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/role")
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping()
    public List<Role> getAllRole(){
        return roleService.getAllRole();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable(name = "id") int id){
        return roleService.getRoleById(id);
    }

    @PostMapping()
    public Role addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }

    @PutMapping()
    public Role updateRole(@RequestBody Role role){
        if (role.getRoleId().equals(null)){
            return role;
        }
        return roleService.updateRole(role);
    }

    @DeleteMapping("/{id}")
    public String deleteRole(@PathVariable(name = "id") int id){
        return roleService.deleteRole(id);
    }
}
