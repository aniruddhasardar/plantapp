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
@Table(name = "harvest")
@Getter @Setter
public class Harvest extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plant_id")
    private Integer plantId;

    @Column(name = "harvest_time_days")
    private Integer harvestTimeDays;

    @Column(name = "harvest_season")
    private String harvestSeason;

    @Column(name = "yield_per_plant")
    private String yieldPerPlant;

    @Column(name = "harvest_method")
    private String harvestMethod;
}