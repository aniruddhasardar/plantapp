package com.plantapp.mapper;

import com.plantapp.dto.UserDTO;
import com.plantapp.entity.AppUser;

public class UserMapper {

    public static UserDTO toDTO(AppUser entity) {
        if (entity == null) return null;

        UserDTO dto = new UserDTO();
        dto.setId (entity.getId());
        dto.setUsername (entity.getUsername());
        dto.setEmail (entity.getEmail());
        dto.setRole(entity.getRole());

        return dto;
    }

    public static AppUser toEntity(UserDTO dto) {
        if (dto == null) return null;

        AppUser entity = new AppUser();
        entity.setId(dto.getId());
        entity.setUsername(dto.getUsername());
        entity.setEmail(dto.getEmail());
        entity.setRole(dto.getRole());

        return entity;
    }
}