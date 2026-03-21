package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.PlantOrigin;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface PlantOriginRepository extends BaseRepository<PlantOrigin, Integer> {
    List<PlantOrigin> findByPlantId(Integer plantId);
}