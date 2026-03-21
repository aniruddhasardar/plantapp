package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.PlantProduct;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface PlantProductRepository extends BaseRepository<PlantProduct, Integer> {
    List<PlantProduct> findByPlantId(Integer plantId);
}