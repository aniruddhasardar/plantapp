package com.plantapp.mapper;

import com.plantapp.dto.EventDTO;
import com.plantapp.entity.PlantEvent;

public class EventMapper {

    public static EventDTO toDTO(PlantEvent entity) {
        if (entity == null) return null;

        EventDTO dto = new EventDTO();
        dto.setId (entity.getId());
        dto.setPlantId (entity.getPlantId());
        dto.setEventTypeId (entity.getEventTypeId());
        dto.setNotes (entity.getNotes());

        return dto;
    }

    public static PlantEvent toEntity(EventDTO dto) {
        if (dto == null) return null;

        PlantEvent entity = new PlantEvent();
        entity.setId(dto.getId());
        entity.setPlantId(dto.getPlantId());
        entity.setEventTypeId(dto.getEventTypeId());
        entity.setNotes(dto.getNotes());

        return entity;
    }
}