package com.department.permission.role.service;

import com.department.permission.role.entity.Role;
import com.department.permission.role.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.department.permission.role.dto.RoleDTO;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Override
    public Role updateRole(Long id, RoleDTO roleDTO) {
        Optional <Role> optionalRole = roleRepository.findById(id);
        if (((java.util.Optional<?>) optionalRole).isPresent()){
            Role role = optionalRole.get();
            role.setName(roleDTO.getName());
            role.setDescription(roleDTO.getDescription());
            return roleRepository.save(role);
        }

        else {
            throw new RuntimeException("Role not found with id: " + id);
            }

        }

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Role not found with id: " + id));
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
