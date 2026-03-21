package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.Planting;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface PlantingRepository extends BaseRepository<Planting, Integer> {
    List<Planting> findByPlantId(Integer plantId);
}