package com.plantapp.service;

import org.springframework.stereotype.Service;

import com.plantapp.entity.Plant;
import com.plantapp.repository.PlantRepository;
import com.plantapp.service.generic.GenericServiceImpl;

@Service
public class PlantService extends GenericServiceImpl<Plant, Integer> {

    public PlantService(PlantRepository repository) {
        super(repository);
    }
}