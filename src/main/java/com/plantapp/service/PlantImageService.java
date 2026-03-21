package com.plantapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantapp.entity.PlantImage;
import com.plantapp.repository.PlantImageRepository;

@Service
public class PlantImageService {

    @Autowired
    private PlantImageRepository repository;

    public PlantImage saveImage(Integer plantId, String imageUrl) {

        PlantImage img = new PlantImage();
        img.setPlantId(plantId);
        img.setImageUrl(imageUrl);
        img.setIsPrimary(false);

        return repository.save(img);
    }

    public List<PlantImage> getByPlant(Integer plantId) {
        return repository.findByPlantId(plantId);
    }
}