package com.plantapp.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlantDTO {
    private Integer id;
    private String commonName;
    private String scientificName;
    private String plantType;
    private String family;
}