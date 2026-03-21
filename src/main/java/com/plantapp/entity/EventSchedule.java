package com.plantapp.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "event_schedules")
@Getter @Setter
public class EventSchedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plant_id")
    private Integer plantId;

    @Column(name = "event_type_id")
    private Integer eventTypeId;

    @Column(name = "next_due_date")
    private LocalDateTime nextDueDate;

    @Column(name = "frequency_days")
    private Integer frequencyDays;

    private Boolean active;
}