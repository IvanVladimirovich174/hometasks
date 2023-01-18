package com.ninthhometask.ninthhometask.service;

import com.ninthhometask.ninthhometask.model.Role;
import com.ninthhometask.ninthhometask.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}