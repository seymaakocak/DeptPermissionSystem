package com.department.permission.permission.service;

import com.department.permission.permission.dto.PermissionDTO;

import java.util.List;

public interface PermissionService {
    PermissionDTO createPermission(PermissionDTO permissionDTO); // DTO kullanımı
    List<PermissionDTO> getAllPermissions(); // DTO Listesi döndür
    PermissionDTO getPermissionById(Long id); // Belirli bir izin (DTO)
    PermissionDTO updatePermission(Long id, PermissionDTO permissionDTO); // Güncelleme için DTO
    void deletePermission(Long id); // İzni sil
}
