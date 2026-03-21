package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.Fertilization;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface FertilizationRepository extends BaseRepository<Fertilization, Integer> {
    List<Fertilization> findByPlantId(Integer plantId);
}
