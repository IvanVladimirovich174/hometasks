package com.ninthhometask.ninthhometask.controller;

import com.ninthhometask.ninthhometask.model.Role;
import com.ninthhometask.ninthhometask.service.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/list")
    public List<Role> getList() {
        return roleService.getAllRoles();
    }
}