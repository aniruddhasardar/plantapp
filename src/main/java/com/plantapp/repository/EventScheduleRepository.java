package com.plantapp.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.EventSchedule;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface EventScheduleRepository extends BaseRepository<EventSchedule, Integer> {

    List<EventSchedule> findByPlantId(Integer plantId);

    List<EventSchedule> findByNextDueDateLessThanEqualAndActiveTrue(LocalDateTime time);
}