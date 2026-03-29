package com.plantapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantapp.service.EventService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService service;

    // Log planting event + create schedule
    @PostMapping("/plant/{plantId}")
    public ResponseEntity<String> plant(@PathVariable Integer plantId) {
        service.logPlanting(plantId);
        return ResponseEntity.ok("Planting event logged");
    }
}