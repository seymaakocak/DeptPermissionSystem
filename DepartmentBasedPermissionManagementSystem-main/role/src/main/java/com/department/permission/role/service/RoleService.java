package com.department.permission.role.service;
import com.department.permission.role.dto.RoleDTO;
import com.department.permission.role.entity.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);
    List<Role> getAllRoles();
    Role getRoleById(Long id);
    void deleteRole(Long id);
    Role updateRole(Long id, RoleDTO roleDTO);
}

