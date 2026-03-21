package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.PlantEvent;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface PlantEventRepository extends BaseRepository<PlantEvent, Integer> {
    List<PlantEvent> findByPlantId(Integer plantId);
}