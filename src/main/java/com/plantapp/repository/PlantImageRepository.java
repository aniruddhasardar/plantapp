package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.PlantImage;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface PlantImageRepository extends BaseRepository<PlantImage, Integer> {

    List<PlantImage> findByPlantId(Integer plantId);
}