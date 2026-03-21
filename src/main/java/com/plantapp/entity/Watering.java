package com.plantapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "watering")
@Getter @Setter
public class Watering extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plant_id")
    private Integer plantId;

    private String frequency;

    @Column(name = "water_amount")
    private String waterAmount;

    @Column(name = "seasonal_adjustments")
    private String seasonalAdjustments;

    private String notes;
}