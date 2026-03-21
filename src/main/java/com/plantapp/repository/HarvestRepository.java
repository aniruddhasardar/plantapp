package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.Harvest;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface HarvestRepository extends BaseRepository<Harvest, Integer> {
    List<Harvest> findByPlantId(Integer plantId);
}