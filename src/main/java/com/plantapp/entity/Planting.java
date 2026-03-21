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
@Table(name = "planting")
@Getter @Setter
public class Planting extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plant_id")
    private Integer plantId;

    @Column(name = "propagation_method")
    private String propagationMethod;

    @Column(name = "planting_season")
    private String plantingSeason;

    private String spacing;
    private String depth;

    @Column(name = "germination_time")
    private Integer germinationTime;
}