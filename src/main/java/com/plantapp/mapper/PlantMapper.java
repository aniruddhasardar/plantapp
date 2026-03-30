package com.plantapp.mapper;

import java.time.LocalDateTime;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import com.plantapp.dto.PlantDTO;
import com.plantapp.entity.Plant;

public class PlantMapper {

    public static PlantDTO toDTO(Plant entity) {
        if (entity == null) return null;

        PlantDTO dto = new PlantDTO();
        dto.setId(entity.getId());
        dto.setCommonName (entity.getCommonName());
        dto.setScientificName (entity.getScientificName());
        dto.setPlantType (entity.getPlantType());
        dto.setFamily(entity.getFamily());

        return dto;
    }

    public static Plant toEntity(PlantDTO dto) {
        if (dto == null) return null;

        Plant entity = new Plant();
        entity.setId(dto.getId());
        entity.setCommonName(dto.getCommonName());
        entity.setScientificName(dto.getScientificName());
        entity.setPlantType(dto.getPlantType());
        entity.setFamily(dto.getFamily());
        entity.setCreatedAt(LocalDateTime.now());

        return entity;
    }

    public static List<PlantDTO> toDTOList(List<Plant> list) {
        return list.stream()
                .map(PlantMapper::toDTO)
                .collect(Collectors.toList());
    }
}
