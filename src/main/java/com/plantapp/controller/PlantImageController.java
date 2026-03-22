package com.plantapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plantapp.dto.PlantImageDTO;
import com.plantapp.entity.PlantImage;
import com.plantapp.service.PlantImageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class PlantImageController {

    private final PlantImageService service;

    @PostMapping
    public PlantImageDTO add(@RequestBody PlantImageDTO dto) {
        return service.addImage(dto);
    }

    @GetMapping("/{plantId}")
    public List<PlantImageDTO> get(@PathVariable Integer plantId) {
        return service.getByPlant(plantId);
    }

    @PutMapping("/primary/{imageId}")
    public void setPrimary(@PathVariable Integer imageId) {
        service.setPrimary(imageId);
    }
}