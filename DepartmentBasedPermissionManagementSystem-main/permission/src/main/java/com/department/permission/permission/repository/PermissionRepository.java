package com.department.permission.permission.repository;

import com.department.permission.permission.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
    // Gerekirse özel sorgular buraya eklenebilir
}
