package com.plantapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantapp.entity.Plant;
import com.plantapp.service.PlantService;

@RestController
@RequestMapping("/api/plants")
public class PlantController {

    @Autowired
    private PlantService service;

    @PostMapping
    public Plant create(@RequestBody Plant plant) {
        return service.create(plant);
    }

    @GetMapping
    public List<Plant> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.softDelete(id);
    }
}