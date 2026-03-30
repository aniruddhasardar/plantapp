package com.plantapp.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PlantImageDTO {
    private Integer id;
    private Integer plantId;
    private String imageUrl;
    private Boolean isPrimary;
}
