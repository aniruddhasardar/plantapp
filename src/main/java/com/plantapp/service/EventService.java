package com.plantapp.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.plantapp.entity.EventSchedule;
import com.plantapp.entity.PlantEvent;
import com.plantapp.repository.EventScheduleRepository;
import com.plantapp.repository.PlantEventRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventService {

    private final PlantEventRepository eventRepo;
    private final EventScheduleRepository scheduleRepo;

    public void logPlanting(Integer plantId) {

        PlantEvent event = new PlantEvent();
        event.setPlantId(plantId);
        event.setEventTypeId(1);
        event.setEventDate(LocalDateTime.now());

        eventRepo.save(event);

        EventSchedule schedule = new EventSchedule();
        schedule.setPlantId(plantId);
        schedule.setEventTypeId(2);
        schedule.setFrequencyDays(3);
        schedule.setNextDueDate(LocalDateTime.now().plusDays(3));
        schedule.setActive(true);

        scheduleRepo.save(schedule);
    }
}