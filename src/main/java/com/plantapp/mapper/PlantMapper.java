package com.plantapp.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.plantapp.dto.PlantDTO;
import com.plantapp.entity.Plant;

public class PlantMapper {

    public static PlantDTO toDTO(Plant entity) {
        if (entity == null) return null;

        PlantDTO dto = new PlantDTO();
        dto.id = entity.getId();
        dto.commonName = entity.getCommonName();
        dto.scientificName = entity.getScientificName();
        dto.plantType = entity.getPlantType();

        return dto;
    }

    public static Plant toEntity(PlantDTO dto) {
        if (dto == null) return null;

        Plant entity = new Plant();
        entity.setId(dto.id);
        entity.setCommonName(dto.commonName);
        entity.setScientificName(dto.scientificName);
        entity.setPlantType(dto.plantType);

        return entity;
    }

    public static List<PlantDTO> toDTOList(List<Plant> list) {
        return list.stream()
                .map(PlantMapper::toDTO)
                .collect(Collectors.toList());
    }
}
