package com.plantapp.mapper;

import com.plantapp.dto.PlantImageDTO;
import com.plantapp.entity.PlantImage;

public class PlantImageMapper {

    public static PlantImageDTO toDTO(PlantImage entity) {
        if (entity == null) return null;

        PlantImageDTO dto = new PlantImageDTO();
        dto.id = entity.getId();
        dto.plantId = entity.getPlantId();
        dto.imageUrl = entity.getImageUrl();
        dto.isPrimary = entity.getIsPrimary();

        return dto;
    }

    public static PlantImage toEntity(PlantImageDTO dto) {
        if (dto == null) return null;

        PlantImage entity = new PlantImage();
        entity.setId(dto.id);
        entity.setPlantId(dto.plantId);
        entity.setImageUrl(dto.imageUrl);
        entity.setIsPrimary(dto.isPrimary);

        return entity;
    }
}
