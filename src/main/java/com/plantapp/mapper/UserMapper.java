package com.plantapp.mapper;

import com.plantapp.dto.UserDTO;
import com.plantapp.entity.AppUser;

public class UserMapper {

    public static UserDTO toDTO(AppUser entity) {
        if (entity == null) return null;

        UserDTO dto = new UserDTO();
        dto.id = entity.getId();
        dto.username = entity.getUsername();
        dto.email = entity.getEmail();
        dto.role = entity.getRole();

        return dto;
    }

    public static AppUser toEntity(UserDTO dto) {
        if (dto == null) return null;

        AppUser entity = new AppUser();
        entity.setId(dto.id);
        entity.setUsername(dto.username);
        entity.setEmail(dto.email);
        entity.setRole(dto.role);

        return entity;
    }
}