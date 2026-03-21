package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.ProcessedProduct;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface ProcessedProductRepository extends BaseRepository<ProcessedProduct, Integer> {
    List<ProcessedProduct> findByPlantId(Integer plantId);
}