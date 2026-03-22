package com.plantapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantapp.dto.PlantDTO;
import com.plantapp.service.PlantService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/plants")
@RequiredArgsConstructor
public class PlantController {

    private final PlantService service;

    @PostMapping
    public PlantDTO create(@RequestBody PlantDTO dto) {
        return service.createDTO(dto);
    }

    @GetMapping
    public List<PlantDTO> getAll() {
        return service.getAllDTO();
    }

    @GetMapping("/{id}")
    public PlantDTO get(@PathVariable Integer id) {
        return service.getDTO(id);
    }

    @PutMapping("/{id}")
    public PlantDTO update(@PathVariable Integer id,
                           @RequestBody PlantDTO dto) {
        return service.updateDTO(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.softDelete(id); // from GenericService
    }
}