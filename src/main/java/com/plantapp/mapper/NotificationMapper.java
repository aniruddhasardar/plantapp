package com.plantapp.mapper;

import java.time.LocalDateTime;

import com.plantapp.dto.NotificationDTO;
import com.plantapp.entity.Notification;

public class NotificationMapper {

    public static NotificationDTO toDTO(Notification entity) {
        if (entity == null) return null;

        NotificationDTO dto = new NotificationDTO();
        dto.setId (entity.getId());
        dto.setPlantId (entity.getPlantId());
        dto.setEventTypeId (entity.getEventTypeId());
        dto.setMessage (entity.getMessage());
        dto.setDueDate (entity.getDueDate() != null
                ? entity.getDueDate().toString()
                : null);

        return dto;
    }

    public static Notification toEntity(NotificationDTO dto) {
        if (dto == null) return null;

        Notification entity = new Notification();
        entity.setId(dto.getId());
        entity.setPlantId(dto.getPlantId());
        entity.setEventTypeId(dto.getEventTypeId());
        entity.setMessage(dto.getMessage());

        if (dto.getDueDate() != null) {
            entity.setDueDate(LocalDateTime.parse(dto.getDueDate()));
        }

        return entity;
    }
}
