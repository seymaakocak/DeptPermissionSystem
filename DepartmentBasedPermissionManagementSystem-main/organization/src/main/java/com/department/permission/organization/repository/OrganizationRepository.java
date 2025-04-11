package com.department.permission.organization.repository;

import com.department.permission.organization.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    // Gerekirse özel sorgular buraya eklenebilir
}
