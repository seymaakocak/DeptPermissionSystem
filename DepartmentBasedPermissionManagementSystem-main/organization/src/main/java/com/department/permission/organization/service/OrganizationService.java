package com.department.permission.organization.service;

import com.department.permission.organization.dto.OrganizationDTO;

import java.util.List;

public interface OrganizationService {
    OrganizationDTO createOrganization(OrganizationDTO organizationDTO);
    List<OrganizationDTO> getAllOrganizations();
    OrganizationDTO getOrganizationById(Long id);
    OrganizationDTO updateOrganization(Long id, OrganizationDTO organizationDTO);
    void deleteOrganization(Long id);
}

