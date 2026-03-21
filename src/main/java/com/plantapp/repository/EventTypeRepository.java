package com.plantapp.repository;


import org.springframework.stereotype.Repository;

import com.plantapp.entity.EventType;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface EventTypeRepository extends BaseRepository<EventType, Integer> {
    EventType findByName(String name);
}