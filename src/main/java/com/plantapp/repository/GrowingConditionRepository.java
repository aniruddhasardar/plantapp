package com.plantapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.GrowingCondition;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface GrowingConditionRepository extends BaseRepository<GrowingCondition, Integer> {
    List<GrowingCondition> findByPlantId(Integer plantId);
}