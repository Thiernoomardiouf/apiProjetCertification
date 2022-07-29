package com.simplon.apiapp.controller;

import com.simplon.apiapp.model.Role;
import com.simplon.apiapp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.simplon.apiapp.utils.Constants.APP_ROOT;

@RestController
@CrossOrigin(origins = "*")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping(path = APP_ROOT + "/roles")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping(path = APP_ROOT + "/roles/{id}")
    public Optional<Role> getRole(@PathVariable("id") Long id){
        Optional<Role> p = roleService.getRole(id);
        return p;
    }

    @GetMapping(path = APP_ROOT + "/roles/delete/{id}")
    public void deleteRole(@PathVariable("id") Long id){
        roleService.deleteRole(id);
    }

    @PostMapping(path = APP_ROOT + "/roles/add")
    public Role addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }

    @PutMapping (path = APP_ROOT + "/roles/update/{id}")
    public Role updateRole(@PathVariable("id") Long id, @RequestBody Role role){
        role.setId(id);
        return roleService.addRole(role);
    }
}
