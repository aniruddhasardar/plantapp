package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.Watering;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface WateringRepository extends BaseRepository<Watering, Integer> {
    List<Watering> findByPlantId(Integer plantId);
}