package com.plantapp.mapper;

import com.plantapp.dto.EventDTO;
import com.plantapp.entity.PlantEvent;

public class EventMapper {

    public static EventDTO toDTO(PlantEvent entity) {
        if (entity == null) return null;

        EventDTO dto = new EventDTO();
        dto.id = entity.getId();
        dto.plantId = entity.getPlantId();
        dto.eventTypeId = entity.getEventTypeId();
        dto.notes = entity.getNotes();

        return dto;
    }

    public static PlantEvent toEntity(EventDTO dto) {
        if (dto == null) return null;

        PlantEvent entity = new PlantEvent();
        entity.setId(dto.id);
        entity.setPlantId(dto.plantId);
        entity.setEventTypeId(dto.eventTypeId);
        entity.setNotes(dto.notes);

        return entity;
    }
}