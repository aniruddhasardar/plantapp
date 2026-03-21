package com.plantapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plantapp.entity.PlantImage;
import com.plantapp.service.PlantImageService;

@RestController
@RequestMapping("/api/images")
public class PlantImageController {

    @Autowired
    private PlantImageService service;

    @PostMapping("/upload")
    public ResponseEntity<?> upload(
            @RequestParam Integer plantId,
            @RequestParam String imageUrl
    ) {
        return ResponseEntity.ok(service.saveImage(plantId, imageUrl));
    }

    @GetMapping("/{plantId}")
    public List<PlantImage> getImages(@PathVariable Integer plantId) {
        return service.getByPlant(plantId);
    }
}