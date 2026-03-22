package com.plantapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.plantapp.dto.PlantDTO;
import com.plantapp.entity.Plant;
import com.plantapp.mapper.PlantMapper;
import com.plantapp.repository.PlantRepository;
import com.plantapp.service.generic.GenericServiceImpl;

@Service
public class PlantService extends GenericServiceImpl<Plant, Integer> {

    private final PlantRepository repository;

    public PlantService(PlantRepository repository) {
        super(repository);
        this.repository = repository;
    }

    // ✅ Only custom methods here

    public List<PlantDTO> getAllDTO() {
        return PlantMapper.toDTOList(repository.findByDeleteFlagFalse());
    }

    public PlantDTO getDTO(Integer id) {
        return PlantMapper.toDTO(getById(id));
    }

    public PlantDTO createDTO(PlantDTO dto) {
        Plant entity = PlantMapper.toEntity(dto);
        return PlantMapper.toDTO(create(entity));
    }

    public PlantDTO updateDTO(Integer id, PlantDTO dto) {
        Plant entity = getById(id);

        entity.setCommonName(dto.commonName);
        entity.setScientificName(dto.scientificName);
        entity.setPlantType(dto.plantType);

        return PlantMapper.toDTO(update(id, entity));
    }
}