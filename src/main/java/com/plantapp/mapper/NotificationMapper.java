package com.plantapp.mapper;

import java.time.LocalDateTime;

import com.plantapp.dto.NotificationDTO;
import com.plantapp.entity.Notification;

public class NotificationMapper {

    public static NotificationDTO toDTO(Notification entity) {
        if (entity == null) return null;

        NotificationDTO dto = new NotificationDTO();
        dto.id = entity.getId();
        dto.plantId = entity.getPlantId();
        dto.eventTypeId = entity.getEventTypeId();
        dto.message = entity.getMessage();
        dto.dueDate = entity.getDueDate() != null
                ? entity.getDueDate().toString()
                : null;

        return dto;
    }

    public static Notification toEntity(NotificationDTO dto) {
        if (dto == null) return null;

        Notification entity = new Notification();
        entity.setId(dto.id);
        entity.setPlantId(dto.plantId);
        entity.setEventTypeId(dto.eventTypeId);
        entity.setMessage(dto.message);

        if (dto.dueDate != null) {
            entity.setDueDate(LocalDateTime.parse(dto.dueDate));
        }

        return entity;
    }
}
