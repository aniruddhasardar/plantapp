package com.plantapp.mapper;

import com.plantapp.dto.PlantImageDTO;
import com.plantapp.entity.PlantImage;

public class PlantImageMapper {

    public static PlantImageDTO toDTO(PlantImage entity) {
        if (entity == null) return null;

        PlantImageDTO dto = new PlantImageDTO();
        dto.setId (entity.getId());
        dto.setPlantId (entity.getPlantId());
        dto.setImageUrl (entity.getImageUrl());
        dto.setIsPrimary (entity.getIsPrimary());

        return dto;
    }

    public static PlantImage toEntity(PlantImageDTO dto) {
        if (dto == null) return null;

        PlantImage entity = new PlantImage();
        entity.setId(dto.getId());
        entity.setPlantId(dto.getPlantId());
        entity.setImageUrl(dto.getImageUrl());
        entity.setIsPrimary(dto.getIsPrimary());

        return entity;
    }
}
