package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.PestDisease;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface PestDiseaseRepository extends BaseRepository<PestDisease, Integer> {
    List<PestDisease> findByPlantId(Integer plantId);
}