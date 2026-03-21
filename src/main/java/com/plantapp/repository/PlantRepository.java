package com.plantapp.repository;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.Plant;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface PlantRepository extends BaseRepository<Plant, Integer> {
}