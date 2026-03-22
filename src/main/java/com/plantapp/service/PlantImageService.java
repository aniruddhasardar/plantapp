package com.plantapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantapp.dto.PlantImageDTO;
import com.plantapp.entity.PlantImage;
import com.plantapp.mapper.PlantImageMapper;
import com.plantapp.repository.PlantImageRepository;
import com.plantapp.service.generic.GenericServiceImpl;

@Service
public class PlantImageService extends GenericServiceImpl<PlantImage, Integer> {

    @Autowired
    private PlantImageRepository repository;

    public PlantImageDTO addImage(PlantImageDTO dto) {
        PlantImage entity = PlantImageMapper.toEntity(dto);
        if (repository.findByPlantId(dto.plantId).isEmpty()) {
            entity.setIsPrimary(true);
        }
        return PlantImageMapper.toDTO(create(entity)); // reuse generic
    }

    public PlantImageService(PlantImageRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<PlantImageDTO> getByPlant(Integer plantId) {
        return repository.findByPlantId(plantId)
                .stream()
                .map(PlantImageMapper::toDTO)
                .toList();
    }

    public void setPrimary(Integer imageId) {

        PlantImage image = getById(imageId);

        List<PlantImage> images = repository.findByPlantId(image.getPlantId());
        images.forEach(i -> i.setIsPrimary(false));
        repository.saveAll(images);

        image.setIsPrimary(true);
        repository.save(image);
    }
}