package com.example.demo.service;

import com.example.demo.dto.RoleDto;
import com.example.demo.model.Role;

import java.util.List;

public interface RoleService {
    RoleDto getRoleById(Integer id);
    RoleDto findByRole(String role);
    List<RoleDto> getAllRoles();
    RoleDto createRole(Role role);
    RoleDto updateRole(Role role);
    void deleteRole(Role role);
}
