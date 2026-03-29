package com.plantapp.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.plantapp.entity.Notification;
import com.plantapp.repository.base.BaseRepository;

@Repository
public interface NotificationRepository extends BaseRepository<Notification, Integer> {

    List<Notification> findByIsSentFalse();

    List<Notification> findByPlantId(Integer plantId);

    boolean existsByPlantIdAndEventTypeIdAndDueDate(
    Integer plantId,
    Integer eventTypeId,
    LocalDateTime dueDate
);
}